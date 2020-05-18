package com.alipay.api.internal.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.codec.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 证书文件可信校验
 *
 * @author junying.wjy
 * @version $Id: AntCertificationUtil.java, v 0.1 2019-07-29 下午04:46 junying.wjy Exp $
 */
public class AntCertificationUtil {

    private static BouncyCastleProvider provider;

    static {
        provider = new BouncyCastleProvider();
        Security.addProvider(provider);
    }

    /**
     * 验证证书的是否可信
     *
     * @param cert            需要验证的目标证书或者证书链
     * @param rootCertContent 可信根证书列表
     */
    public static boolean isTrusted(String cert, String rootCertContent) {
        X509Certificate[] certificates;
        try {
            certificates = readPemCertChain(cert);
        } catch (Exception e) {
            AlipayLogger.logBizError(("读取证书失败"));
            throw new RuntimeException(e);
        }

        List<X509Certificate> rootCerts = new ArrayList<X509Certificate>();
        try {
            X509Certificate[] certs = readPemCertChain(rootCertContent);
            for (X509Certificate c : certs) {
                rootCerts.add(c);
            }
        } catch (Exception e) {
            AlipayLogger.logBizError(("读取根证书失败"));
            throw new RuntimeException(e);
        }

        boolean result = verifyCertChain(certificates, rootCerts.toArray(new X509Certificate[rootCerts.size()]));
        return result;
    }

    /**
     * 验证证书是否是信任证书库中证书签发的
     *
     * @param cert      目标验证证书
     * @param rootCerts 可信根证书列表
     * @return 验证结果
     */
    private static boolean verifyCert(X509Certificate cert, X509Certificate[] rootCerts) {
        try {
            cert.checkValidity();
        } catch (CertificateExpiredException e) {
            AlipayLogger.logBizError(("证书已经过期"));
            return false;
        } catch (CertificateNotYetValidException e) {
            AlipayLogger.logBizError(("证书未激活"));
            return false;
        }

        Map<Principal, X509Certificate> subjectMap = new HashMap<Principal, X509Certificate>();

        for (X509Certificate root : rootCerts) {
            subjectMap.put(root.getSubjectDN(), root);
        }

        Principal issuerDN = cert.getIssuerDN();
        X509Certificate issuer = subjectMap.get(issuerDN);
        if (issuer == null) {
            AlipayLogger.logBizError(("证书链验证失败"));
            return false;
        }
        try {
            PublicKey publicKey = issuer.getPublicKey();
            verifySignature(publicKey, cert);
        } catch (Exception e) {
            AlipayLogger.logBizError(("证书链验证失败"));
            return false;
        }
        return true;
    }

    /**
     * 验证证书链是否是信任证书库中证书签发的
     *
     * @param certs     目标验证证书列表
     * @param rootCerts 可信根证书列表
     * @return 验证结果
     */
    private static boolean verifyCertChain(X509Certificate[] certs, X509Certificate[] rootCerts) {
        boolean sorted = sortByDn(certs);
        if (!sorted) {
            AlipayLogger.logBizError(("证书链验证失败：不是完整的证书链"));
            return false;
        }

        //先验证第一个证书是不是信任库中证书签发的
        X509Certificate prev = certs[0];
        boolean firstOK = verifyCert(prev, rootCerts);
        if (!firstOK || certs.length == 1) {
            return firstOK;
        }

        //验证证书链
        for (int i = 1; i < certs.length; i++) {
            try {
                X509Certificate cert = certs[i];
                try {
                    cert.checkValidity();
                } catch (CertificateExpiredException e) {
                    AlipayLogger.logBizError(("证书已经过期"));
                    return false;
                } catch (CertificateNotYetValidException e) {
                    AlipayLogger.logBizError(("证书未激活"));
                    return false;
                }
                verifySignature(prev.getPublicKey(), cert);
                prev = cert;
            } catch (Exception e) {
                AlipayLogger.logBizError(("证书链验证失败"));
                return false;
            }
        }

        return true;
    }

