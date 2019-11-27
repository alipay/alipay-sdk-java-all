/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author zhongyu
 * @version $Id: SDKExecuteTest.java, v 0.1 2019年09月23日 上午11:35 zhongyu Exp $
 */
public class SDKExecuteTest {
    private AlipayClient client;

    @Before
    public void setUp() {
        client = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID,
                TestAccount.Sandbox.APP_PRIVATE_KEY, "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
    }

    @Test
    public void should_return_correct_signed_order_string() throws AlipayApiException {
        //given
        AlipayTradeAppPayRequest request = getTradeAppPayRequest();
        //when
        AlipayTradeAppPayResponse response = client.sdkExecute(request);
        String orderString = response.getBody();
        //then
        //必须拥有正确的签名串
        assertThat(orderString, containsString("&sign="));
    }

    private AlipayTradeAppPayRequest getTradeAppPayRequest() {
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试");
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_MSECURITY_PAY");
        model.setOutTradeNo("20170216test01");
        model.setTimeoutExpress("30m");
        request.setBizModel(model);
        request.setNotifyUrl("http://www.test.notify");
        return request;
    }

    @Test
    public void should_return_order_string_with_app_auth_token() throws AlipayApiException {
        //given
        AlipayTradeAppPayRequest request = getTradeAppPayRequest();
        request.putOtherTextParam("app_auth_token", "123");
        //when
        AlipayTradeAppPayResponse response = client.sdkExecute(request);
        String orderString = response.getBody();
        //then
        //必须含有app_auth_tokne参数
        assertThat(orderString, containsString("app_auth_token=123"));
    }

    @Test
    public void should_return_order_string_with_correct_order_of_parameters() throws AlipayApiException {
        //given
        AlipayTradeAppPayRequest request = getTradeAppPayRequest();
        request.putOtherTextParam("A", "test");
        request.putOtherTextParam("a", "test");
        //when
        AlipayTradeAppPayResponse response = client.sdkExecute(request);
        String orderString = response.getBody();
        //then
        //大写字符必须在小写字符前面
        assertThat(orderString, containsString("A=test&a=test"));
    }
}