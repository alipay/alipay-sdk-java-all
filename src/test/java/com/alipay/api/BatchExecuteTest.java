/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.domain.AlipayTradeCreateModel;
import com.alipay.api.request.AlipayTradeCreateRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: BatchExecuteTest.java, v 0.1 2019年09月17日 下午3:06 zhongyu Exp $
 */
public class BatchExecuteTest {
    private AlipayClient alipayClient;

    @Before
    public void setUp() {
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID, TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
    }

    @Test
    public void should_return_success_response() throws AlipayApiException {
        //given
        BatchAlipayRequest batchAlipayRequest = new BatchAlipayRequest();
        batchAlipayRequest.addRequest(getTestRequest());
        batchAlipayRequest.addRequest(getTestRequest());
        //when
        BatchAlipayResponse response = alipayClient.execute(batchAlipayRequest);
        //then
        assertThat(response.getResponseList().size(), is(2));
        assertThat(response.getResponseList().get(0).isSuccess(), is(true));
        assertThat(response.getResponseList().get(0).getCode(), is("10000"));
    }

    private AlipayTradeCreateRequest getTestRequest() {
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
        request.setBizModel(getTestModel());
        return request;
    }

    private AlipayTradeCreateModel getTestModel() {
        AlipayTradeCreateModel model = new AlipayTradeCreateModel();
        model.setOutTradeNo(UUID.randomUUID().toString());
        model.setTotalAmount("88.88");
        model.setSubject("Iphone6 16G");
        model.setBuyerId("2088102177846880");
        return model;
    }
}