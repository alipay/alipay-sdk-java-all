/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipaySignature;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 注意：本单元测试中使用的是商户私钥（因为拿不到支付宝私钥）签名后的参数进行测试，所以验签时指定的是商户的公钥证书。
 * <p>
 * 实际使用RSACheck系列函数时，应该是指定支付宝公钥证书，对支付宝私钥签名后的参数进行验签
 *
 * @author zhongyu
 * @version $Id: RSACheckTest.java, v 0.1 2019年09月17日 下午5:38 zhongyu Exp $
 */
public class CertificateRSACheckTest {

    @Test
    public void should_pass_rsa_check_when_sign_type_is_rsa() throws AlipayApiException {
        //given
        Map<String, String> parameters = new HashMap<String, String>() {};
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("sign_type", "RSA");
        parameters.put("sign",
                "a5NeWetvFNFg5EyjQ8UAxMHlih5kOAv7s33K+J5KBi9Gq2GTMj5EwOScPcHy2HFAMcRvHmc4pM8HG4Mj89OxNwfKPqR27TEMM0Sy2PdKqL5d5mPdabVtgB82htfcEofiHUdq99AzTyZOFJuj4XIm8cmHr4p4MrUdGOMnLNxvq9tG58ADCRvxmUqx99MbFHm5nmh8xHZ0oULBzxttMVQRwniY0oZzncJVX8UwdcQWJp+xhXUnRkrx0IU/ZLmLXQHcV2r0flka3KeXY9DthwB/gdomYvTTaPo+Aw8TxG230Q3Es6AT/QuOujuEGaHzA4oYchWLxTVUzeRcJBRmGzmLXA==");
        //when
        boolean result = AlipaySignature.rsaCertCheckV2(parameters, TestAccount.ProdCert.getConfig().getAppCertPath(), "utf-8", "RSA");
        //then
        assertThat(result, is(true));
    }

    @Test
    public void should_pass_rsa_check_when_sign_type_is_rsa2() throws AlipayApiException {
        //given
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("sign_type", "RSA2");
        parameters.put("sign",
                "NQHIJKRCoCJCUXqzzK8WUtA/58m4/e3NGLutUFxFUD8udlauzRCgCINxDqs3atXrJ8KeSxpf8IU8nrnK7qzCQiYdj2XjfkXDrZllPEXlrelHitj9qpPqMXlAbP1HArNlBTpaGmq6hwvf/W50O/8kOjPEpmdpFcYZrlR/aA3uwdiOXHGNfd6p2wA7JjHiLQtPXGVm2oLLp+HDEtdhqxs66Br4bTQZPrQNKJrhqRcqwTzA5ZyDMQK724ECTYBI/+8PEvFCpi4Ny6piO78clFE/bSAuKCdhbivBzWDYkvmQymq0M86W3usljVENbnOyBatl7/y4f7S53Ht/yBmO/f+gYg==");
        //when
        boolean result = AlipaySignature.rsaCertCheckV2(parameters, TestAccount.ProdCert.getConfig().getAppCertPath(), "utf-8", "RSA2");
        //then
        assertThat(result, is(true));
    }

    @Test
    public void should_pass_rsa_check_when_charset_is_utf8() throws AlipayApiException {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("extra", "中文测试");
        parameters.put("sign_type", "RSA2");
        parameters.put("sign",
                "LhPRG5h6xo8Pk1tFIbiCt2S81S3jvDs5is9yO8uH87kVY0vpnOuxGgauKim9SnFGGxGmhQY4TJSrASlW6NsML2qIaxqsSFTNVUbct7MgdBBKqkoORNOq1gpLIymyI+G88qDaodOXkEAtUNYm4I6r1wkJVvdumrmRoHg8GcLpP//3J3hNELIJB2SC5SJ2pe4als+Psmjpd5xyK/qgDXf2qTmBooA0z673xqxjtd8H1FBlUCnGmTG3ClnGatmfjxIL0HF+PLyrmqzDO8UOjod0Kh2SwxH7zQikhr4VUihQ04MrP08nsGKjIPvZFAZiW7dnchVr4I/Tid0cbuthjmoWyw==");

        boolean result = AlipaySignature.rsaCertCheckV2(parameters, TestAccount.ProdCert.getConfig().getAppCertPath(), "utf-8", "RSA2");

        assertThat(result, is(true));
    }
}