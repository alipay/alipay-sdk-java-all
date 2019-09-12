package com.alipay.api.internal.parser.json;

import com.alipay.api.*;
import com.alipay.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectJsonParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new JsonConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.getSignItem(request, responseBody);
    }

    public CertItem getCertItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.getCertItem(request, responseBody);
    }

    public String decryptSourceData(AlipayRequest<?> request, String body, String format,
                                    Decryptor decryptor, String encryptType, String charset)
            throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.decryptSourceData(request, body, format, decryptor, encryptType, charset);
    }

}
