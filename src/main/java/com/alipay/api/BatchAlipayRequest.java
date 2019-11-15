/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author gongyi.tnj
 * @version $Id: BatchAlipayRequest.java, v 0.1 2018-07-18 上午10:28 gongyi.tnj Exp $
 */
public class BatchAlipayRequest implements AlipayRequest<BatchAlipayResponse> {

    /**
     * 批量调用API接口名
     **/
    private static final String METHOD = "alipay.open.request.batch.send";

    private String apiVersion = "1.0";

    /**
     * 业务接口请求列表
     **/
    private List<AlipayRequestWrapper> requestList;

    /**
     * 是否加密
     **/
    private boolean needEncrypt = false;

    public BatchAlipayRequest addRequest(AlipayRequest alipayRequest) {
        return addRequest(alipayRequest, null, null, null);
    }

    public BatchAlipayRequest addRequest(AlipayRequest alipayRequest, String accessToken) {
        return addRequest(alipayRequest, accessToken, null, null);
    }

    public BatchAlipayRequest addRequest(AlipayRequest alipayRequest, String accessToken, String appAuthToken) {
        return addRequest(alipayRequest, accessToken, appAuthToken, null);
    }

    public BatchAlipayRequest addRequest(AlipayRequest alipayRequest, String accessToken,
                                         String appAuthToken, String targetAppId) {
        if (this.requestList == null) {
            this.requestList = new ArrayList<AlipayRequestWrapper>();
        }
        AlipayRequestWrapper alipayRequestWrapper = new AlipayRequestWrapper(alipayRequest,
                accessToken, appAuthToken, targetAppId);
        this.requestList.add(alipayRequestWrapper);

        //若业务接口列表中存在需强制加密的接口，则本次批量调用强制加密
        if (!needEncrypt && alipayRequestWrapper.getAlipayRequest().isNeedEncrypt()) {
            this.needEncrypt = true;
        }
        return this;
    }

    /**
     * Getter method for property <tt>requestList</tt>.
     *
     * @return property value of requestList
     */
    public List<AlipayRequestWrapper> getRequestList() {
        return requestList;
    }

    @Override
    public String getApiMethodName() {
        return METHOD;
    }

    @Override
    public Map<String, String> getTextParams() {
        return null;
    }

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

    @Override
    public void setApiVersion(String apiVersion) {
        throw new RuntimeException();
    }

    @Override
    public String getTerminalType() {
        return null;
    }

    @Override
    public void setTerminalType(String terminalType) {
        throw new RuntimeException();
    }

    @Override
    public String getTerminalInfo() {
        return null;
    }

    @Override
    public void setTerminalInfo(String terminalInfo) {
        throw new RuntimeException();
    }

    @Override
    public String getProdCode() {
        return null;
    }

    @Override
    public void setProdCode(String prodCode) {
        throw new RuntimeException();
    }

    @Override
    public String getNotifyUrl() {
        return null;
    }

    @Override
    public void setNotifyUrl(String notifyUrl) {
        throw new RuntimeException();
    }

    @Override
    public String getReturnUrl() {
        return null;
    }

    @Override
    public void setReturnUrl(String returnUrl) {
        throw new RuntimeException();
    }

    @Override
    public Class<BatchAlipayResponse> getResponseClass() {
        return BatchAlipayResponse.class;
    }

    @Override
    public boolean isNeedEncrypt() {
        return needEncrypt;
    }

    @Override
    public void setNeedEncrypt(boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
    }

    @Override
    public AlipayObject getBizModel() {
        return null;
    }

    @Override
    public void setBizModel(AlipayObject bizModel) {
        throw new RuntimeException();
    }
}