    private static void verifySignature(PublicKey publicKey, X509Certificate cert)
            throws NoSuchProviderException, CertificateException, NoSuchAlgorithmException, InvalidKeyException,
            SignatureException {
        cert.verify(publicKey, provider.getName());
    }

    /**
     * 将证书链按照完整的签发顺序进行排序，排序后证书链为：[issuerA, subjectA]-[issuerA, subjectB]-[issuerB, subjectC]-[issuerC, subjectD]...
     *
     * @param certs 证书链
     * @return true：排序成功，false：证书链不完整
     */
    private static boolean sortByDn(X509Certificate[] certs) {
        //主题和证书的映射
        Map<Principal, X509Certificate> subjectMap = new HashMap<Principal, X509Certificate>();
        //签发者和证书的映射
        Map<Principal, X509Certificate> issuerMap = new HashMap<Principal, X509Certificate>();
        //是否包含自签名证书
        boolean hasSelfSignedCert = false;

        for (X509Certificate cert : certs) {
            if (isSelfSigned(cert)) {
                if (hasSelfSignedCert) {
                    return false;
                }
                hasSelfSignedCert = true;
            }

            Principal subjectDN = cert.getSubjectDN();
            Principal issuerDN = cert.getIssuerDN();

            subjectMap.put(subjectDN, cert);
            issuerMap.put(issuerDN, cert);
        }

        List<X509Certificate> certChain = new ArrayList<X509Certificate>();

        X509Certificate current = certs[0];
        addressingUp(subjectMap, certChain, current);
        addressingDown(issuerMap, certChain, current);

        //说明证书链不完整
        if (certs.length != certChain.size()) {
            return false;
        }

        //将证书链复制到原先的数据
        for (int i = 0; i < certChain.size(); i++) {
            certs[i] = certChain.get(i);
        }
        return true;
    }

    /**
     * 验证证书是否是自签发的
     *
     * @param cert 目标证书
     * @return true；自签发，false；不是自签发
     */
    private static boolean isSelfSigned(X509Certificate cert) {
        return cert.getSubjectDN().equals(cert.getIssuerDN());
    }

    /**
     * 向上构造证书链
     *
     * @param subjectMap 主题和证书的映射
     * @param certChain  证书链
     * @param current    当前需要插入证书链的证书，include
     */
    private static void addressingUp(final Map<Principal, X509Certificate> subjectMap, List<X509Certificate> certChain,
                                     final X509Certificate current) {
        certChain.add(0, current);
        if (isSelfSigned(current)) {
            return;
        }
        Principal issuerDN = current.getIssuerDN();
        X509Certificate issuer = subjectMap.get(issuerDN);
        if (issuer == null) {
            return;
        }
        addressingUp(subjectMap, certChain, issuer);
    }

    /**
     * 向下构造证书链
     *
     * @param issuerMap 签发者和证书的映射
     * @param certChain 证书链
     * @param current   当前需要插入证书链的证书，exclude
     */
    private static void addressingDown(final Map<Principal, X509Certificate> issuerMap, List<X509Certificate> certChain,
                                       final X509Certificate current) {
        Principal subjectDN = current.getSubjectDN();
        X509Certificate subject = issuerMap.get(subjectDN);
        if (subject == null) {
            return;
        }
        if (isSelfSigned(subject)) {
            return;
        }
        certChain.add(subject);
        addressingDown(issuerMap, certChain, subject);
    }

