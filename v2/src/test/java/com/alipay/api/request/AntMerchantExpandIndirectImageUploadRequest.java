/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.api.request;

import com.alipay.api.AlipayObject;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.FileItem;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AntMerchantExpandIndirectImageUploadResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author junying
 * @version : AntMerchantExpandIndirectImageUploadRequest.java, v 0.1 2020年12月28日 9:56 下午 junying Exp $
 */
public class AntMerchantExpandIndirectImageUploadRequest extends Object
        implements AlipayUploadRequest<AntMerchantExpandIndirectImageUploadResponse> {

    private AlipayHashMap udfParams;
    private String apiVersion = "1.0";

    private FileItem imageContent;

    private String imageType;

    private String terminalType;

    private String terminalInfo;
    private String prodCode;
    private String notifyUrl;
    private String returnUrl;

    public void setImageContent(FileItem imageContent) {
        this.imageContent = imageContent;
    }


    public FileItem getImageContent() {
        return this.imageContent;
    }


    public void setImageType(String imageType) {
        this.imageType = imageType;
    }


    public String getImageType() {
        return this.imageType;
    }


    private boolean needEncrypt = false;


    private AlipayObject bizModel = null;


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


    public String getProdCode() {
        return this.prodCode;
    }


    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }


    public String getApiMethodName() {
        return "ant.merchant.expand.indirect.image.upload";
    }


    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("image_type", this.imageType);
        if (this.udfParams != null) {
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

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image_content", this.imageContent);
        return params;
    }


    public Class<AntMerchantExpandIndirectImageUploadResponse> getResponseClass() {
        return AntMerchantExpandIndirectImageUploadResponse.class;
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