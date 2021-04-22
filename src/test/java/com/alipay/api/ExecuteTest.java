package com.alipay.api;

import com.alipay.api.domain.AlipayTradeCreateModel;
import com.alipay.api.internal.util.WebUtils;
import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.alipay.api.request.AlipayTradeCreateRequest;
import com.alipay.api.request.AlipayOpenOperationOpenbizmockBizQueryRequest;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
import com.alipay.api.response.AlipayTradeCreateResponse;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockBizQueryResponse;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExecuteTest {
    private AlipayClient alipayClient;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID, TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
    }

    @After
    public void tearDown() {
        WebUtils.setNeedCheckServerTrusted(true);
        WebUtils.setKeepAliveTimeout(0);
    }

    @Test
    public void should_return_success_response() throws AlipayApiException {
        sendOneNormalRequest();
    }

    @Test
    public void should_return_success_when_request_and_response_encrypted() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID, TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2",
                TestAccount.Sandbox.AES_KEY, "AES");
        AlipayTradeCreateRequest request = getTradeCreateRequest();
        request.setNeedEncrypt(true);
        //when
        AlipayTradeCreateResponse response = alipayClient.execute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Test
    public void should_be_able_to_send_token() throws AlipayApiException {
        AlipayTradeCreateResponse response = alipayClient.execute(getTradeCreateRequest(), "123", "456");
        assertThat(response.getSubMsg(), containsString("无效的应用授权令牌"));
    }

    @Test
    public void should_be_able_to_parse_xml_format_response() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID, TestAccount.Sandbox.APP_PRIVATE_KEY,
                "xml", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
        AlipayTradeCreateRequest request = getTradeCreateRequest();
        //when
        AlipayTradeCreateResponse response = alipayClient.execute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    @Test
    public void should_be_able_to_parse_xml_format_response_when_encrypted() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID, TestAccount.Sandbox.APP_PRIVATE_KEY,
                "xml", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2",
                TestAccount.Sandbox.AES_KEY, "AES");
        AlipayTradeCreateRequest request = getTradeCreateRequest();
        request.setNeedEncrypt(true);
        //when
        AlipayTradeCreateResponse response = alipayClient.execute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    private AlipayTradeCreateRequest getTradeCreateRequest() {
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
        AlipayTradeCreateModel model = new AlipayTradeCreateModel();
        model.setOutTradeNo(UUID.randomUUID().toString());
        model.setTotalAmount("88.88");
        model.setSubject("Iphone6 16G");
        model.setBuyerId("2088102177846880");
        request.setBizModel(model);
        return request;
    }

    @Test
    public void should_return_false_when_app_not_set_private_key() throws AlipayApiException {
        //given
        //访问线上一个没有设置公私钥对的APP
        alipayClient = new DefaultAlipayClient(TestAccount.ProdCert.GATEWAY, TestAccount.NOT_SET_KEY_APP_ID,
                TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
        //when
        AlipayTradeCreateResponse response = alipayClient.execute(getTradeCreateRequest());
        //then
        assertThat(response.isSuccess(), is(false));
        assertThat(response.getSubMsg(), containsString("应用未配置对应签名算法的公钥或者证书"));
    }

    @Test
    public void should_failed_when_visit_untrusted_gateway() throws AlipayApiException {
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.UNTRUSTED_GATEWAY, TestAccount.Sandbox.APP_ID,
                TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
        expectedException.expectMessage("javax.net.ssl.SSLHandshakeException: java.security.cert.CertificateException");
        sendOneNormalRequest();
    }

    /**
     * 手动测试用例
     * <p>
     * 1. 删除JRE的cacerts后，设置要检查服务端证书，调用openapi失败。
     * <p>
     * 2. 删除JRE的cacerts后，设置不检查服务端证书，调用openapi成功。
     * <p>
     * 3. 恢复JRE的cacerts后，设置要检查服务端证书，调用openapi成功。
     */
    @Ignore
    public void should_return_success_when_ca_cert_not_exist_but_set_skip_ssl_server_cert_verify() throws AlipayApiException {
        alipayClient = new DefaultAlipayClient(TestAccount.Sandbox.GATEWAY, TestAccount.Sandbox.APP_ID,
                TestAccount.Sandbox.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.Sandbox.ALIPAY_PUBLICKEY, "RSA2");
        WebUtils.setNeedCheckServerTrusted(true);
        sendOneNormalRequest();
    }

    @Test
    public void should_return_success_response_when_enable_keep_alive() throws AlipayApiException, InterruptedException {
        WebUtils.setKeepAliveTimeout(60);
        sendOneNormalRequest();

        Thread.sleep(5000);
        sendOneNormalRequest();
    }

    private void sendOneNormalRequest() throws AlipayApiException {
        AlipayTradeCreateResponse response = alipayClient.execute(getTradeCreateRequest());
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }

    //TODO:待相关依赖上线后替换为线上环境测试
    public void should_return_success_when_request_and_response_sm2() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.DevSM2.GATEWAY, TestAccount.DevSM2.APP_ID, TestAccount.DevSM2.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.DevSM2.ALIPAY_PUBLIC_KEY, "SM2");
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        AlipayOpenOperationOpenbizmockBizQueryResponse response = alipayClient.execute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }


    //TODO:待相关依赖上线后替换为线上环境测试
    public void should_return_success_when_request_and_response_encrypted_sm2() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.DevSM2.GATEWAY, TestAccount.DevSM2.APP_ID, TestAccount.DevSM2.APP_PRIVATE_KEY,
                "json", "utf-8", TestAccount.DevSM2.ALIPAY_PUBLIC_KEY, "SM2",
                TestAccount.DevSM2.AES_KEY, "AES");
        //when
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        request.setNeedEncrypt(true);
        request.setBizContent("{\"status\":\"1001\",\"shop_id\":\"2001\"}");

        AlipayOpenOperationOpenbizmockBizQueryResponse response = alipayClient.execute(request);
        //then
        assertThat(response.isSuccess(), is(true));
        assertThat(response.getCode(), is("10000"));
    }


    //TODO:待相关依赖上线后替换为线上环境测试
    public void should_be_able_to_upload_file_sm2() throws AlipayApiException {
        //given
        alipayClient = new DefaultAlipayClient(TestAccount.DevSM2.GATEWAY, TestAccount.DevSM2.APP_ID, TestAccount.DevSM2.APP_PRIVATE_KEY,
                "json", "GBK", TestAccount.DevSM2.ALIPAY_PUBLIC_KEY, "SM2");

        AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
        request.setImageType("jpg");
        request.setImageName("海底捞");
        FileItem imageContent = new FileItem(getTestImagePath());
        request.setImagePid("2088021822217233");
        request.setImageContent(imageContent);
        AlipayOfflineMaterialImageUploadResponse response = alipayClient.execute(request);

        assertThat(response.getCode(), is("10000"));
    }


    private String getTestImagePath() {
        return "src/test/resources/fixture/海底捞.jpg";
    }

}