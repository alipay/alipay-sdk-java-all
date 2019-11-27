/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: CertificatPageExecuteTest.java, v 0.1 2019年09月17日 上午10:56 zhongyu Exp $
 */
public class CertificatePageExecuteTest {
    private AlipayClient client;

    @Before
    public void setUp() throws Exception {
        client = new DefaultAlipayClient(TestAccount.ProdCert.CERT_PARAMS);
    }

    @Test
    public void should_return_correct_signed_order_form_contains_root_cert_sn_and_app_cert_sn() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        request.setBizContent("{" +
                "    \"body\":\"对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。\"," +
                "    \"subject\":\"大乐透\"," +
                "    \"out_trade_no\":\"70501111111S001111119\"," +
                "    \"timeout_express\":\"90m\"," +
                "    \"total_amount\":9.00," +
                "    \"product_code\":\"QUICK_WAP_WAY\"" +
                "  }");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request);
        String orderString = response.getBody();
        //then
        assertThat(orderString.contains("app_cert_sn"), is(true));
        assertThat(orderString.contains("alipay_root_cert_sn"), is(true));
    }

    @Test
    public void should_return_query_string_contains_root_cert_sn_and_app_cert() throws AlipayApiException {
        //given
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        request.setBizContent("{" +
                "    \"body\":\"对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。\"," +
                "    \"subject\":\"大乐透\"," +
                "    \"out_trade_no\":\"70501111111S001111119\"," +
                "    \"timeout_express\":\"90m\"," +
                "    \"total_amount\":9.00," +
                "    \"product_code\":\"QUICK_WAP_WAY\"" +
                "  }");
        //when
        AlipayTradeWapPayResponse response = client.pageExecute(request, "GET");
        String orderString = response.getBody();
        //then
        assertThat(orderString.contains("app_cert_sn"), is(true));
        assertThat(orderString.contains("alipay_root_cert_sn"), is(true));
    }
}