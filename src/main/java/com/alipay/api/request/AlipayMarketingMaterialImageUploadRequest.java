package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingMaterialImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.material.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2022-03-15 14:33:38
 */
public class AlipayMarketingMaterialImageUploadRequest implements AlipayUploadRequest<AlipayMarketingMaterialImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片的byte字节数组。图片大小限制为2M
	 */
	private FileItem fileContent;

	/** 
	* 文件业务标识.

该字段某些场景下必选.
具体该字段在哪些场景下需要传入，会在不同的接口处进行描述。

例如：alipay.marketing.activity.ordervoucher.create接口的voucher_image字段.就清楚描述了.需要使用该接口上传图片，同时指定file_key为PROMO_VOUCHER_IMAGE
	 */
	private String fileKey;

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey() {
		return this.fileKey;
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
		return "alipay.marketing.material.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("file_key", this.fileKey);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayMarketingMaterialImageUploadResponse> getResponseClass() {
		return AlipayMarketingMaterialImageUploadResponse.class;
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
