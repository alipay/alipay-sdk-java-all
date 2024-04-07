package com.alipay.api.request;

import com.alipay.api.domain.PrivateInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenIotmbsImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.iotmbs.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 10:51:52
 */
public class AlipayOpenIotmbsImageUploadRequest implements AlipayUploadRequest<AlipayOpenIotmbsImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 请联系业务接入方获取biz_code用于选定图片上传业务
	 */
	private String bizCode;

	/** 
	* 业务具体配置
	 */
	private String bizConfig;

	/** 
	* 上传的图片，最大10M
	 */
	private FileItem imageContent;

	/** 
	* 用户隐私相关信息
	 */
	private PrivateInfo privateInfo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizConfig(String bizConfig) {
		this.bizConfig = bizConfig;
	}
	public String getBizConfig() {
		return this.bizConfig;
	}

	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	public FileItem getImageContent() {
		return this.imageContent;
	}

	public void setPrivateInfo(PrivateInfo privateInfo) {
		this.privateInfo = privateInfo;
	}
	public PrivateInfo getPrivateInfo() {
		return this.privateInfo;
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
		return "alipay.open.iotmbs.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("biz_config", this.bizConfig);
		txtParams.put("private_info", this.privateInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.privateInfo, true));
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

	public Class<AlipayOpenIotmbsImageUploadResponse> getResponseClass() {
		return AlipayOpenIotmbsImageUploadResponse.class;
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
