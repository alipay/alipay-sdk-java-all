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

public class SM2CertificateExecuteWithAliyunKMSTest {
    private AlipayClient client;

    @Before
    public void setUp() throws Exception {
        client = new AliyunKMSAlipayClient(TestAccount.AliyunKMSSM2Cert.SM2_CERT_PARAMS);
    }

    //TODO:待相关依赖上线后替换为线上环境测试
    @Ignore
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

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSSM2Cert.KMS_ENDPOINT,
                TestAccount.AliyunKMSSM2Cert.ACCESS_KEY_ID,
                TestAccount.AliyunKMSSM2Cert.ACCESS_KEY_SECRET,
                TestAccount.AliyunKMSSM2Cert.SECURITY_TOKEN
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSSM2Cert.getSM2CertParams();
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

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSSM2Cert.KMS_ENDPOINT,
                TestAccount.AliyunKMSSM2Cert.ACCESS_KEY_ID,
                TestAccount.AliyunKMSSM2Cert.ACCESS_KEY_SECRET,
                TestAccount.AliyunKMSSM2Cert.ROLE_ARN,
                TestAccount.AliyunKMSSM2Cert.ROLE_SESSION_NAME
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSSM2Cert.getSM2CertParams();
        certAlipayRequest.setClient(aliyunKMSClient);

        client = new AliyunKMSAlipayClient(certAlipayRequest);

        AlipayOpenOperationOpenbizmockBizQueryResponse response = client.certificateExecute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    //此测试例子需要在绑定指定RAM角色的ECS实例上运行
    @Ignore
    public void ecs_ram_role_credentials() throws AlipayApiException {
        //given
        AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();

        AliyunKMSClient aliyunKMSClient = new AliyunKMSClient(TestAccount.AliyunKMSSM2Cert.KMS_ENDPOINT,
                TestAccount.AliyunKMSSM2Cert.ROLE_NAME
        );

        AliyunKMSCertAlipayRequest certAlipayRequest = TestAccount.AliyunKMSSM2Cert.getSM2CertParams();
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

    private AlipayOpenOperationOpenbizmockBizQueryRequest getRequest() {
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        AlipayOpenOperationOpenbizmockBizQueryModel model = new AlipayOpenOperationOpenbizmockBizQueryModel();
        model.setBizNo("test");
        request.setBizModel(model);
        return request;
    }
}
