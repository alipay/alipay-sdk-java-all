/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.StringUtils;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author junying
 * @version : SM2EncryptorTest.java, v 0.1 2019年12月20日 17:18 junying Exp $
 */
public class SM2EncryptorTest {

    private IAsymmetricEncryptor encryptor = new SM2Encryptor();

    private static final String SM2_PUBLIC_KEY
            = "MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAENk2jhg4vRHCPcpgGDeiDNvMP0ntRpA209iQYA5Z/Mb72m"
            + "++jmPWmNw31Q7I85rw7HfBGkDyfLQPNxTlS435ieQ==";

    private static final String SM2_PRIVATE_KEY
            = "MIGHAgEAMBMGByqGSM49AgEGCCqBHM9VAYItBG0wawIBAQQgwcEhrXjosxdzQ9hmjaQwo21jwoiep2lZaKF"
            + "Gc1pV0tKhRANCAAQ2TaOGDi9EcI9ymAYN6IM28w"
            + "/Se1GkDbT2JBgDln8xvvab76OY9aY3DfVDsjzmvDsd8EaQPJ8tA83FOVLjfmJ5";

    @Test
    public void should_pass_verify_when_sign_is_self_generated() throws AlipayApiException {
        //given
        String content = getTestContent();
        String sign = encryptor.sign(content, "utf-8", SM2_PRIVATE_KEY);

        //when
        Boolean success = encryptor.verify(content, "utf-8", SM2_PUBLIC_KEY, sign);

        //then
        assertThat(success, is(true));
    }

    @Test
    public void should_return_same_content_after_encrypt_and_decrypt() throws AlipayApiException {
        //given
        String source = getTestContent();
        String cipherTextBase64 = encryptor.encrypt(source, "utf-8", SM2_PUBLIC_KEY);

        //when
        String target = encryptor.decrypt(cipherTextBase64, "utf-8", SM2_PRIVATE_KEY);

        //then
        assertThat(target, is(getTestContent()));
    }

    private String getTestContent() {
        return StringUtils.leftPad("test", 5000, "测试");
    }
}