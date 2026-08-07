package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceMedicalInsuranceFilesteamUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.filesteam.upload request
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:27
 */
public class AlipayCommerceMedicalInsuranceFilesteamUploadRequest implements AlipayUploadRequest<AlipayCommerceMedicalInsuranceFilesteamUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务流水号
	 */
	private String bizNo;

	/** 
	* 渠道
	 */
	private String channel;

	/** 
	* 文件二进制流
	 */
	private FileItem fileContent;

	/** 
	* 用于标记支付宝用户在应用下的唯一标识
	 */
	private String openId;

	/** 
	* 场景类型
	 */
	private String sceneType;

	/** 
	* 支付宝用户ID
	 */
	private String userId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel() {
		return this.channel;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}
	public String getSceneType() {
		return this.sceneType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.commerce.medical.insurance.filesteam.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("channel", this.channel);
		txtParams.put("open_id", this.openId);
		txtParams.put("scene_type", this.sceneType);
		txtParams.put("user_id", this.userId);
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

	public Class<AlipayCommerceMedicalInsuranceFilesteamUploadResponse> getResponseClass() {
		return AlipayCommerceMedicalInsuranceFilesteamUploadResponse.class;
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
