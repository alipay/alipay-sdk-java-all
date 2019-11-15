package com.alipay.api.internal.parser.xml;

import com.alipay.api.*;
import com.alipay.api.internal.mapping.Converter;
import com.alipay.api.internal.mapping.Converters;
import com.alipay.api.internal.mapping.Reader;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.XmlUtils;
import org.w3c.dom.Element;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * JSON格式转换器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class XmlConverter implements Converter {

    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
            throws AlipayApiException {
        Element root = XmlUtils.getRootElementFromString(rsp);
        return getModelFromXML(root, clazz);
    }

    private <T> T getModelFromXML(final Element element, Class<T> clazz) throws AlipayApiException {
        if (element == null) { return null; }

        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                return childE != null;
            }

            public Object getPrimitiveObject(Object name) {
                return XmlUtils.getElementValue(element, (String) name);
            }

            public Object getObject(Object name, Class<?> type) throws AlipayApiException {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                if (childE != null) {
                    return getModelFromXML(childE, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
                    throws AlipayApiException {
                List<Object> list = null;
                Element listE = XmlUtils.getChildElement(element, (String) listName);

                if (listE != null) {
                    list = new ArrayList<Object>();
                    List<Element> itemEs = XmlUtils.getChildElements(listE, (String) itemName);
                    for (Element itemE : itemEs) {
                        Object obj = null;
                        String value = XmlUtils.getElementValue(itemE);

                        if (String.class.isAssignableFrom(subType)) {
                            obj = value;
                        } else if (Long.class.isAssignableFrom(subType)) {
                            obj = Long.valueOf(value);
                        } else if (Integer.class.isAssignableFrom(subType)) {
                            obj = Integer.valueOf(value);
                        } else if (Boolean.class.isAssignableFrom(subType)) {
                            obj = Boolean.valueOf(value);
                        } else if (Date.class.isAssignableFrom(subType)) {
                            DateFormat format = new SimpleDateFormat(
                                    AlipayConstants.DATE_TIME_FORMAT);
                            try {
                                obj = format.parse(value);
                            } catch (ParseException e) {
                                throw new AlipayApiException(e);
                            }
                        } else {
                            obj = getModelFromXML(itemE, subType);
                        }
                        if (obj != null) { list.add(obj); }
                    }
                }
                return list;
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

        // 获取签名
        String sign = getSign(responseBody);
        certItem.setSign(sign);

        // 获取证书
        String cert = getCert(responseBody);
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
    private String getSignSourceData(AlipayRequest<?> request, String body) {

        // XML不同的节点
        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        // 成功或者新版接口
        if (indexOfRootNode > 0) {

            return parseSignSourceData(body, rootNode, indexOfRootNode);
            // 老版本接口
        } else if (indexOfErrorRoot > 0) {

            return parseSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     * 获取签名
     *
     * @param body
     * @return
     */
    private String getSign(String body) {

        String signNodeName = "<" + AlipayConstants.SIGN + ">";
        String signEndNodeName = "</" + AlipayConstants.SIGN + ">";

        int indexOfSignNode = body.indexOf(signNodeName);
        int indexOfSignEndNode = body.indexOf(signEndNodeName);

        if (indexOfSignNode < 0 || indexOfSignEndNode < 0) {
            return null;
        }

        //  签名
        return body.substring(indexOfSignNode + signNodeName.length(), indexOfSignEndNode);
    }

    /**
     * 获取证书序列号
     *
     * @param body
     * @return
     */
    private String getCert(String body) {

        String signNodeName = "<" + AlipayConstants.ALIPAY_CERT_SN + ">";
        String signEndNodeName = "</" + AlipayConstants.ALIPAY_CERT_SN + ">";

        int indexOfSignNode = body.indexOf(signNodeName);
        int indexOfSignEndNode = body.indexOf(signEndNodeName);

        if (indexOfSignNode < 0 || indexOfSignEndNode < 0) {
            return null;
        }

        //  证书
        return body.substring(indexOfSignNode + signNodeName.length(), indexOfSignEndNode);
    }

    /**
     * 签名源串
     *
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private String parseSignSourceData(String body, String rootNode, int indexOfRootNode) {

        //  第一个字母+长度+>
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;
        int indexOfSign = body.indexOf("<" + AlipayConstants.SIGN);
        int indexOfCert = body.indexOf("<" + AlipayConstants.ALIPAY_CERT_SN);

        if (indexOfSign < 0) {
            return null;
        }

        int signDataEndIndex = indexOfSign;
        if (indexOfCert > 0) {
            signDataEndIndex = indexOfCert < indexOfSign ? indexOfCert : indexOfSign;
        }

        return body.substring(signDataStartIndex, signDataEndIndex);
    }

    public String decryptSourceData(AlipayRequest<?> request, String body, String format,
                                    Decryptor decryptor, String encryptType, String charset)
            throws AlipayApiException {

        ResponseParseItem respSignSourceData = getXMLSignSourceData(request, body);

        String bodyIndexContent = body.substring(0, respSignSourceData.getStartIndex());
        String bodyEndContent = body.substring(respSignSourceData.getEndIndex());

        return bodyIndexContent
                + decryptor.decrypt(respSignSourceData.getEncryptContent(), encryptType, charset)
                + bodyEndContent;
    }

    /**
     * @param request
     * @param body
     * @return
     */
    private ResponseParseItem getXMLSignSourceData(AlipayRequest<?> request, String body) {
        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        if (indexOfRootNode > 0) {

            return parseXMLSignSourceData(body, rootNode, indexOfRootNode);

        } else if (indexOfErrorRoot > 0) {

            return parseXMLSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     * 绛惧��婧�涓�
     *
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private ResponseParseItem parseXMLSignSourceData(String body, String rootNode,
                                                     int indexOfRootNode) {

        int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;

        String xmlStartNode = "<" + AlipayConstants.RESPONSE_XML_ENCRYPT_NODE_NAME + ">";
        String xmlEndNode = "</" + AlipayConstants.RESPONSE_XML_ENCRYPT_NODE_NAME + ">";

        int indexOfSign = body.indexOf(xmlEndNode);

        if (indexOfSign < 0) {

            return new ResponseParseItem(0, 0, "");
        }

        int signDataEndIndex = indexOfSign + xmlEndNode.length();

        // 包含xml节点的
        String encryptBizContent = body.substring(signDataStartIndex, signDataEndIndex);

        String bizContent = encryptBizContent.substring(xmlStartNode.length(),
                encryptBizContent.length() - xmlEndNode.length());

        return new ResponseParseItem(signDataStartIndex, signDataEndIndex, bizContent);
    }

}
