/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.internal.util.file.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhongyu
 * @version $Id: TestAccount.java, v 0.1 2019年09月05日 上午11:32 zhongyu Exp $
 */
public class TestAccount {
    public static final String NOT_SET_KEY_APP_ID = "2019092567661029";

    public static class Sandbox {
        public static final String GATEWAY = "https://openapi.alipaydev.com/gateway.do";

        public static final String UNTRUSTED_GATEWAY = "https://121.0.26.96/gateway.do";

        public static final String ALIPAY_PUBLICKEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAohmWF9HXjI3VRxrKbuZq4YK6lIFAIzUZ4xvY4iw2zwYiblPkB0FWbqxouyyB9nmAyK+hN/5tyXatpskcy6rO6zJl3kfdog0lRA7g06+YpdHVHhu/bXfaz+BfCA3YHwjkBQffMa8Amwy6JZF6aDiXDdYP/YWKmFk1t4K6F1853EDf2vYsT6AsVYRk2xkw+fx3/qIWaidHETjNBnOOPRG68hLf0H0DCeEOsLp3mFox2LARRQol5IfV45nNq2a2zb6ubwZbgXypZM3vfLQekUaxAaC1Vuu4gYWxPRCzHE1e6aQpEuacVVYCnjNURvDmDpT7oMzh+HtN0DKCe6yOHRDZ3QIDAQAB";

        public static final String APP_ID = "2016102200737202";

        public static final String APP_PRIVATE_KEY = getPrivateKey("Sandbox");

        public static final String AES_KEY = "RrAdgyCsnkoE1a9A8cW72w==";
    }

    public static class DevLoadTest {
        public static final String GATEWAY = "http://openapi.stable.alipay.net/gateway.do";

        public static final String ALIPAY_PUBLICKEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wM"
                + "Qmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsef"
                + "Wo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

        public static final String APPID = "2021000100600007";

        public static final String APP_PRIVATE_KEY = getPrivateKey("DevLoadTest");
    }

    public static class ProdCert {
        public static final String GATEWAY = "https://openapi.alipay.com/gateway.do";

        public static final String APP_ID = "2019091767145019";

        public static final String APP_PRIVATE_KEY = getPrivateKey("ProdCert");

        public static final CertAlipayRequest CERT_PARAMS = getCertParams();

        public static CertAlipayRequest getCertParams() {
            CertAlipayRequest certParams = new CertAlipayRequest();
            certParams.setServerUrl(TestAccount.ProdCert.GATEWAY);
            certParams.setAppId(TestAccount.ProdCert.APP_ID);
            certParams.setPrivateKey(TestAccount.ProdCert.APP_PRIVATE_KEY);
            certParams.setFormat("json");
            certParams.setCharset("utf-8");
            certParams.setSignType("RSA2");
            certParams.setCertPath("src/test/resources/fixture/appCertPublicKey_2019091767145019.crt");
            certParams.setAlipayPublicCertPath("src/test/resources/fixture/alipayCertPublicKey_RSA2.crt");
            certParams.setRootCertPath("src/test/resources/fixture/alipayRootCert.crt");
            return certParams;
        }
    }

    public static class ProdLife {
        public static final String GATEWAY = "https://openfile.alipay.com/chat/multimedia.do";

        public static final String APP_ID = "2019051064521003";

        public static final String APP_PRIVATE_KEY = getPrivateKey("ProdLife");
    }

    public static class DevSM2Cert {
        public static final String GATEWAY = "http://openapi-ztt-1.gz00b.dev.alipay.net/gateway.do";

        public static final String APP_ID = "2021000146613340";

        public static final String APP_PRIVATE_KEY = getPrivateKey("DevSM2Cert");

        public static final CertAlipayRequest SM2_CERT_PARAMS = getSM2CertParams();

        public static CertAlipayRequest getSM2CertParams() {
            CertAlipayRequest certParams = new CertAlipayRequest();
            certParams.setServerUrl(DevSM2Cert.GATEWAY);
            certParams.setAppId(DevSM2Cert.APP_ID);
            certParams.setPrivateKey(DevSM2Cert.APP_PRIVATE_KEY);
            certParams.setFormat("json");
            certParams.setCharset("GBK");
            certParams.setSignType("SM2");
            certParams.setCertPath("src/test/resources/fixture/appCertPublicKey_2021000146613340_SM2.crt");
            certParams.setAlipayPublicCertPath("src/test/resources/fixture/alipayCertPublicKey_SM2.crt");
            certParams.setRootCertPath("src/test/resources/fixture/alipayRootCert_SM2.crt");
            return certParams;
        }
    }

    public static class DevSM2 {
        public static final String GATEWAY = "http://openapi-ztt-1.gz00b.dev.alipay.net/gateway.do";

        public static final String ALIPAY_PUBLIC_KEY = "MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAE7oZrr9paKyUq9zbFwoqNKJ0kr+w5/AszLFPm7"
                + "38GZksKQmIqBHlbuR6yXQ25tQlhL/L28f536re3UkLsDhVcdA==";

        public static final String APP_ID = "2021000146614327";

        public static final String AES_KEY = "Cn0fll653X1S1zom0/bL5A==";

        public static final String APP_PRIVATE_KEY = getPrivateKey("DevSM2");
    }

    /**
     * 从文件中读取私钥
     * <p>
     * 注意：实际开发过程中，请务必注意不要将私钥信息配置在源码中（比如配置为常量或储存在配置文件的某个字段中等），因为私钥的保密等级往往比源码高得多，将会增加私钥泄露的风险。推荐将私钥信息储存在专用的私钥文件中，
     * 将私钥文件通过安全的流程分发到服务器的安全储存区域上，仅供自己的应用运行时读取。
     * <p>
     * 此处为了单元测试执行的环境普适性，私钥文件配置在resources资源下，实际过程中请不要这样做。
     *
     * @param key 私钥对应的Key
     * @return 私钥字符串
     */
    private static String getPrivateKey(String key) {
        try {
            InputStream stream = TestAccount.class.getResourceAsStream("/fixture/privateKey.json");
            JSONObject jsonObject = JSON.parseObject(IOUtils.toString(stream, "utf-8"));
            return jsonObject.getString(key);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}