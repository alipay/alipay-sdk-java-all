package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFundExpandindirectImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.fund.expandindirect.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2025-07-29 15:57:37
 */
public class AlipayFundExpandindirectImageUploadRequest implements AlipayUploadRequest<AlipayFundExpandindirectImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 场景码
	 */
	private String bizScene;

	/** 
	* 图片二进制字节流，最大为10M
	 */
	private FileItem imageContent;

	/** 
	* 图片格式，支持格式：jpg、jpeg、png、pdf
	 */
	private String imageType;

	/** 
	* 产品码
	 */
	private String productCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene() {
		return this.bizScene;
	}

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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
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
		return "alipay.fund.expandindirect.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_scene", this.bizScene);
		txtParams.put("image_type", this.imageType);
		txtParams.put("product_code", this.productCode);
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
		params.put("image_content", this.imageContent);
		return params;
	}

	public Class<AlipayFundExpandindirectImageUploadResponse> getResponseClass() {
		return AlipayFundExpandindirectImageUploadResponse.class;
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