    private static X509Certificate[] readPemCertChain(String cert) throws CertificateException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(cert.getBytes());
        CertificateFactory factory = CertificateFactory.getInstance("X.509", provider);
        Collection<? extends Certificate> certificates = factory.generateCertificates(inputStream);
        return (X509Certificate[]) certificates.toArray(new X509Certificate[certificates.size()]);
    }

    /**
     * 获取根证书序列号
     *
     * @param rootCertContent
     * @return
     */
    public static String getRootCertSN(String rootCertContent) {
        String rootCertSN = null;
        try {
            X509Certificate[] x509Certificates = readPemCertChain(rootCertContent);
            MessageDigest md = MessageDigest.getInstance("MD5");
            for (X509Certificate c : x509Certificates) {
                if (c.getSigAlgOID().startsWith("1.2.840.113549.1.1")) {
                    md.update((c.getIssuerX500Principal().getName() + c.getSerialNumber()).getBytes());
                    String certSN = new BigInteger(1, md.digest()).toString(16);
                    //BigInteger会把0省略掉，需补全至32位
                    certSN = fillMD5(certSN);
                    if (StringUtils.isEmpty(rootCertSN)) {
                        rootCertSN = certSN;
                    } else {
                        rootCertSN = rootCertSN + "_" + certSN;
                    }
                }

            }
        } catch (Exception e) {
            AlipayLogger.logBizError(("提取根证书失败"));
        }
        return rootCertSN;

    }

    /**
     * 获取根证书序列号
     *
     * @param rootCertContent
     * @return
     */
    public static String getRootCertSN(String rootCertContent, String signType) {
        if (AlipayConstants.SIGN_TYPE_SM2.equals(signType)) {
            String rootCertSN = null;
            try {
                X509Certificate[] x509Certificates = readPemCertChain(rootCertContent);
                MessageDigest md = MessageDigest.getInstance("MD5");
                for (X509Certificate c : x509Certificates) {
                    if (c.getSigAlgOID().startsWith("1.2.156.10197.1.501")) {
                        md.update((c.getIssuerX500Principal().getName() + c.getSerialNumber()).getBytes());
                        String certSN = new BigInteger(1, md.digest()).toString(16);
                        //BigInteger会把0省略掉，需补全至32位
                        certSN = fillMD5(certSN);
                        if (StringUtils.isEmpty(rootCertSN)) {
                            rootCertSN = certSN;
                        } else {
                            rootCertSN = rootCertSN + "_" + certSN;
                        }
                    }
                }
            } catch (Exception e) {
                AlipayLogger.logBizError(("提取根证书失败"));
            }
            return rootCertSN;

        } else {
            return getRootCertSN(rootCertContent);
        }

    }

    private static String fillMD5(String md5) {
        return md5.length() == 32 ? md5 : fillMD5("0" + md5);
    }

    /**
     * @param certPath 证书路径
     * @return
     * @throws AlipayApiException
     */
    public static X509Certificate getCertFromPath(String certPath) throws AlipayApiException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(certPath);
            CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
            return (X509Certificate) cf.generateCertificate(inputStream);
        } catch (Exception e) {
            throw new AlipayApiException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AlipayApiException(e);
            }
        }
    }

    public static X509Certificate getCertFromContent(String certContent) throws AlipayApiException {
        try {
            InputStream inputStream = new ByteArrayInputStream(certContent.getBytes());
            CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
            return (X509Certificate) cf.generateCertificate(inputStream);
        } catch (Exception e) {
            throw new AlipayApiException(e);
        }
    }

    public static String getCertSN(X509Certificate cf) throws AlipayApiException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((cf.getIssuerX500Principal().getName() + cf.getSerialNumber()).getBytes());
            String certSN = new BigInteger(1, md.digest()).toString(16);
            //BigInteger会把0省略掉，需补全至32位
            certSN = fillMD5(certSN);
            return certSN;
        } catch (NoSuchAlgorithmException e) {
            throw new AlipayApiException(e);
        }
    }

    public static String getAlipayPublicKey(String alipayPublicCertPath) throws AlipayApiException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(alipayPublicCertPath);
            CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(inputStream);
            PublicKey publicKey = cert.getPublicKey();
            return Base64.encodeBase64String(publicKey.getEncoded());
        } catch (NoSuchProviderException e) {
            throw new AlipayApiException(e);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        } catch (CertificateException e) {
            throw new AlipayApiException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AlipayApiException(e);
            }
        }
    }
}
