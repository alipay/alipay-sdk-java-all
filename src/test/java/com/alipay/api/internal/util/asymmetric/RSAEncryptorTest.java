/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.StringUtils;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author junying
 * @version : RSAEncryptorTest.java, v 0.1 2019年12月20日 17:18 junying Exp $
 */
public class RSAEncryptorTest {

    private IAsymmetricEncryptor encryptor = new RSAEncryptor();

    private static final String RSA_PUBLIC_KEY
            = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCJUyFMcvYDzraipXNyLWtu5zrpCLnTHIQ5lC4H9r"
            + "8uNkjMg4jJK6qW2zeyom0drNhk7hnFXiHj44rzfjNinNp2MH9wT6hTS4by27g06BsqiNBPvn/DdnWnRCsQFBUoF+tKrvbczSgJpauT7ij8aw"
            + "+AWS6w4pRA5Ww1p5izG7NWsQIDAQAB";

    private static final String RSA_PRIVATE_KEY
            = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAIlTIUxy9gPOtqKlc3Ita27nOukIudMch"
            + "DmULgf2vy42SMyDiMkrqpbbN7KibR2s2GTuGcVeIePjivN+M2Kc2nYwf3BPqFNLhvLbuDToGyqI0E"
            + "++f8N2dadEKxAUFSgX60qu9tzNKAmlq5PuKPxrD4BZLrDilEDlbDWnmLMbs1axAgMBAAECgYBaixg6etYgvowHA4Xx8"
            + "2aRkh5yhhFX08aO3FfZYmS9iIdJaTSoR4VLwDCiNJwzY8KuEZumWaGIy3/TehNRYtBa"
            + "+PFG3ZUdlLqqQfrtFUxSzqcJ8Ga7uDLTZdCvld08vtq7D3Qz1glAH11kq6rCZPSzE69wLq8Y9HvQBjwYw9DjwQJBAPxhGyV9XFVWgft8cT7UR+tyxhNrw3g0"
            + "/KSeizTgtgfjrhC+hcOgWKsYY0wb/wioKbKh1LgKGnXAusihyZ63QckCQQCLS3jRlgegw3qnPtIoLnJFJtcM52+P7MRtG6B7eu4"
            + "/7QL8JnDLkOilnB4sE0Tw8dDMRhyFu4hEwrr0gUVaTiGpAkASvB6oxMqS5y4U/iLl+Boypz1"
            + "++ZP0G3LZwY8x6LB6m3MzeQEzCXcrlE7iun1PJjSaNxs0YkOelCUJecEe0BnJAkBL8R+zlEogWbK7D8Lf6UKfdOd1v4"
            + "/RNdJ5ccBy0bim3X7tHcANG7na4FyKxw6lFhEx7V+LgYxvgIMQ3pGDBGnRAkBsVlQYthvoKbnv"
            + "+asi0ukgHeZ8iRIgQyXFK7HNxiQ1M8V6iAulxh9BhGYhj5uvKlxPvV6ZGBSVbKQLVLMivemx";

    @Test
    public void should_pass_verify_when_sign_is_self_generated() throws AlipayApiException {
        //given
        String content = getTestContent();

        //given
        String sign = encryptor.sign(content, "UTF-8", RSA_PRIVATE_KEY);

        //when
        Boolean success = encryptor.verify(content, "UTF-8", RSA_PUBLIC_KEY, sign);

        assertThat(success.toString(), true);
    }

    @Test
    public void should_return_same_content_after_encrypt_and_decrypt() throws AlipayApiException {
        //given
        String source = getTestContent();
        //given
        String cipherTextBase64 = encryptor.encrypt(source, "UTF-8", RSA_PUBLIC_KEY);

        //when
        String target = encryptor.decrypt(cipherTextBase64, "UTF-8", RSA_PRIVATE_KEY);

        assertThat(target, is(getTestContent()));
    }

    private String getTestContent() {
        return StringUtils.leftPad("test", 5000, "测试");
    }
}