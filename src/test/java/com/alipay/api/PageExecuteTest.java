/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author zhongyu
 * @version $Id: PageExecuteTest.java, v 0.1 2019年09月23日 上午11:35 zhongyu Exp $
 */
public class PageExecuteTest {
    private AlipayClient client;

    @Before
    public void setUp() {
        client = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID,
                TestAccount.Sandbox.APP_PRIVATE_KEY, "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
    }

    @Test
    public void should_return_correct_signed_order_form() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request);
        String orderString = response.getBody();
        //then
        //必须拥有正确的签名串
        assertThat(orderString, containsString("sign="));
    }

    private AlipayTradeWapPayRequest getTradeWapPayRequest() {
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        request.setBizContent("{" +
                "    \"body\":\"对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。\"," +
                "    \"subject\":\"大乐透\"," +
                "    \"out_trade_no\":\"70501111111S001111119\"," +
                "    \"timeout_express\":\"90m\"," +
                "    \"total_amount\":9.00," +
                "    \"product_code\":\"QUICK_WAP_WAY\"" +
                "  }");
        return request;
    }

    @Test
    public void should_return_order_form_with_app_auth_token() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        request.putOtherTextParam("app_auth_token", "123");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "POST");
        String orderString = response.getBody();
        //then
        //必须含有app_auth_tokne参数，不包含auth_token参数
        assertThat(orderString, containsString("name=\"app_auth_token\" value=\"123\""));
        assertThat(orderString.contains("name=\"auth_token\""), is(false));
    }

    @Test
    public void should_return_order_form_with_access_token() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        request.putOtherTextParam("auth_token", "123");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "POST");
        String orderString = response.getBody();
        //then
        //必须含有auth_tokne参数，不包含app_auth_token参数
        assertThat(orderString, containsString("name=\"auth_token\" value=\"123\""));
        assertThat(orderString.contains("app_auth_token"), is(false));
    }

    @Test
    public void should_return_order_form_with_access_token_and_app_auth_token() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        request.putOtherTextParam("app_auth_token", "123");
        request.putOtherTextParam("auth_token", "123");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "POST");
        String orderString = response.getBody();
        //then
        //必须含有auth_tokne参数和app_auth_token参数
        assertThat(orderString, containsString("name=\"app_auth_token\" value=\"123\""));
        assertThat(orderString, containsString("name=\"auth_token\" value=\"123\""));
    }

    @Test
    public void should_return_query_string_with_access_token_and_app_auth_token() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        request.putOtherTextParam("app_auth_token", "123");
        request.putOtherTextParam("auth_token", "123");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "GET");
        String orderString = response.getBody();
        //then
        //必须含有auth_tokne参数和app_auth_token参数
        assertThat(orderString, containsString("app_auth_token=123"));
        assertThat(orderString, containsString("auth_token=123"));
    }

    @Test
    public void should_return_order_string_with_correct_order_of_parameters() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = getTradeWapPayRequest();
        request.putOtherTextParam("A", "test");
        request.putOtherTextParam("a", "test");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "GET");
        String orderString = response.getBody();
        //then
        //大写字符必须在小写字符前面
        assertThat(orderString, containsString("A=test&a=test"));
    }
}
