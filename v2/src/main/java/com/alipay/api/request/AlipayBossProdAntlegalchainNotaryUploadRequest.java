package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayBossProdAntlegalchainNotaryUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.notary.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:31:04
 */
public class AlipayBossProdAntlegalchainNotaryUploadRequest implements AlipayUploadRequest<AlipayBossProdAntlegalchainNotaryUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务应用英文名
	 */
	private String appCode;

	/** 
	* 业务唯一流水id，业务数据请求唯一标识
	 */
	private String businessUniqueId;

	/** 
	* 文件信息，文件二进制字节流，最大为10M
	 */
	private FileItem content;

	/** 
	* 上传文件的名字
	 */
	private String fileName;

	/** 
	* 文件类型
	 */
	private String fileType;

	/** 
	* 租户信息
	 */
	private String tenant;

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getAppCode() {
		return this.appCode;
	}

	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}
	public String getBusinessUniqueId() {
		return this.businessUniqueId;
	}

	public void setContent(FileItem content) {
		this.content = content;
	}
	public FileItem getContent() {
		return this.content;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return this.fileName;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getTenant() {
		return this.tenant;
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
		return "alipay.boss.prod.antlegalchain.notary.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_code", this.appCode);
		txtParams.put("business_unique_id", this.businessUniqueId);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_type", this.fileType);
		txtParams.put("tenant", this.tenant);
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
		params.put("content", this.content);
		return params;
	}

	public Class<AlipayBossProdAntlegalchainNotaryUploadResponse> getResponseClass() {
		return AlipayBossProdAntlegalchainNotaryUploadResponse.class;
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
