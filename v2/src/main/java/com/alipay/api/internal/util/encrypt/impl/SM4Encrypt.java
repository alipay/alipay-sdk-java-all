package com.alipay.api.internal.util.encrypt.impl;

import com.alipay.api.internal.util.encrypt.Encrypt;
import com.alipay.api.AlipayApiErrorEnum;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.codec.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.security.Security;

/**
 * @author zts
 * @version : SM4Encrypt.java, v 0.1 2022年01月10日 7:54 PM zts Exp $
 */
public class SM4Encrypt implements Encrypt {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static final String PROVIDER_NAME = "BC";
    private static final Charset CIPHER_CHARSET = Charset.forName("UTF-8");

    private static final String SLASH = "/";
    private static final String ALG = "SM4";
    private static final String MODE = "GCM";
    private static final String PADDING = "NoPadding";
    private static final int IV_SIZE = 16;

    private final String fullCipherName;

    /**
     * constructor
     */
    public SM4Encrypt() {
        this.fullCipherName = ALG + SLASH + MODE + SLASH + PADDING;
    }

    @Override
    public String encrypt(String content, String key, String charset) throws AlipayApiException {
        try {
            Cipher cipher = Cipher.getInstance(fullCipherName, PROVIDER_NAME);

            //init iv
            byte[] iv = new byte[IV_SIZE];
            SecureRandom random = new SecureRandom();
            random.nextBytes(iv);
            IvParameterSpec ivParams = new IvParameterSpec(iv);

            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(key.getBytes()), ALG), ivParams);

            byte[] encryptedText = cipher.doFinal(content.getBytes(charset));
            byte[] ivAndEncryptedText = new byte[IV_SIZE + encryptedText.length];

            System.arraycopy(iv, 0, ivAndEncryptedText, 0, IV_SIZE);
            System.arraycopy(encryptedText, 0, ivAndEncryptedText, IV_SIZE, encryptedText.length);
            return new String(Base64.encodeBase64(ivAndEncryptedText), CIPHER_CHARSET);
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.ENCRYPT_SM4_ERROR.getErrMsg(),
                    content, charset), e);        }
    }

    @Override
    public String decrypt(String content,String aesKey, String charset) throws AlipayApiException {
        try {
            byte[] ivAndEncryptedText = Base64.decodeBase64(content.getBytes(CIPHER_CHARSET));

            Cipher cipher = Cipher.getInstance(fullCipherName, PROVIDER_NAME);

            IvParameterSpec ivParameterSpec = new IvParameterSpec(ivAndEncryptedText, 0, IV_SIZE);

            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes()), ALG), ivParameterSpec);

            byte[] cleanBytes = cipher.doFinal(ivAndEncryptedText, IV_SIZE, ivAndEncryptedText.length - IV_SIZE);
            return new String(cleanBytes, charset);
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.DECRYPT_SM4_ERROR.getErrMsg(),
                    content, charset), e);        }
    }

    /**
     * getter for property alg
     *
     * @return
     */
    public static String getAlg() {
        return ALG;
    }

    /**
     * getter for property mode
     *
     * @return
     */
    public String getMode() {
        return MODE;
    }

    /**
     * getter for property padding
     *
     * @return
     */
    public String getPadding() {
        return PADDING;
    }

    /**
     * getter for property fullCipherName
     *
     * @return
     */
    public String getFullCipherName() {
        return fullCipherName;
    }

}
