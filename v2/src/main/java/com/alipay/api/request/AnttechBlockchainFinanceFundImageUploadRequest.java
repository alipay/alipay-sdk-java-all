package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AnttechBlockchainFinanceFundImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: anttech.blockchain.finance.fund.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 15:56:41
 */
public class AnttechBlockchainFinanceFundImageUploadRequest implements AlipayUploadRequest<AnttechBlockchainFinanceFundImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 请求对应功能
	 */
	private String function;

	/** 
	* 图片二进制字节流，最大为5M
	 */
	private FileItem imageContent;

	/** 
	* 图片格式，支持格式：jpg、jpeg、png
	 */
	private String imageType;

	/** 
	* 请求ID
	 */
	private String requestId;

	/** 
	* 业务场景码
	 */
	private String subSceneCode;

	public void setFunction(String function) {
		this.function = function;
	}
	public String getFunction() {
		return this.function;
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

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId() {
		return this.requestId;
	}

	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}
	public String getSubSceneCode() {
		return this.subSceneCode;
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
		return "anttech.blockchain.finance.fund.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("function", this.function);
		txtParams.put("image_type", this.imageType);
		txtParams.put("request_id", this.requestId);
		txtParams.put("sub_scene_code", this.subSceneCode);
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

	public Class<AnttechBlockchainFinanceFundImageUploadResponse> getResponseClass() {
		return AnttechBlockchainFinanceFundImageUploadResponse.class;
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
