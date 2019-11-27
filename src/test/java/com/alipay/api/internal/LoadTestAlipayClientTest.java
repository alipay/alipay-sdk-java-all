package com.alipay.api.internal;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.TestAccount;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayOpenOperationOpenbizmockBizQueryRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockBizQueryResponse;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import org.junit.Before;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoadTestAlipayClientTest {
    private AlipayClient alipayClient;

    @Before
    public void setUp() {
        alipayClient = new LoadTestAlipayClient(TestAccount.DevLoadTest.GATEWAY, TestAccount.DevLoadTest.APPID,
                TestAccount.DevLoadTest.APP_PRIVATE_KEY, "json", "utf-8",
                TestAccount.DevLoadTest.ALIPAY_PUBLICKEY, "RSA");
    }

    @Ignore
    public void should_return_success_response() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        request.setBizContent("{\"biz_no\":\"10001\"}");
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = alipayClient.execute(request);
        //then
        assertThat(response.getCode(), is("10000"));
        assertThat(response.isSuccess(), is(true));
    }

    @Ignore
    public void should_get_app_id_with_load_test_flag_when_call_sdk_execute() throws AlipayApiException {
        //given
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("我是测试数据");
        model.setSubject("App支付测试");
        model.setTotalAmount("0.01");
        model.setProductCode("QUICK_MSECURITY_PAY");
        model.setOutTradeNo("20170216test01");
        model.setTimeExpire("30m");
        request.setBizModel(model);
        request.setNotifyUrl("http://www.test.notify");
        //when
        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
        String orderString = response.getBody();
        //then
        assertThat(orderString, containsString("app_id=2021000100600007_TEST_1A"));
    }

    @Ignore
    public void should_get_app_id_with_load_test_flag_in_redirect_url_when_call_page_execute() throws AlipayApiException {
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
        AlipayTradeWapPayResponse response = alipayClient.pageExecute(request, "GET");
        String orderString = response.getBody();
        //then
        assertThat(orderString, containsString("app_id=2021000100600007_TEST_1A"));
    }

    @Ignore
    public void should_get_app_id_with_load_test_flag_in_post_form_when_call_page_execute() throws AlipayApiException {
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
        AlipayTradeWapPayResponse response = alipayClient.pageExecute(request, "POST");
        String orderString = response.getBody();
        //then
        assertThat(orderString, containsString("app_id=2021000100600007_TEST_1A"));
    }
}