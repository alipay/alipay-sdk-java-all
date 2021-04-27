/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.json.*;

import java.io.Serializable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuqun.lq
 * @version $Id: Message.java, v 0.1 2018年08月31日 17:11 liuqun.lq Exp $
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 8280401559432634875L;

    private static final Pattern DATA_PATTERN = Pattern.compile("\"data\"\\s*:\\s*\\{");

    private String xType    = "message";
    private String xCmd;
    private String xMessageId;
    private String xStatus;
    private String xCode;
    private String xError;
    private String xSignType;
    private String xSign;
    private String xCharset;
    private Long   xTimestamp;
    private String xVersion = "1.0";
    private String appId;
    private String msgApi;
    private String bizContent;
    private String body;

    public static Message fromStr(String str) throws IllegalArgumentException {
        Message message = new Message();
        message.setBody(str);
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(str);
        if (!(rootObj instanceof Map<?, ?>)) {
            throw new IllegalArgumentException("json format illegal.");
        }
        Map<?, ?> rootJson = (Map<?, ?>) rootObj;
        if (!rootJson.containsKey("protocol")) {
            throw new IllegalArgumentException("miss protocol part.");
        }
        if (!(rootJson.get("protocol") instanceof Map<?, ?>)) {
            throw new IllegalArgumentException("protocol part format illegal.");
        }
        Map<?, ?> protocolJson = (Map<?, ?>) rootJson.get("protocol");
        message.setxType((String) (protocolJson.get("x-type")));
        if (StringUtils.isEmpty(message.getxType())) {
            throw new IllegalArgumentException("miss x-type in protocol part.");
        }
        message.setxCmd((String) (protocolJson.get("x-cmd")));
        message.setxMessageId((String) (protocolJson.get("x-msgId")));
        message.setxStatus((String) (protocolJson.get("x-status")));
        message.setxCode((String) (protocolJson.get("x-code")));
        message.setxError((String) (protocolJson.get("x-error")));
        message.setxCharset((String) (protocolJson.get("x-charset")));
        message.setxSignType((String) (protocolJson.get("x-signType")));
        message.setxSign((String) (protocolJson.get("x-sign")));
        if (protocolJson.containsKey("x-timestamp")) {
            Long xTimestamp = null;
            String sTimestamp = (String) (protocolJson.get("x-timestamp"));
            try {
                xTimestamp = Long.parseLong(sTimestamp);
            } catch (Throwable t) {
                throw new IllegalArgumentException("x-timestamp format illegal. " + sTimestamp);
            }
            message.setxTimestamp(xTimestamp);
        }
        message.setxVersion((String) (protocolJson.get("x-version")));

        if (rootJson.containsKey("data")) {
            if (!(rootJson.get("data") instanceof Map<?, ?>)) {
                throw new IllegalArgumentException("data part format illegal.");
            }
            Map<?, ?> dataJson = (Map<?, ?>) rootJson.get("data");
            if (dataJson.containsKey("header")) {
                if (!(dataJson.get("header") instanceof Map<?, ?>)) {
                    throw new IllegalArgumentException("header part format illegal.");
                }
                Map<?, ?> headerJson = (Map<?, ?>) dataJson.get("header");
                message.setAppId((String) (headerJson.get("appId")));
                message.setMsgApi((String) (headerJson.get("msgApi")));
            }
            if (dataJson.containsKey("content")) {
                if (!(dataJson.get("content") instanceof Map<?, ?>)) {
                    throw new IllegalArgumentException("content part format illegal.");
                }
                JSONWriter writer = new JSONValidatingWriter(new ExceptionErrorListener());
                message.setBizContent(writer.write(dataJson.get("content")));
            }
        }

        return message;
    }

    public static String toStr(Message message) throws IllegalArgumentException {
        if (message == null) {
            return null;
        }
        if (!StringUtils.isEmpty(message.getBody())) {
            return message.getBody();
        }
        if (StringUtils.isEmpty(message.getxType())) {
            throw new IllegalArgumentException("xType required. " + message);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\"protocol\":{");
        sb.append("\"x-type\":\"").append(message.getxType()).append("\",");
        if (!StringUtils.isEmpty(message.getxCmd())) {
            sb.append("\"x-cmd\":\"").append(message.getxCmd()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxMessageId())) {
            sb.append("\"x-msgId\":\"").append(message.getxMessageId()).append("\",");
        }
        if (message.getxTimestamp() != null) {
            sb.append("\"x-timestamp\":\"").append(message.getxTimestamp()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxVersion())) {
            sb.append("\"x-version\":\"").append(message.getxVersion()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxStatus())) {
            sb.append("\"x-status\":\"").append(message.getxStatus()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxCode())) {
            sb.append("\"x-code\":\"").append(message.getxCode()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxError())) {
            sb.append("\"x-error\":\"").append(message.getxError()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxCharset())) {
            sb.append("\"x-charset\":\"").append(message.getxCharset()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxSignType())) {
            sb.append("\"x-signType\":\"").append(message.getxSignType()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getxSign())) {
            sb.append("\"x-sign\":\"").append(message.getxSign()).append("\",");
        }
        if (',' == sb.charAt(sb.length() - 1)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        String data = genDataPart(message);
        if (data != null) {
            sb.append(",\"data\":").append(data);
        }
        sb.append("}");
        message.setBody(sb.toString());
        return message.getBody();
    }

    public static boolean checkSign(Message message, String alipayPublicKey) throws IllegalArgumentException {
        if (!("message".equals(message.getxType()) && MsgConstants.MSG_CMD_CONSUME.equals(message.getxCmd()))) {
            return true;
        }

        if (StringUtils.isEmpty(message.getxSignType()) || StringUtils.isEmpty(message.getxSign())
                || StringUtils.isEmpty(message.getxCharset()) || StringUtils.isEmpty(alipayPublicKey)) {
            throw new IllegalArgumentException("can not check sign, miss x-signType or x-sign or x-charset.");
        }
        String signContent = extractSignContent(message.getBody());
        if (StringUtils.isEmpty(signContent)) {
            throw new IllegalArgumentException("can not check sign, miss signContent.");
        }
        try {
            return AlipaySignature.rsaCheck(signContent, message.getxSign(), alipayPublicKey, message.getxCharset(),
                    message.getxSignType());
        } catch (Throwable t) {
            throw new IllegalArgumentException("check sign fail. exception:" + t.getCause().getMessage());
        }
    }

    public static void addSign(Message message, String appPrivateKey) {
        if (!("message".equals(message.getxType()) && MsgConstants.MSG_CMD_PRODUCE.equals(message.getxCmd()))) {
            return;
        }
        if (StringUtils.isEmpty(message.getxSignType()) || StringUtils.isEmpty(message.getxCharset())
                || StringUtils.isEmpty(appPrivateKey)) {
            throw new IllegalArgumentException("can not add sign, miss x-signType or x-charset.");
        }

        String signContent = genDataPart(message);
        if (StringUtils.isEmpty(signContent)) {
            throw new IllegalArgumentException("can not add sign, miss signContent.");
        }
        try {
            message.setxSign(AlipaySignature.rsaSign(signContent, appPrivateKey, message.getxCharset(),
                    message.getxSignType()));
        } catch (Throwable t) {
            throw new IllegalArgumentException("add sign fail. exception:" + t.getMessage());
        }
    }

    private static String extractSignContent(String str) {
        if (str == null) {
            return null;
        }
        Matcher m = DATA_PATTERN.matcher(str);
        if (!m.find()) {
            return null;
        }
        return AlipaySignature.extractSignContent(str, m.end() - 1).getSourceData();
    }

    private static String genDataPart(Message message) {
        StringBuilder dataSb = new StringBuilder();
        dataSb.append("{\"header\":{");
        if (!StringUtils.isEmpty(message.getAppId())) {
            dataSb.append("\"appId\":\"").append(message.getAppId()).append("\",");
        }
        if (!StringUtils.isEmpty(message.getMsgApi())) {
            dataSb.append("\"msgApi\":\"").append(message.getMsgApi()).append("\",");
        }
        if (',' == dataSb.charAt(dataSb.length() - 1)) {
            dataSb.deleteCharAt(dataSb.length() - 1);
        }
        dataSb.append("}");
        if (!StringUtils.isEmpty(message.getBizContent())) {
            JSONValidator jsonValidator = new JSONValidator(new ExceptionErrorListener());
            if (!jsonValidator.validate(message.getBizContent())) {
                throw new IllegalArgumentException("bizContent json format illegal.");
            }
            dataSb.append(",\"content\":").append(message.getBizContent());
        }
        dataSb.append("}");
        String data = dataSb.toString();
        if ("{\"header\":{}}".equals(data)) {
            data = null;
        }
        return data;
    }

    /**
     * Getter method for property <tt>xType</tt>.
     *
     * @return property value of xType
     */
    public String getxType() {
        return xType;
    }

    /**
     * Setter method for property <tt>xType</tt>.
     *
     * @param xType value to be assigned to property xType
     */
    public void setxType(String xType) {
        this.xType = xType;
    }

    /**
     * Getter method for property <tt>xCmd</tt>.
     *
     * @return property value of xCmd
     */
    public String getxCmd() {
        return xCmd;
    }

    /**
     * Setter method for property <tt>xCmd</tt>.
     *
     * @param xCmd value to be assigned to property xCmd
     */
    public void setxCmd(String xCmd) {
        this.xCmd = xCmd;
    }

    /**
     * Getter method for property <tt>xMessageId</tt>.
     *
     * @return property value of xMessageId
     */
    public String getxMessageId() {
        return xMessageId;
    }

    /**
     * Setter method for property <tt>xMessageId</tt>.
     *
     * @param xMessageId value to be assigned to property xMessageId
     */
    public void setxMessageId(String xMessageId) {
        this.xMessageId = xMessageId;
    }

    /**
     * Getter method for property <tt>xStatus</tt>.
     *
     * @return property value of xStatus
     */
    public String getxStatus() {
        return xStatus;
    }

    /**
     * Setter method for property <tt>xStatus</tt>.
     *
     * @param xStatus value to be assigned to property xStatus
     */
    public void setxStatus(String xStatus) {
        this.xStatus = xStatus;
    }

    /**
     * Getter method for property <tt>xCode</tt>.
     *
     * @return property value of xCode
     */
    public String getxCode() {
        return xCode;
    }

    /**
     * Setter method for property <tt>xCode</tt>.
     *
     * @param xCode value to be assigned to property xCode
     */
    public void setxCode(String xCode) {
        this.xCode = xCode;
    }

    /**
     * Getter method for property <tt>xError</tt>.
     *
     * @return property value of xError
     */
    public String getxError() {
        return xError;
    }

    /**
     * Setter method for property <tt>xError</tt>.
     *
     * @param xError value to be assigned to property xError
     */
    public void setxError(String xError) {
        this.xError = xError;
    }

    /**
     * Getter method for property <tt>xSignType</tt>.
     *
     * @return property value of xSignType
     */
    public String getxSignType() {
        return xSignType;
    }

    /**
     * Setter method for property <tt>xSignType</tt>.
     *
     * @param xSignType value to be assigned to property xSignType
     */
    public void setxSignType(String xSignType) {
        this.xSignType = xSignType;
    }

    /**
     * Getter method for property <tt>xSign</tt>.
     *
     * @return property value of xSign
     */
    public String getxSign() {
        return xSign;
    }

    /**
     * Setter method for property <tt>xSign</tt>.
     *
     * @param xSign value to be assigned to property xSign
     */
    public void setxSign(String xSign) {
        this.xSign = xSign;
    }

    /**
     * Getter method for property <tt>xCharset</tt>.
     *
     * @return property value of xCharset
     */
    public String getxCharset() {
        return xCharset;
    }

    /**
     * Setter method for property <tt>xCharset</tt>.
     *
     * @param xCharset value to be assigned to property xCharset
     */
    public void setxCharset(String xCharset) {
        this.xCharset = xCharset;
    }

    /**
     * Getter method for property <tt>xTimestamp</tt>.
     *
     * @return property value of xTimestamp
     */
    public Long getxTimestamp() {
        return xTimestamp;
    }

    /**
     * Setter method for property <tt>xTimestamp</tt>.
     *
     * @param xTimestamp value to be assigned to property xTimestamp
     */
    public void setxTimestamp(Long xTimestamp) {
        this.xTimestamp = xTimestamp;
    }

    /**
     * Getter method for property <tt>xVersion</tt>.
     *
     * @return property value of xVersion
     */
    public String getxVersion() {
        return xVersion;
    }

    /**
     * Setter method for property <tt>xVersion</tt>.
     *
     * @param xVersion value to be assigned to property xVersion
     */
    public void setxVersion(String xVersion) {
        this.xVersion = xVersion;
    }

    /**
     * Getter method for property <tt>appId</tt>.
     *
     * @return property value of appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Setter method for property <tt>appId</tt>.
     *
     * @param appId value to be assigned to property appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Getter method for property <tt>msgApi</tt>.
     *
     * @return property value of msgApi
     */
    public String getMsgApi() {
        return msgApi;
    }

    /**
     * Setter method for property <tt>msgApi</tt>.
     *
     * @param msgApi value to be assigned to property msgApi
     */
    public void setMsgApi(String msgApi) {
        this.msgApi = msgApi;
    }

    /**
     * Getter method for property <tt>bizContent</tt>.
     *
     * @return property value of bizContent
     */
    public String getBizContent() {
        return bizContent;
    }

    /**
     * Setter method for property <tt>bizContent</tt>.
     *
     * @param bizContent value to be assigned to property bizContent
     */
    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    /**
     * Getter method for property <tt>body</tt>.
     *
     * @return property value of body
     */
    public String getBody() {
        return body;
    }

    /**
     * Setter method for property <tt>body</tt>.
     *
     * @param body value to be assigned to property body
     */
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                '}';
    }
}