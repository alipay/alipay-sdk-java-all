/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.diagnosis.DiagnosisUtils;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AntMerchantExpandIndirectImageUploadRequest;
import com.alipay.api.response.AntMerchantExpandIndirectImageUploadResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Base64;

/**
 * @author jd
 * @version DiagnosisUrlTest.java, v 0.1 2023年06月27日 20:55 jd
 */
public class DiagnosisUrlTest {


    AlipayClient alipayClient;
    @Before
    public void setUp() throws Exception {
        String privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDb7fTOB7mNXlJV/cZCNHNKpM6SL3bsVxHJKKzg7rq14ZkN37Sut/am6ykA7zaT+oHk1itWuqo5cpuxMlbYYhFiuIt/kNDN/lKeVZZaqm6A4HhyHPThDLAWnK4+jInRXW4Xu5bW3ZyWHtsmh1TvEWCFM1s+U5HHMlkFPjZoRtV6RsJbasXbeG3pWNkUz4HDjHsmEf/LAJOf/UgWNM+5Mp9P0GThZQUVgNFqdmxJ/PKDk1HvT/rpYmuviWjyyTwCR5BzmE5SzOcsM0IqlwnW4yLv16Z2Jmlz1YJsAO4/SSjf/GcF+OpBa1SvxkGPK40WzJESjiSh8jWZjTHvD4uAlhXZAgMBAAECggEADtRNtHK65Thd7uRssNwehgL01tCSgT8huOGgPo56UndCvbe+1CUdYYXrvt9iW7oBdi+mvnNZtQPwUZNmXbLHH1P4PALEwY8LfReiSrzBNLluBavEK0SSvwOTkC4jwNU+7iS8+AH7Y/fyqPdpF7GhQ3oCBgLWiorvi7X1LzTPgi4RNPIA4iKS9EHdEQLd5xVZ3swhDMyhwT+IV1Npl6oyv6+Q8HYgbHhqmYY6OWHc80DDLKoj+/GcFEg+IvTwafHsC3IFkPyAtwIaVR16DU2JsdAl2c4sltEy+/idodoR4/Acdif90vd1uORiW1IZXPCtp8frurWONqiEQtO4Gku1nQKBgQD5anCJZID8LdYl1I2JLVOEVebmAltCdpEkDFJgVyzUSpS9mw/73f6kpbdS6JlPeXwXFHamICOvOZaz6vH/3ZDL7SYjRtOwuWAp2yT6niDtHIn/HqkNueW021LfI1go9GKrULQk9wZmBGBicJQk7zQBhBJzZ4oyK86XKrsVMd/w1wKBgQDhvD9bzDcp9wRVHoubb4JslGIHXZtDQ+FrEi7aB9XNOoMMBCufHAAOanDn7e0lufznd2uDW7hGhKThc+EBAHy4gxUDa8nXhuEnEf25FxDwhNCoGPrflEsdYpboygsVeG6qt/cV4D88oAmDmsU/xicJxAldEyuJhzEys6WSDk1ozwKBgCvI7MKh2ybqIQr5GnO3ek7kCandRgoP6IDsjNWO2DbYdO4oN5EesqJS2TD71lYmXItsszuMrtcHBBbHqv4g9ldmZWiR+X2vvVr7tq0sb1lQxkT8K+9V8CZkzlKP0N03sc6jV0yZ9QyZvhXp74fgWj/d4KNTzOXr3NOa08bvv4F3AoGASYRlniAEV0Z7wr0P+q92aqZoxr1Vs7KH17c0Sw4CM7S6uU8iZc9YtVk1LFPwyDiqhTf/a+iTO2Q3zrVOsmTWOcF3NoYEVo03BuJ1H7LDcZHP4u8/xVEmpYtWWrpyoat3X2JKtnUyIyx77MCbPQnr7OJLqmRz6XZ+L2USp17BF0ECgYBMGl5SwDmVUj88XQv9pmuZ8mHMuMVOjMFMmztpQvzVDZdRfbGZkm2Pyt+646OzRPiPwaWdqsPlETCee9DRc295kdKUsjCpH3cg2HmlIJ0xsjgx/AbcrY8Zm2Ffg/TSCSQbw8PGX7Nw/M89zqV6IDhUgvd4oDTZcsGk3WleN8BPmA==";
        String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhm8I8dmxiMZ9XoryLromTtGJN29Y39y6QthcTvd5PLpkgBGCCx0LK4jnZzCvNcoUGS75tzTfP/H00yZ+LD4l2sjfA01F+G0I4bKtz8866JP+wEVwhiMvaOq9DaOm7mR8fGgCuhkJqwu1LtH+65eXKx7BIcZvQAvKhmv25V8/SZ4mxuJEORggJEF91L4E8Me5gFxatFg+pnPDTrfwmi0MHPfXOD1LHJ0iOKLcPodA88on4VHTp349uh+ugo1qUH5cInRofu/Nr1ygiO6wFJJ9o4+3f3paF/hWNH0I10bCMxMW9nS4ytTkxfTfrU9iG9ijle6Ko4mZ7EuPzVY184qeIwIDAQAB";
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setServerUrl("https://openapi-sandbox.dl.alipaydev.com/gateway.do");
        alipayConfig.setAppId("2021000122646089");
        alipayConfig.setPrivateKey(privateKey);
        alipayConfig.setFormat("json");
        alipayConfig.setAlipayPublicKey(alipayPublicKey);
        alipayConfig.setCharset("UTF8");
        alipayConfig.setSignType("RSA2");
        alipayClient = new DefaultAlipayClient(alipayConfig);
    }



    @Test
    public void test01() throws AlipayApiException {
        // 这是一个1x1像素的图片流
        String imageBase64 = "iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAEUlEQVR42mP4TyRgGFVIX4UAI/uOgGWVNeQAAAAASUVORK5CYII=";
        // 下列FileItem中也可用直接读取本地文件的方式来获取文件
        // FileItem imageContent = new FileItem("本地文件的绝对路径");
        AntMerchantExpandIndirectImageUploadRequest request = new AntMerchantExpandIndirectImageUploadRequest();
        request.setImageType("jpg");
        FileItem imageContent = new FileItem("imageContent.jpg", Base64.getDecoder().decode(imageBase64));
        request.setImageContent(imageContent);
        AntMerchantExpandIndirectImageUploadResponse response = alipayClient.execute(request);
        System.out.println(response.getBody());
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
            String traceId =  DiagnosisUtils.getTraceId(response);
            Assert.assertNotNull(traceId);
            String diagnosisUrl = DiagnosisUtils.getDiagnosisUrl(response);
            Assert.assertNotNull(diagnosisUrl);

        }
    }


}