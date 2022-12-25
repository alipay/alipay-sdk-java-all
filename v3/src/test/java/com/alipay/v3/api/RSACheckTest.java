/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.v3.api;

import com.alipay.v3.ApiException;
import com.alipay.v3.util.AlipaySignature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongyu
 * @version $Id: RSACheckTest.java, v 0.1 2019年09月23日 下午2:02 zhongyu Exp $
 */
public class RSACheckTest {
    private String publicKey;

    private String privateKey;

    @BeforeEach
    public void setUp(){
        this.publicKey = AlipaySignature.getAlipayPublicKey("src/test/resources/fixture/appCertPublicKey_2021003126695331.crt");
        this.privateKey = "";
    }

    @Test
    public void should_pass_rsa_check_when_sign_type_is_rsa2() throws ApiException {
        //given
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("sign_type", "RSA2");
        parameters.put("sign",
                "NQHIJKRCoCJCUXqzzK8WUtA/58m4/e3NGLutUFxFUD8udlauzRCgCINxDqs3atXrJ8KeSxpf8IU8nrnK7qzCQiYdj2XjfkXDrZllPEXlrelHitj9qpPqMXlAbP1HArNlBTpaGmq6hwvf/W50O/8kOjPEpmdpFcYZrlR/aA3uwdiOXHGNfd6p2wA7JjHiLQtPXGVm2oLLp+HDEtdhqxs66Br4bTQZPrQNKJrhqRcqwTzA5ZyDMQK724ECTYBI/+8PEvFCpi4Ny6piO78clFE/bSAuKCdhbivBzWDYkvmQymq0M86W3usljVENbnOyBatl7/y4f7S53Ht/yBmO/f+gYg==");
        //when
        boolean result = AlipaySignature.verifyV2(parameters, publicKey, "utf-8", "RSA2");
        //then
        System.out.println(result);
    }

    @Test
    public void should_pass_rsa_check_when_charset_is_utf8() throws ApiException {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("extra", "中文测试");
        parameters.put("sign_type", "RSA2");
        parameters.put("sign",
                "LhPRG5h6xo8Pk1tFIbiCt2S81S3jvDs5is9yO8uH87kVY0vpnOuxGgauKim9SnFGGxGmhQY4TJSrASlW6NsML2qIaxqsSFTNVUbct7MgdBBKqkoORNOq1gpLIymyI+G88qDaodOXkEAtUNYm4I6r1wkJVvdumrmRoHg8GcLpP//3J3hNELIJB2SC5SJ2pe4als+Psmjpd5xyK/qgDXf2qTmBooA0z673xqxjtd8H1FBlUCnGmTG3ClnGatmfjxIL0HF+PLyrmqzDO8UOjod0Kh2SwxH7zQikhr4VUihQ04MrP08nsGKjIPvZFAZiW7dnchVr4I/Tid0cbuthjmoWyw==");

        boolean result = AlipaySignature.rsaCheckV2(parameters, publicKey, "utf-8", "RSA2");

        System.out.println(result);
    }

    @Test
    public void should_pass_rsa_check_when_key_value_is_empty() throws ApiException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("method","koubei.marketing.data.indicator.query");
        params.put("app_id", "2019090366875133");
        params.put("", "test");
        params.put("test", null);
        String sign = AlipaySignature.sign(params, privateKey,"uTF-8","RSA2");
        //given
//        params.put("sign_type", "RSA2");
        params.put("sign",sign);
        //when
        boolean result = AlipaySignature.verifyV2(params, publicKey, "Utf-8", "rsa2");
        //then
        System.out.println(result);
    }

    @Test
    public void encrypt_and_decrypt() throws ApiException {
        String content = AlipaySignature.encrypt("testtesttest\n测试测试", publicKey, "utf-8", "RSA2");
        System.out.println(content);

        String result = AlipaySignature.decrypt(content, privateKey, "utf-8", "RSA2");
        System.out.println(result);
    }
}