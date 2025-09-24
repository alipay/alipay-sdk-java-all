package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCloudCloudpromoFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 21:52:40
 */
public class AlipayCloudCloudpromoFileUploadRequest implements AlipayUploadRequest<AlipayCloudCloudpromoFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 客户
	 */
	private String customerId;

	/** 
	* 描述信息
	 */
	private String desc;

	/** 
	* 上传文件的二进制字节流
	 */
	private FileItem fileContent;

	/** 
	* 指定文件的具体编码格式（如扩展名或 MIME 类型）
	 */
	private String fileFormat;

	/** 
	* 文件名称
	 */
	private String fileName;

	/** 
	* 标识文件的通用类别（如文本、图像、视频）。
	 */
	private String fileType;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return this.customerId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public String getFileFormat() {
		return this.fileFormat;
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
		return "alipay.cloud.cloudpromo.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("customer_id", this.customerId);
		txtParams.put("desc", this.desc);
		txtParams.put("file_format", this.fileFormat);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_type", this.fileType);
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

	public Class<AlipayCloudCloudpromoFileUploadResponse> getResponseClass() {
		return AlipayCloudCloudpromoFileUploadResponse.class;
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
