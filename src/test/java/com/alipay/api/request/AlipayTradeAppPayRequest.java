package com.alipay.api.request;

import com.alipay.api.AlipayObject;
import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayTradeAppPayResponse;

import java.util.Map;

/**
 * ALIPAY API: alipay.trade.app.pay request
 *
 * @author auto create
 * @since 1.0, 2019-07-30 13:55:01
 */
public class AlipayTradeAppPayRequest implements AlipayRequest<AlipayTradeAppPayResponse> {

    private AlipayHashMap udfParams; // add user-defined text parameters
    private String        apiVersion = "1.0";

    /**
     * app支付接口2.0
     */
    private String bizContent;

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    private String       terminalType;
    private String       terminalInfo;
    private String       prodCode;
    private String       notifyUrl;
    private String       returnUrl;
    private boolean      needEncrypt = false;
    private AlipayObject bizModel    = null;

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public String getTerminalInfo() {
        return this.terminalInfo;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdCode() {
        return this.prodCode;
    }

    public String getApiMethodName() {
        return "alipay.trade.app.pay";
    }

    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("biz_content", this.bizContent);
        if (udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new AlipayHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<AlipayTradeAppPayResponse> getResponseClass() {
        return AlipayTradeAppPayResponse.class;
    }

    public boolean isNeedEncrypt() {
        return this.needEncrypt;
    }

    public void setNeedEncrypt(boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
    }

    public AlipayObject getBizModel() {
        return this.bizModel;
    }

    public void setBizModel(AlipayObject bizModel) {
        this.bizModel = bizModel;
    }
}
