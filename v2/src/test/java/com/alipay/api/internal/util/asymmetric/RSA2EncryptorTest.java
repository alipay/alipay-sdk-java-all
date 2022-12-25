/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.StringUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author junying
 * @version : RSA2EncryptorTest.java, v 0.1 2019年12月20日 17:18 junying Exp $
 */
public class RSA2EncryptorTest {
    private IAsymmetricEncryptor encryptor = new RSA2Encryptor();

    private static final String RSA2_PublicKey
            = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmeSS5CuS2TVihjixfsRSawDDa1U+X5x"
            + "/7lH0dpNY0snXZA0zCvTn4MMq0rRkAz6uMsOeRnsRdcRdSpaZZ6kNQWXBEE1xtsPewzK2uNlNRfi4vC0FdqwOGeZMzPU5jx67cg4FP6uNu9IS"
            + "/LpUZJgjGHXLJW9r/H7axi6DNs1hLUBOpBACB5PYZNqcsMs0mhgfTK6rZCylmIwfuGwLkvOBB0Iiq4KABs2FO7aZX0epr2q66JOtyuw0KreMzi4"
            + "/0MjVc78REcQs+fXM5rHzuIS1HTW1hamnv1tI2gG3oW3MyN+nsxyHYWJCfeADhtvjOLrvjbR8RhLkaNy2+4xKmaqt4QIDAQAB";

    private static final String RSA2_PrivateKey
            = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCZ5JLkK5LZNWKGOLF+xFJrAMNrVT5fnH"
            + "/uUfR2k1jSyddkDTMK9OfgwyrStGQDPq4yw55GexF1xF1KlplnqQ1BZcEQTXG2w97DMra42U1F+Li8LQV2rA4Z5kzM9TmPHrtyDgU"
            + "/q4270hL8ulRkmCMYdcslb2v8ftrGLoM2zWEtQE6kEAIHk9hk2pywyzSaGB9MrqtkLKWYjB+4bAuS84EHQiKrgoAGzYU7tplfR6mvarrok63K7DQqt4zOLj"
            + "/QyNVzvxERxCz59czmsfO4hLUdNbWFqae/W0jaAbehbczI36ezHIdhYkJ94AOG2+M4uu+NtHxGEuRo3Lb7jEqZqq3hAgMBAAECggEAGwLaoX"
            + "/ga42KOILU7KoqySs+IaW5p/CBJ+Rsoy9jpMPWsXH7po2r8XBwIMGW2Fb1HmXlbvuE6gXIViIu1NoAQJ1KkMD3F5wzilFpbvJ9NK3eRvEkB1tVskgQ7NyR"
            + "+MPtJKy/URicbP4HZSKTU4C8kDuEp5JyAsSFQ8nAMCtGRjm++IvMxfytck8WndK20di7P5hYhRr0wpqem8jP5cf8KKj7uch/bqmDHg0cnQa8rCG4HMoLNeR8O"
            + "/tLo59tjAAlw+0H386Qe1vovOmDSPlGw4TmwgKlPgZJCL9NYXStQjdo+cb7Syvks1wSdybVwu2DEcEnE/+Rwcl4fXqg4Qj6vQKBgQD3HQNoB/M0b4YMYpPHVRu"
            + "+g3HjzEyRZxLdiVvcHSdYE9RBl0xVVHIK9+Vvn6mxWol2IvKTaP7nZplvN/qSmXt4aUphSlOMwPPU/omIj6xnFBrrsFRpuDr0Bv"
            + "/xQV7kllDtnd39XuxHw8OAZZnIg7jZ1ql"
            +
            "/TPJmy5JoWH0YIhpQxwKBgQCfbVmHu1x2q2jLkp8IOBDOXN1CJFEBCpudmUFJgfONgdYRn1hj6THuqyoaDjyFll4uTikgQmBERsmfHO66BoDvApqz5l1eaonsI05nUiNJuP5t5k37RR3+Rgku2Iu99bKCPakSkDL+l//aAjpcivZVjxFhDQIvSnle1vpQXPM0FwKBgBq52JR3x6X0KdtNDg6Q9d80+Cxa/Cz9qNys7nJv9MFh46L0ah0QdQUaqoXYDtJPqG5OeU3YHTmJry6IL2GLl/795D2BfGfMtpJitR0/7LV5RzAWcgq9EiMyXpwJJeozF62bVVcB3Swl0A8i7e7x0Bw/SzWpbM4RVlRSvbTOe2ohAoGAKhRgtzS62Q+xH1pZ43944B8ev2B6iP3VySk0VESallUYvZoDaIuahFZlTG9JhjEENtCmhj8+zYapnPe0AyHIUk2rq6Q4LL2OHefLv/WsHr9XWIabOqEpo3202sqJR+Bb94hy4dVxwEU6YL6JzPdYwYh7m9QlKXpMwr2XYDLIdo0CgYBA0dOk3jaycvkHlnsjNFXNyjinKApqN4uyVaq1ybE2p6irv40oOc0cLeD8pUMbPsYwkPFikQTEcTjmTnQbJxftNz8O3yK+SBs423wJppbP/ohqd+TojR3YyMVEXz9C+U+osqg/ezk1zALF6NV1xUnbsCvtOuR2Avz6F+7AqDw0XQ==";

    @Test
    public void should_pass_verify_when_sign_is_self_generated() throws AlipayApiException {
        //given
        String content = getTestContent();
        String sign = encryptor.sign(content, "UTF-8", RSA2_PrivateKey);

        //when
        Boolean success = encryptor.verify(content, "UTF-8", RSA2_PublicKey, sign);

        //then
        assertThat(success, is(true));
    }

    private String getTestContent() {
        return StringUtils.leftPad("test", 5000, "测试");
    }

    @Test
    public void should_return_same_content_after_encrypt_and_decrypt() throws AlipayApiException {
        //given
        String source = getTestContent();
        String cipherTextBase64 = encryptor.encrypt(source, "UTF-8", RSA2_PublicKey);

        //when
        String target = encryptor.decrypt(cipherTextBase64, "UTF-8", RSA2_PrivateKey);

        //then
        assertThat(target, is(getTestContent()));
    }

}