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
 * @since 1.0, 2025-12-12 11:02:42
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
	* 项目ID
	 */
	private String projectId;

	/** 
	* 解决方案
	 */
	private String solutionType;

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
		txtParams.put("project_id", this.projectId);
		txtParams.put("solution_type", this.solutionType);
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
