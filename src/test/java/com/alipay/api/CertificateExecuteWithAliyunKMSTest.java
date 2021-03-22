package com.alipay.api;

import com.alipay.api.domain.AlipayOpenOperationOpenbizmockBizQueryModel;
import com.alipay.api.kms.aliyun.AliyunKMSAlipayClient;
import com.alipay.api.kms.aliyun.AliyunKMSCertAlipayRequest;
import com.alipay.api.kms.aliyun.AliyunKMSClient;
import com.alipay.api.request.AlipayOpenOperationOpenbizmockBizQueryRequest;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockBizQueryResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CertificateExecuteWithAliyunKMSTest {
    private AlipayClient client;

    @Before
    public void setUp() throws Exception {
        client = new AliyunKMSAlipayClient(TestAccount.AliyunKMSCert.CERT_PARAMS);
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

    //因为SecurityToken是有失效时间的，所以这个例子需要替换成即时的SecurityToken再运行测试
    @Ignore
    public void sts_credentials() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSCert.KMS_ENDPOINT,
                TestAccount.AliyunKMSCert.ACCESS_KEY_ID,
                TestAccount.AliyunKMSCert.ACCESS_KEY_SECRET,
                TestAccount.AliyunKMSCert.SECURITY_TOKEN
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSCert.getCertParams();
        certAlipayRequest.setClient(aliyunKMSClient);

        client = new AliyunKMSAlipayClient(certAlipayRequest);

        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Ignore
    public void ram_role_arn_credentials() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSCert.KMS_ENDPOINT,
                TestAccount.AliyunKMSCert.ACCESS_KEY_ID,
                TestAccount.AliyunKMSCert.ACCESS_KEY_SECRET,
                TestAccount.AliyunKMSCert.ROLE_ARN,
                TestAccount.AliyunKMSCert.ROLE_SESSION_NAME
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSCert.getCertParams();
        certAlipayRequest.setClient(aliyunKMSClient);

        client = new AliyunKMSAlipayClient(certAlipayRequest);

        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Ignore
    public void ecs_ram_role_credentials() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSCert.KMS_ENDPOINT,
                TestAccount.AliyunKMSCert.ROLE_NAME
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSCert.getCertParams();
        certAlipayRequest.setClient(aliyunKMSClient);

        client = new AliyunKMSAlipayClient(certAlipayRequest);

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

    //TODO:待第三方CSR文件签发证书问题解决后再进行测试
    @Ignore
    public void should_auto_download_alipay_public_cert() throws AlipayApiException {
        //given
        AliyunKMSCertAlipayRequest certParams = TestAccount.AliyunKMSCert.getCertParams();
        //将支付宝公钥证书路径故意设置成商户证书路径，以便触发自动下载支付宝公钥证书链路
        certParams.setAlipayPublicCertPath(certParams.getCertPath());
        client = new AliyunKMSAlipayClient(certParams);

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
        AliyunKMSCertAlipayRequest certParams = TestAccount.AliyunKMSCert.getCertParams();
        certParams.setFormat("xml");
        client = new AliyunKMSAlipayClient(certParams);

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
        AliyunKMSCertAlipayRequest certParams = TestAccount.AliyunKMSCert.getCertParams();
        certParams.setAppId(TestAccount.NOT_SET_KEY_APP_ID);
        client = new AliyunKMSAlipayClient(certParams);
        //when
        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(getRequest());
        //then
        assertThat(response.isSuccess(), is(false));
        assertThat(response.getSubMsg(), containsString("应用未配置对应签名算法的公钥或者证书"));
    }

    private AlipayOpenOperationOpenbizmockBizQueryRequest getRequest() {
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        AlipayOpenOperationOpenbizmockBizQueryModel model = new AlipayOpenOperationOpenbizmockBizQueryModel();
        model.setBizNo("test");
        request.setBizModel(model);
        return request;
    }

}
