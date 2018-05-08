package com.alipay.api;

/**
 * 响应解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface AlipayParser<T extends AlipayResponse> {

    /**
     * 把响应字符串解释成相应的领域对象。
     * 
     * @param rsp 响应字符串
     * @return 领域对象
     */
    public T parse(String rsp) throws AlipayApiException;

    /**
     * 获取响应类类型。
     */
    public Class<T> getResponseClass() throws AlipayApiException;

    /**
     * 获取响应内的签名数据
     * 
     * @param rsp 响应字符串
     * @return
     * @throws AlipayApiException
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException;

    /**
     *  获取实际串：如果是加密内容则返回内容已经是解密后的实际内容了
     * 
     * @param request
     * @param body
     * @param format
     * @param encryptType
     * @param encryptKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                    String encryptType, String encryptKey, String charset)
                                                                                          throws AlipayApiException;

}
