/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import java.util.Map;

/**
 * 
 * @author runzhi
 */
public interface AlipayClient {

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException;

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @param accessToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request,
                                                String authToken) throws AlipayApiException;

    /**
     * 
     * 
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                                String appAuthToken) throws AlipayApiException;

    /**
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException;
    
    /**
     * SDK客户端调用生成sdk字符串
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request) throws AlipayApiException;

    /**
    * 
    * @param request
    * @return
    * @throws AlipayApiException
    */
    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                                    String method) throws AlipayApiException;

    /**
     * 移动客户端同步结果返回解析的参考工具方法
     * 
     * @param result 移动客户端SDK同步返回的结果map，一般包含resultStatus，result和memo三个key
     * @param requsetClazz 接口请求request类，如App支付传入 AlipayTradeAppPayRequest.class
     * @return 同步返回结果的response对象
     * @throws AlipayApiException
     */
    public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result,
                                                                                          Class<T> requsetClazz) throws AlipayApiException;
}
