package com.alipay.api.kms.aliyun.http;

import java.util.Map;

public class UnmarshallerContext {
    private int httpStatus;
    private Map<String, Object> responseMap;
    private HttpResponse httpResponse;

    public Integer integerValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Integer.valueOf(value);
    }

    public String stringValue(String key) {
        return (String) responseMap.get(key);
    }

    public Long longValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Long.valueOf(value);
    }

    public Boolean booleanValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Boolean.valueOf(value);
    }

    public Float floatValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Float.valueOf(value);
    }

    public Double doubleValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Double.valueOf(value);
    }

    public int lengthValue(String key) {
        String value = (String) responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return 0;
        }
        return Integer.parseInt(value);
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Map<String, Object> getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(Map<String, Object> responseMap) {
        this.responseMap = responseMap;
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }
}
