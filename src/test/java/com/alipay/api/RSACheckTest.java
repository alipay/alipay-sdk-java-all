/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipaySignature;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: RSACheckTest.java, v 0.1 2019年09月23日 下午2:02 zhongyu Exp $
 */
public class RSACheckTest {
    private String publicKey;

    @Before
    public void setUp() throws Exception {
        //本单元测试中使用的是商户私钥（因为拿不到支付宝私钥）签名后的参数进行测试，所以验签时指定的是商户的公钥
        //实际使用RSACheck系列函数时，应该是指定支付宝公钥，对支付宝私钥签名后的参数进行验签
        this.publicKey = AlipaySignature.getAlipayPublicKey(TestAccount.ProdCert.CERT_PARAMS.getCertPath());
    }

    @Test
    public void should_pass_rsa_check_when_sign_type_is_rsa() throws AlipayApiException {
        //given
        Map<String, String> parameters = new HashMap<String, String>() {};
        parameters.put("method", "koubei.marketing.data.indicator.query");
        parameters.put("app_id", "2019090366875133");
        parameters.put("sign_type", "RSA");
        parameters.put("sign",
                "RkEZgdCVF4TF48+tVZlPLEUMgrOoff3TGynWtXRUmzMXxmsCX8Y9YtpZE+NNg/JGpYQ5htTDd8PXVqiG5fqvzE2g4ugDutr"
                        + "++BeQ2eJQ1uhasp6VIPTSAPWHRD7FSXqZfOoWvxeFHF9WGnzXw5eueOdGMZYXdjhR6srj+ZAeJxyR402FVNbRuI"
                        + "/hDZVq27xWi4CQ2ffdV0lf7E2V/HMUPXECbIKkTnLXrwJBmsLgTGbTDGf7pGo0y0rkRvdsg9BmPPswfTeq"
                        + "/o2rlxD0XxrK1MPZ4uSPFhpdWVEyNchtXEfKoVsaYeVXV3cMfZi9zcKc6RCE8ezF9LxRJp1R0BxKEg==");
        //when
        boolean result = AlipaySignature.rsaCheckV2(parameters, publicKey, "utf-8", "RSA");
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
                "JzoDc8VxY1/w6yN9WdWV10aipS3YcRpK"
                        + "+jw4xfLybf90ZK9L3AHLUJbNLWVnHW3IuLoJbBeSGVxSbPBhe4ggPklcYUkPowgtlZ6YlthuQDtjF23h2obXuXkQRd"
                        + "+RPbDWvOA5AYQjsKH8uSHil5aRARewPIPhukl9Mn4HEovUccsBR/RirQFSGmGYiMM0zvhVSR7pXZDEhiADzvzAkvVVTI1"
                        + "/HbNqcoBU4ctSPAGsuDPO/mah1+IwGQAuPP6xoEPL"
                        + "+3zQ0wztQCwHT2o8aQmxFJ9a09q8ybRprHaNjCgTaLDeTWE0o1pllZIE8c7wnG3cOuj6quYjTcQyLm6P4M87Zw==");
        //when
        boolean result = AlipaySignature.rsaCheckV2(parameters, publicKey, "utf-8", "RSA2");
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
                "KrRGUY3/2JX3KtlLgus8CbK0xuUIBDCpOdJkVzJDefez6HvlA8RA6uCVj2rrMd7DgVfarG5SROdSnkZbf8MLKHbVoFqi9w0QCvto9mc8n3ezfWejZECJVCZhbJ3OslB+4gij9+F70usrnCNEJZm02ntyNdVzcqMbgdRMB93BJIRC1jjmCotpXgXWrRdTb/SfhIAkoHqgGi2aCUHuLDInLGZCn8NeziGWMnFOic6/sE/nMpwriOmwLb2nyzD0fGiolwuuxlOGMcBHAb22J8XqchFHyCpbs2A/rWdJMjhUfqsErbtZQM93fi1xfL2pUa9RMWX0Q81Qk7iSEeHCR+NGyQ==");

        boolean result = AlipaySignature.rsaCheckV2(parameters, publicKey, "utf-8", "RSA2");

        assertThat(result, is(true));
    }
}