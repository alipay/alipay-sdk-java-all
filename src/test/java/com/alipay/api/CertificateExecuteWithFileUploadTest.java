/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhongyu
 * @version $Id: ExecuteWithFileUplouadTest.java, v 0.1 2019年09月17日 上午11:44 zhongyu Exp $
 */
public class CertificateExecuteWithFileUploadTest {
    @Test
    public void should_be_able_to_upload_file() throws AlipayApiException {
        AlipayClient client = new DefaultAlipayClient(TestAccount.ProdCert.CERT_PARAMS);

        AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
        request.setImageType("jpg");
        request.setImageName("海底捞");
        FileItem imageContent = new FileItem(getTestImagePath());
        request.setImagePid("2088021822217233");
        request.setImageContent(imageContent);
        AlipayOfflineMaterialImageUploadResponse response = client.certificateExecute(request);

        assertThat(response.getSubMsg(), containsString("ISV权限不足"));
    }


    @Ignore
    public void should_be_able_to_upload_file_sm2() throws AlipayApiException {
        AlipayClient client = new DefaultAlipayClient(TestAccount.DevSM2Cert.SM2_CERT_PARAMS);

        AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
        request.setImageType("jpg");
        request.setImageName("海底捞");
        FileItem imageContent = new FileItem(getTestImagePath());
        request.setImagePid("2088021822217233");
        request.setImageContent(imageContent);
        AlipayOfflineMaterialImageUploadResponse response = client.certificateExecute(request);

        assertThat(response.getSubMsg(), containsString("ISV权限不足"));
    }


    private String getTestImagePath() {
        return "src/test/resources/fixture/海底捞.jpg";
    }
}