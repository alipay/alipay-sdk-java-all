/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: CertificatSDKExecuteTest.java, v 0.1 2019年09月17日 上午11:20 zhongyu Exp $
 */
public class CertificatSDKExecuteTest {
    private AlipayClient client;

    @Before
    public void setUp() throws Exception {
        client = new DefaultAlipayClient(TestAccount.ProdCert.CERT_PARAMS);
    }

    @Test
    public void should_return_order_string_contains_app_cert_sn_and_root_cert_sn() throws AlipayApiException {
        //given
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试DoNet");
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_MSECURITY_PAY");
        model.setOutTradeNo("20170216test01");
        model.setTimeoutExpress("30m");
        request.setBizModel(model);
        request.setNotifyUrl("http://www.test.notify");
        //when
        AlipayTradeAppPayResponse response = client.sdkExecute(request);
        String orderString = response.getBody();
        //then
        assertThat(orderString.contains("app_cert_sn="), is(true));
        assertThat(orderString.contains("alipay_root_cert_sn="), is(true));
    }
}