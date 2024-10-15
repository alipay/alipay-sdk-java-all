package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMerchantSolcreditserviceprodImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 09:12:13
 */
public class AlipayMerchantSolcreditserviceprodImageUploadRequest implements AlipayUploadRequest<AlipayMerchantSolcreditserviceprodImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户logo：MERCHANT_LOGO
商品图片：PRODUCT_PICTURE
	 */
	private String bizType;

	/** 
	* 二进制字节流。
商户logo图片文件大小不超过 60KB，图片尺寸大小需保证 160*160。
商品图片文件大小不超过 800KB，图片尺寸大小需保证 750*750。
	 */
	private FileItem file;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}
	public FileItem getFile() {
		return this.file;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

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

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.merchant.solcreditserviceprod.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_type", this.bizType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
		return params;
	}

	public Class<AlipayMerchantSolcreditserviceprodImageUploadResponse> getResponseClass() {
		return AlipayMerchantSolcreditserviceprodImageUploadResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
