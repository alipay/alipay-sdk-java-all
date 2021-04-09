/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.api;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayOpenAppServiceModifyModel;
import com.alipay.api.domain.AlipayOpenAppServiceQueryModel;
import com.alipay.api.domain.AlipayOpenAppServiceSchemaQueryModel;
import com.alipay.api.request.AlipayOpenAppServiceApplyRequest;
import com.alipay.api.request.AlipayOpenAppServiceModifyRequest;
import com.alipay.api.request.AlipayOpenAppServiceQueryRequest;
import com.alipay.api.request.AlipayOpenAppServiceSchemaQueryRequest;
import com.alipay.api.response.AlipayOpenAppServiceApplyResponse;
import com.alipay.api.response.AlipayOpenAppServiceModifyResponse;
import com.alipay.api.response.AlipayOpenAppServiceQueryResponse;
import com.alipay.api.response.AlipayOpenAppServiceSchemaQueryResponse;
import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.sdk.Poi;
import com.alipay.service.schema.sdk.ServiceSchema;
import com.alipay.service.schema.sdk.ServiceSchemaUtil;
import com.alipay.service.schema.sdk.ServiceUrl;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author junying
 * @version : ServiceSchemaReaderTest.java, v 0.1 2021年03月18日 6:52 下午 junying Exp $
 */
public class ServiceSchemaReaderTest {
    public static class Account {
        public static final String GATEWAY = "https://openapipre.alipay.com/gateway.do";
        public static final String APP_ID = "2021001142699014";
        public static final String ALIPAY_PUBLICKEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj/0men6n/sz9cpILvSP5tpUkTM89u3ODlI5Z1uni/ZA5hMGpJb7w0Hg5p79L/E+QJH/nM2+wAi4S9h8II/Nf6SDfsDAa5CCLwPD95hYFsz9qoSHI0QFzPQB4gf7BW2gOyo2Msf+PWAoVyqJYGBZbE3ItJ1pvTDhZ2mHJgiFVqcIDHm3X/Ep9fgcVhXE9Rd0ZJLGB6/mn3+2bBDFYVoAp0fX5MvktVwhBH504VQnq2GD+woYUl1190DbSwKksE0njhhbNOh3hR174b+jyj1Ek8MHalIYy82WHZsZvDXo38L6ClTu3lGbGtV47WK5M2A8Ho6IalDD0aglhzWODkD0tTQIDAQAB";
        public static final String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCVsAW9yuD014m8W1GrD8CZsB73iAAlGGsezScSYew5ZE6vpT6I0nNYqcIgNh48pQkbPLzCFOlvrP+ZMJkHwYKk2g2vAQ+2S4nMXK4YZR5IGP+poSEjwkUJITP0vwpjfBJu10U8kc0IFvFACW2A/KC+XgUHBV1/UZedjSSCOrH1srGElqv48uAlzCwrvjnfDV+m3n6g95aZrXM6BMo9xZkA087isnHk9KTxBZnvGF0QXWQHnReBDy0uV6N560C+2twG8S/Oyh9pLbX2YF2iAqFV01Sb/O+4Rkik0nv+brMvuHo/GASICwuZ8BO2CUQJ4/bEfhTYBDz5DvTvmgxhNyS3AgMBAAECggEBAJLwnlI3bCktxIngYwU3i2vTFjMLkIjZtZ4g6bAD7G5SZ2PJJOAPJyfsTSJtvbTulUflka479QOpoadxq2ePsH2/iBs5QYFEGdtBR62u5dEEqUSNZgjCVh6mN2iUeNA8JaQlMlRJFCpSyzR/jL1IQUte5DSGMcggAmOpACPPFo8G/Q1w6V8Y9TycoE82nfV0fdfWJttSDdMX5Grh6SzVwKUlFEUUtltXqEnmx6sWqlt3FXn82jLvzt2sUyoBt5ehBzeQpHTk7vL5OG5dSbdBmj6v2d+BZYnyupJ3dGHHyQDNVyCdwT2zs7h4gbZrSW5xw1ak6j2bWPfSsBcUoBOXIPECgYEA4nZEQiZK3sfiR/0fk97Eus+Y9W3pGwBfKf0eR8HUhrz6i4D06qMOfboYsxW2UbOzipGOqAvP/3FvrMdFDYxclPLjEl78NFbKvlcjzDRjbRf8xF3N9XYxdFErROkXxnkMJ3jVhz9uQTXvfz55KZq63dERNSRNgkFYhUsptFpl/DsCgYEAqTYzsstE/iMuQkSKpvCepVlUM1yMY5+WDrdZHIRt/1omP28LAZpLLe7ptk2TRQtetbcluqR46QCxDAJhr+i1NioLgSh9sIebLiezmDbxJXxDk4hFk1FmfTl8Uth05KQvKzSDR6NFhTT9nmEuAf6txBaPl9XA+DlVZBJXqPipfbUCgYBwtgAfFEPrQXzD652N0TAE8lHkxUFhqPu0QECT4krOjLv+Nr6vEVyjAr5MU6AcZd4UN4HS7Z4mOuUkD0G1Doj9sS2G9TN9MT1TIre0aNabc3bgnPdnFd5jUArDD2g/5ftAoglUeSN83UVIBWX0aQhcYjO4SUsyayeNn+0v0FY2BQKBgQCL9WAXj9f2GKVHfKfuYvHltBhYD0GzmSkl7PNRChxtbGRcbX1+CuAKEyXOeyXHoxroVJ9pXGcB2meWllW0iVdxgJ9ZamNj4xYwu/fpe/BD4B+I5NsfeeG6zBSP9afiAgddxiab12lGP8lS+fBzB/M0ULDelpfw+IMvrZhCE8MlTQKBgQDKUhKGfQe4e6FUD2ZcwRB2CzrDOVorhe6jr1znuTJAxu/njU6Ms/uEes1KyAQAsrsbcn9IS1mudVOY0hx4TOBcJsjaHPzhiM0ZNaZFITTjSsM05yVQ4b9ZcWS6WA+i8y94t69l3ZIksAE2oOK9+atZZgQxNufPknJGBhPuvLFagQ==";
    }


