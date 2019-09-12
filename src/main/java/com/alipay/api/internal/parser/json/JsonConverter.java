package com.alipay.api.internal.parser.json;

import com.alipay.api.*;
import com.alipay.api.internal.mapping.Converter;
import com.alipay.api.internal.mapping.Converters;
import com.alipay.api.internal.mapping.Reader;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.SignSourceData;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.json.ExceptionErrorListener;
import com.alipay.api.internal.util.json.JSONReader;
import com.alipay.api.internal.util.json.JSONValidatingReader;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * JSON格式转换器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class JsonConverter implements Converter {

    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
            throws AlipayApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            Collection<?> values = rootJson.values();
            for (Object rspObj : values) {
                if (rspObj instanceof Map<?, ?>) {
                    Map<?, ?> rspJson = (Map<?, ?>) rspObj;
                    return fromJson(rspJson, clazz);
                }
            }
        }
        return null;
    }

    /**
     * 把JSON格式的数据转换为对象。
     *
     * @param <T>   泛型领域对象
     * @param json  JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     * @throws AlipayApiException
     */
    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws AlipayApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws AlipayApiException {
                Object tmp = json.get(name);
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    return fromJson(map, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
                    throws AlipayApiException {
                List<Object> listObjs = null;

                Object listTmp = json.get(listName);
                if (listTmp instanceof Map<?, ?>) {
                    Map<?, ?> jsonMap = (Map<?, ?>) listTmp;
                    Object itemTmp = jsonMap.get(itemName);
                    if (itemTmp == null && listName != null) {
                        String listNameStr = listName.toString();
                        itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
                    }
                    if (itemTmp instanceof List<?>) {
                        listObjs = getListObjectsInner(subType, itemTmp);
                    }
                } else if (listTmp instanceof List<?>) {
                    listObjs = getListObjectsInner(subType, listTmp);
                }

                return listObjs;
            }

            private List<Object> getListObjectsInner(Class<?> subType, Object itemTmp)
                    throws AlipayApiException {
                List<Object> listObjs;
                listObjs = new ArrayList<Object>();
                List<?> tmpList = (List<?>) itemTmp;
                for (Object subTmp : tmpList) {
                    Object obj = null;
                    if (String.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Long.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Integer.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Boolean.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Date.class.isAssignableFrom(subType)) {
                        DateFormat format = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
                        try {
                            obj = format.parse(String.valueOf(subTmp));
                        } catch (ParseException e) {
                            throw new AlipayApiException(e);
                        }
                    } else if (subTmp instanceof Map<?, ?>) {// object
                        Map<?, ?> subMap = (Map<?, ?>) subTmp;
                        obj = fromJson(subMap, subType);
                    }

                    if (obj != null) {
                        listObjs.add(obj);
                    }
                }
                return listObjs;
            }

        });
    }

    /**
     * @see com.alipay.api.internal.mapping.Converter#getSignItem(com.alipay.api.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        // 响应为空则直接返回
        if (StringUtils.isEmpty(responseBody)) {

            return null;
        }

        SignItem signItem = new SignItem();

        // 获取签名
        String sign = getSign(responseBody);
        signItem.setSign(sign);

        // 签名源串
        String signSourceData = getSignSourceData(request, responseBody);
        signItem.setSignSourceDate(signSourceData);

        return signItem;
    }

    /**
     * @see com.alipay.api.internal.mapping.Converter#getCertItem(com.alipay.api.AlipayRequest, String)
     */
    public CertItem getCertItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        // 响应为空则直接返回
        if (StringUtils.isEmpty(responseBody)) {
            return null;
        }

        CertItem certItem = new CertItem();

        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(responseBody);
        Map<?, ?> rootJson = (Map<?, ?>) rootObj;

        // 获取签名
        String sign = (String) rootJson.get(AlipayConstants.SIGN);
        certItem.setSign(sign);

        //获取证书序列号
        String cert = (String) rootJson.get(AlipayConstants.ALIPAY_CERT_SN);
        certItem.setCert(cert);

        // 签名源串
        String signSourceData = getSignSourceData(request, responseBody);
        certItem.setSignSourceDate(signSourceData);

        return certItem;
    }

    /**
     * @param request
     * @param body
     * @return
     */
    private String getSignSourceData(AlipayRequest<?> request, String body) throws AlipayApiException {

        // 加签源串起点
        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        // 成功或者新版接口
        if (indexOfRootNode > 0) {

            return parseSignSourceData(body, rootNode, indexOfRootNode);

            // 老版本失败接口
        } else if (indexOfErrorRoot > 0) {

            return parseSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     * 获取签名源串内容
     *
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private String parseSignSourceData(String body, String rootNode, int indexOfRootNode) throws AlipayApiException {

        //第一个字母+长度+冒号+引号
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;

        int indexOfSign = body.indexOf("\"" + AlipayConstants.SIGN + "\"");
        if (indexOfSign < 0) {
            return null;
        }

        SignSourceData signSourceData = AlipaySignature.extractSignContent(body, signDataStartIndex);

        //如果提取的待验签原始内容后还有root
        if (body.lastIndexOf(rootNode) > signSourceData.getEndIndex()) {
            throw new AlipayApiException("检测到响应报文中有重复的" + rootNode + "，验签失败。");
        }

        return signSourceData.getSourceData();
    }

    /**
     * 获取签名
     *
     * @param body
     * @return
     */
    private String getSign(String body) {

        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(body);
        Map<?, ?> rootJson = (Map<?, ?>) rootObj;

        return (String) rootJson.get(AlipayConstants.SIGN);
    }

    public String decryptSourceData(AlipayRequest<?> request, String body, String format,
                                    Decryptor decryptor, String encryptType, String charset)
            throws AlipayApiException {

        ResponseParseItem respSignSourceData = getJSONSignSourceData(request, body);

        String bodyIndexContent = body.substring(0, respSignSourceData.getStartIndex());
        String bodyEndContent = body.substring(respSignSourceData.getEndIndex());

        return bodyIndexContent
                + decryptor.decrypt(respSignSourceData.getEncryptContent(), encryptType, charset)
                + bodyEndContent;

    }

    /**
     * 获取JSON响应加签内容串
     *
     * @param request
     * @param body
     * @return
     */
    private ResponseParseItem getJSONSignSourceData(AlipayRequest<?> request, String body) {

        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        if (indexOfRootNode > 0) {

            return parseJSONSignSourceData(body, rootNode, indexOfRootNode);

        } else if (indexOfErrorRoot > 0) {

            return parseJSONSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private ResponseParseItem parseJSONSignSourceData(String body, String rootNode,
                                                      int indexOfRootNode) {

        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
        int signDataEndIndex = extractJsonBase64ValueEndPosition(body, signDataStartIndex);

        String encryptContent = body.substring(signDataStartIndex + 1, signDataEndIndex - 1);

        return new ResponseParseItem(signDataStartIndex, signDataEndIndex, encryptContent);
    }

    private static int extractJsonBase64ValueEndPosition(String responseString, int beginPosition) {
        for (int index = beginPosition; index < responseString.length(); ++index) {
            //找到第2个双引号作为终点，由于中间全部是Base64编码的密文，所以不会有干扰的特殊字符
            if (responseString.charAt(index) == '"' && index != beginPosition) {
                return index + 1;
            }
        }
        //如果没有找到第2个双引号，说明验签内容片段提取失败，直接尝试选取剩余整个响应字符串进行验签
        return responseString.length();
    }

}
