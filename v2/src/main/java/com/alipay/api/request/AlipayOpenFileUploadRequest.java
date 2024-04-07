package com.alipay.api.request;

import com.alipay.api.domain.FileUploadExtraParam;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 16:22:05
 */
public class AlipayOpenFileUploadRequest implements AlipayUploadRequest<AlipayOpenFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 素材使用场景，请关联其他开放平台接口联合使用。如果素材用于内容发布，请必传入content_creation
	 */
	private String bizCode;

	/** 
	* 文件额外参数
	 */
	private FileUploadExtraParam extraParameters;

	/** 
	* 文件内容的二进制流
	 */
	private FileItem fileContent;

	/** 
	* 文件的md5值，如果不传则不校验md5
	 */
	private String md5;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode() {
		return this.bizCode;
	}

	public void setExtraParameters(FileUploadExtraParam extraParameters) {
		this.extraParameters = extraParameters;
	}
	public FileUploadExtraParam getExtraParameters() {
		return this.extraParameters;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getMd5() {
		return this.md5;
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
		return "alipay.open.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("extra_parameters", this.extraParameters == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.extraParameters, true));
		txtParams.put("md5", this.md5);
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

	public Class<AlipayOpenFileUploadResponse> getResponseClass() {
		return AlipayOpenFileUploadResponse.class;
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
