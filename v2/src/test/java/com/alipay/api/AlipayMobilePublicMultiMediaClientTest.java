package com.alipay.api;

import com.alibaba.fastjson.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AlipayMobilePublicMultiMediaClientTest {
    private AlipayMobilePublicMultiMediaClient client;

    @Before
    public void setUp() {
        client = new AlipayMobilePublicMultiMediaClient(TestAccount.ProdLife.GATEWAY, TestAccount.ProdLife.APP_ID,
                TestAccount.ProdLife.APP_PRIVATE_KEY, "json", "utf-8", "RSA2");
    }

    @After
    public void tearDown() {
        new File("test.jpg").delete();
    }

    @Test
    public void should_get_failed_response() throws FileNotFoundException, AlipayApiException {
        //given
        AlipayMobilePublicMultiMediaDownloadRequest request = new AlipayMobilePublicMultiMediaDownloadRequest();
        File tmpImageFile = new File("test.jpg");
        FileOutputStream outputStream = new FileOutputStream(tmpImageFile);
        request.setOutputStream(outputStream);
        JSONObject bizContent = new JSONObject();
        String mediaId = "L21pZnMvVDFucFVGWGZKYlhYYUNucHJYP3Q9YW13ZiZ4c2lnPTEzYWYwZjE1MmU2OTVhZTRlYjRkNGVhYjhlZGU2MzIw052";
        bizContent.put("mediaId", mediaId);
        request.setBizContent(bizContent.toString());
        //when
        AlipayMobilePublicMultiMediaDownloadResponse response = client.execute(request);
        //then
        assertThat(response.getMsg(), containsString("无效的sign"));
    }
}