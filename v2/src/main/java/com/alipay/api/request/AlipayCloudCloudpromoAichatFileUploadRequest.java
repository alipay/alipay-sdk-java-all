package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCloudCloudpromoAichatFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 15:17:03
 */
public class AlipayCloudCloudpromoAichatFileUploadRequest implements AlipayUploadRequest<AlipayCloudCloudpromoAichatFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户唯一标识，由客户生成
	 */
	private String customerId;

	/** 
	* 文件内容的二进制流
	 */
	private FileItem fileContent;

	/** 
	* 文件后缀名
	 */
	private String fileExtension;

	/** 
	* 文件id，首次上传文件时由问答系统生成并返回给调用方。
	 */
	private String fileId;

	/** 
	* 文件名称
	 */
	private String fileName;

	/** 
	* 文件用途
	 */
	private String fileUsage;

	/** 
	* 当后缀file_extension为xlsx/xls/csv/json时，index_column字段传值，表示对文件内容中指定的一级字段/列名建立优化索引；如果没有传递该值或不属于上述后缀，表示不针对字段级别建立索引。
	 */
	private String indexColumn;

	/** 
	* 场景唯一标识，由客户提供
	 */
	private String sceneId;

	/** 
	* 会话ID，由客户生成
	 */
	private String sessionId;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return this.customerId;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public String getFileExtension() {
		return this.fileExtension;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId() {
		return this.fileId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return this.fileName;
	}

	public void setFileUsage(String fileUsage) {
		this.fileUsage = fileUsage;
	}
	public String getFileUsage() {
		return this.fileUsage;
	}

	public void setIndexColumn(String indexColumn) {
		this.indexColumn = indexColumn;
	}
	public String getIndexColumn() {
		return this.indexColumn;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneId() {
		return this.sceneId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId() {
		return this.sessionId;
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
		return "alipay.cloud.cloudpromo.aichat.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("customer_id", this.customerId);
		txtParams.put("file_extension", this.fileExtension);
		txtParams.put("file_id", this.fileId);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_usage", this.fileUsage);
		txtParams.put("index_column", this.indexColumn);
		txtParams.put("scene_id", this.sceneId);
		txtParams.put("session_id", this.sessionId);
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

	public Class<AlipayCloudCloudpromoAichatFileUploadResponse> getResponseClass() {
		return AlipayCloudCloudpromoAichatFileUploadResponse.class;
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
