package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOfflineProviderNpassporterFaceVerifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.face.verify request
 * 
 * @author auto create
 * @since 1.0, 2026-06-03 10:18:49
 */
public class AlipayOfflineProviderNpassporterFaceVerifyRequest implements AlipayUploadRequest<AlipayOfflineProviderNpassporterFaceVerifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户在支付宝uid
	 */
	private String alipayId;

	/** 
	* 文件内容
	 */
	private FileItem fileContent;

	/** 
	* 用户在支付宝uid
	 */
	private String openId;

	/** 
	* 照片URL
	 */
	private String photoUrl;

	/** 
	* true: photoUrl字段为RSA加密后Base64编码的密文，false或不传: photoUrl字段为明文URL（向后兼容）
	 */
	private Boolean photoUrlEncrypted;

	/** 
	* 项目ID
	 */
	private String projectId;

	/** 
	* 解决方案
	 */
	private String solutionType;

	/** 
	* 接入方传入具体活动场次唯一ID即可，此字段作为密算证件号的关键信息，即同一场次下的人群传统一ID即可，若不填写默认以“projectID”字段作为密算计算信息。接入方调用支付宝传入的场次ID，需跟自己按密算规则传入的ID保持一致，否则会出现两侧密算后信息无法匹配。
	 */
	private String subProjectId;

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayId() {
		return this.alipayId;
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

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrlEncrypted(Boolean photoUrlEncrypted) {
		this.photoUrlEncrypted = photoUrlEncrypted;
	}
	public Boolean getPhotoUrlEncrypted() {
		return this.photoUrlEncrypted;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectId() {
		return this.projectId;
	}

	public void setSolutionType(String solutionType) {
		this.solutionType = solutionType;
	}
	public String getSolutionType() {
		return this.solutionType;
	}

	public void setSubProjectId(String subProjectId) {
		this.subProjectId = subProjectId;
	}
	public String getSubProjectId() {
		return this.subProjectId;
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
		return "alipay.offline.provider.npassporter.face.verify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_id", this.alipayId);
		txtParams.put("open_id", this.openId);
		txtParams.put("photo_url", this.photoUrl);
		txtParams.put("photo_url_encrypted", this.photoUrlEncrypted);
		txtParams.put("project_id", this.projectId);
		txtParams.put("solution_type", this.solutionType);
		txtParams.put("sub_project_id", this.subProjectId);
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

	public Class<AlipayOfflineProviderNpassporterFaceVerifyResponse> getResponseClass() {
		return AlipayOfflineProviderNpassporterFaceVerifyResponse.class;
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
