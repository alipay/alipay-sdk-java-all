package com.alipay.api.kms.aliyun.utils;

import com.alibaba.fastjson.JSON;
import com.alipay.api.kms.aliyun.http.FormatType;
import com.alipay.api.kms.aliyun.http.MethodType;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParameterUtils {
    private final static String TIME_ZONE = "UTC";
    private final static String FORMAT_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private final static String SEPARATOR = "&";

    public static String getUniqueNonce() {
        StringBuilder uniqueNonce = new StringBuilder();
        UUID uuid = UUID.randomUUID();
        uniqueNonce.append(uuid.toString());
        uniqueNonce.append(System.currentTimeMillis());
        uniqueNonce.append(Thread.currentThread().getId());
        return uniqueNonce.toString();
    }

    public static String getISO8601Time(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_ISO8601);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.format(date);
    }

    public static Date getUTCDate(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_ISO8601);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.parse(date);
    }

    public static String composeStringToSign(MethodType method, Map<String, String> queries) throws UnsupportedEncodingException {
        String[] sortedKeys = queries.keySet().toArray(new String[]{});
        Arrays.sort(sortedKeys);
        StringBuilder canonicalizedQueryString = new StringBuilder();

        for (String key : sortedKeys) {
            if (!StringUtils.isEmpty(queries.get(key))) {
                canonicalizedQueryString.append("&")
                        .append(AcsURLEncoder.percentEncode(key)).append("=")
                        .append(AcsURLEncoder.percentEncode(queries.get(key)));
            }
        }

        return method.toString() +
                SEPARATOR +
                AcsURLEncoder.percentEncode("/") +
                SEPARATOR +
                AcsURLEncoder.percentEncode(canonicalizedQueryString.toString().substring(1));
    }

    public static Map<String, String> refreshSignParameters(Map<String, String> parameters, String accessKeyId, FormatType format) {
        Map<String, String> immutableMap = new HashMap<String, String>(parameters);
        immutableMap.put("Timestamp", getISO8601Time(new Date()));
        immutableMap.put("SignatureMethod", HmacSHA1Signer.getSignerName());
        immutableMap.put("SignatureVersion", HmacSHA1Signer.getSignerVersion());
        immutableMap.put("SignatureNonce", getUniqueNonce());
        immutableMap.put("AccessKeyId", accessKeyId);
        if (null != format) {
            immutableMap.put("Format", format.toString());
        }
        return immutableMap;
    }

    public static String concatQueryString(Map<String, String> parameters) throws UnsupportedEncodingException {
        if (null == parameters) {
            return null;
        }
        StringBuilder urlBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            urlBuilder.append(AcsURLEncoder.encode(key));
            if (val != null) {
                urlBuilder.append("=").append(AcsURLEncoder.encode(val));
            }
            urlBuilder.append("&");
        }
        int strIndex = urlBuilder.length();
        if (parameters.size() > 0) {
            urlBuilder.deleteCharAt(strIndex - 1);
        }
        return urlBuilder.toString();
    }

    public static String composeUrl(String endpoint, Map<String, String> queries, String protocol) throws UnsupportedEncodingException {
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(protocol);
        urlBuilder.append("://").append(endpoint);
        if (-1 == urlBuilder.indexOf("?")) {
            urlBuilder.append("/?");
        }
        String query = concatQueryString(queries);
        return urlBuilder.append(query).toString();
    }

    public static byte[] getJsonData(Map<String, String> params) throws UnsupportedEncodingException {
        String json = JSON.toJSONString(params);
        return json.getBytes("UTF-8");
    }

    public static byte[] getXmlData(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            xml.append("<").append(entry.getKey()).append(">");
            xml.append(entry.getValue());
            xml.append("</").append(entry.getKey()).append(">");
        }
        return xml.toString().getBytes("UTF-8");
    }

    public static byte[] getFormData(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (first) {
                first = false;
            } else {
                result.append("&");
            }
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return result.toString().getBytes("UTF-8");
    }
}