    @Test
    public void serviceSchema_sdk() throws ServiceSchemaException {
        ServiceSchema serviceSchema = new ServiceSchema();
        serviceSchema.setServiceName("junying");
        serviceSchema.setServiceDesc("junying标准化服务");
        ServiceUrl serviceUrl = new ServiceUrl();
        serviceUrl.setCarrierType("SC_MINI_APP");
        serviceUrl.setCarrierUrl("alipays://platformapi/startapp?appId=2018999902363317&amp;b=1");
        serviceSchema.setServiceUrl(serviceUrl);

        AlipayClient alipayClient = new DefaultAlipayClient(Account.GATEWAY, Account.APP_ID, Account.APP_PRIVATE_KEY, "json", "GBK", Account.ALIPAY_PUBLICKEY, "RSA2");
        AlipayOpenAppServiceSchemaQueryRequest request = new AlipayOpenAppServiceSchemaQueryRequest();
        AlipayOpenAppServiceSchemaQueryModel model = new AlipayOpenAppServiceSchemaQueryModel();
        model.setCategoryId("C000003346");
        request.setBizModel(model);
        try {
            AlipayOpenAppServiceSchemaQueryResponse response = alipayClient.execute(request);
            Map<String, Attribute> xmlMap = ServiceSchemaReader.readXmlForMap(response.getSchemaXml());
            String serviceXml = ServiceSchemaUtil.schemaXmlString(serviceSchema, xmlMap);

        } catch (AlipayApiException e) {
        }

    }

    @Test
    public void serviceSchemaReader_readXmlForMap_file_map() throws ServiceSchemaException {

//        AlipayClient alipayClient = new DefaultAlipayClient(Account.GATEWAY, Account.APP_ID, Account.APP_PRIVATE_KEY, "json", "GBK", Account.ALIPAY_PUBLICKEY, "RSA2");
//        AlipayOpenAppServiceSchemaQueryRequest request = new AlipayOpenAppServiceSchemaQueryRequest();
//        AlipayOpenAppServiceSchemaQueryModel model = new AlipayOpenAppServiceSchemaQueryModel();
//        model.setCategoryId("C000003346");
//        request.setBizModel(model);
//        try {
//            AlipayOpenAppServiceSchemaQueryResponse response = alipayClient.execute(request);
//            Map<String, Attribute> xmlMap = ServiceSchemaReader.readXmlForMap(response.getSchemaXml());
//
//            List<Attribute> responseList = ServiceSchemaReader.readXmlForList(response.getSchemaXml());
//
//            AlipayOpenAppServiceQueryRequest alipayOpenAppServiceQueryRequest = new AlipayOpenAppServiceQueryRequest();
//            AlipayOpenAppServiceQueryModel alipayOpenAppServiceQueryModel = new AlipayOpenAppServiceQueryModel();
//            alipayOpenAppServiceQueryModel.getServiceId("2021031821000897520096");
//            alipayOpenAppServiceQueryRequest.setBizModel(alipayOpenAppServiceQueryModel);
//            AlipayOpenAppServiceQueryResponse alipayOpenAppServiceQueryResponse = alipayClient.execute(alipayOpenAppServiceQueryRequest);
//
//            List<Attribute> attributeList = ServiceSchemaReader.readXmlForList(alipayOpenAppServiceQueryResponse.getServiceXml());
//            attributeList.get(0).setName("junying");
//            String serviceXml = ServiceSchemaWriter.writeSchemaXmlString(attributeList);
//            AlipayOpenAppServiceModifyRequest alipayOpenAppServiceModifyRequest = new AlipayOpenAppServiceModifyRequest();
//
//            AlipayOpenAppServiceModifyModel alipayOpenAppServiceModifyModel = new AlipayOpenAppServiceModifyModel();
//            alipayOpenAppServiceModifyModel.setSchemaVersion("1");
//            alipayOpenAppServiceModifyModel.setServiceId("C102422948");
//            alipayOpenAppServiceModifyModel.getServiceXml(serviceXml);
//
//            alipayOpenAppServiceModifyRequest.setBizModel(alipayOpenAppServiceModifyModel);
//            AlipayOpenAppServiceModifyResponse alipayOpenAppServiceModifyResponse = alipayClient.execute(alipayOpenAppServiceModifyRequest);
//        } catch (AlipayApiException e) {
//        }
    }
}