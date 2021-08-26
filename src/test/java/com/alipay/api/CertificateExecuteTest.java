/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.domain.AlipayOpenOperationOpenbizmockBizQueryModel;
import com.alipay.api.request.AlipayOpenOperationOpenbizmockBizQueryRequest;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockBizQueryResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: CertificatExecuteTest.java, v 0.1 2019年09月16日 下午9:14 zhongyu Exp $
 */
public class CertificateExecuteTest {
    private AlipayClient client;

    @Before
    public void setUp() throws Exception {
        client = new DefaultAlipayClient(TestAccount.ProdCert.getConfig());
    }

    @Test
    public void should_return_correct_response() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Test
    public void should_be_able_to_send_token() throws AlipayApiException {
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(getRequest(), "123", "456");
        assertThat(response.getSubMsg(), containsString("无效的应用授权令牌"));
    }

    @Test
    public void should_auto_download_alipay_public_cert() throws AlipayApiException {
        //given
        AlipayConfig config = TestAccount.ProdCert.getConfig();
        //将支付宝公钥证书路径故意设置成商户证书路径，以便触发自动下载支付宝公钥证书链路
        config.setAlipayPublicCertPath(config.getAppCertPath());
        client = new DefaultAlipayClient(config);

        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Test
    public void should_be_able_to_parse_xml_format_response() throws AlipayApiException {
        //given
        AlipayConfig config = TestAccount.ProdCert.getConfig();
        config.setFormat("xml");
        client = new DefaultAlipayClient(config);

        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
    }

    @Test
    public void should_return_false_when_app_not_set_private_key() throws AlipayApiException {
        //given
        //访问线上一个没有设置公私钥对的APP
        AlipayConfig config = TestAccount.ProdCert.getConfig();
        config.setAppId(TestAccount.NOT_SET_KEY_APP_ID);
        client = new DefaultAlipayClient(config);
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(getRequest());
        //then
        assertThat(response.isSuccess(), is(false));
        assertThat(response.getSubMsg(), containsString("应用未配置对应签名算法的公钥或者证书"));
    }

    @Test
    public void should_support_custom_headers() throws AlipayApiException {
        //given
        AlipayConfig config = TestAccount.ProdCert.getConfig();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("key", "value");
        config.setCustomHeaders(headers);
        client = new DefaultAlipayClient(config);

        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(getRequest());
        //then
        assertThat(response.isSuccess(), is(true));
    }

    private AlipayOpenOperationOpenbizmockBizQueryRequest getRequest() {
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        AlipayOpenOperationOpenbizmockBizQueryModel model = new AlipayOpenOperationOpenbizmockBizQueryModel();
        model.setBizNo("test");
        request.setBizModel(model);
        return request;
    }

    //TODO:待相关依赖上线后替换为线上环境测试
    public void should_return_success_when_request_and_response_sm2_cert() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();
        //when
        AlipayClient clientSM2 = new DefaultAlipayClient(TestAccount.DevSM2Cert.getSM2CertParams());
        AlipayOpenOperationOpenbizmockBizQueryResponse response = clientSM2.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }
}