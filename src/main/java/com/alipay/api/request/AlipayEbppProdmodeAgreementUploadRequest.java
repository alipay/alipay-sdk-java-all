package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppProdmodeAgreementUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.prodmode.agreement.upload request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppProdmodeAgreementUploadRequest implements AlipayUploadRequest<AlipayEbppProdmodeAgreementUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 操作者名称
	 */
	private String operatorName;

	/** 
	* 创建批次任务ID，生成结果需要外部商户邦道提交批次水燃入驻信息，调用alipay.ebpp.isv.prodmode.create入驻信息开放接口，缴费端接收请求，创建批次任务，生成任务ID，通过创建任务接口返回给邦道。
	 */
	private String taskId;

	/** 
	* byte[]数组类型值，提供邦道授权函协议上传，上传文件格式必须是.rar或.zip压缩文件。
	 */
	private FileItem uploadFile;

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId() {
		return this.taskId;
	}

	public void setUploadFile(FileItem uploadFile) {
		this.uploadFile = uploadFile;
	}
	public FileItem getUploadFile() {
		return this.uploadFile;
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
		return "alipay.ebpp.prodmode.agreement.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("operator_name", this.operatorName);
		txtParams.put("task_id", this.taskId);
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
		params.put("upload_file", this.uploadFile);
		return params;
	}

	public Class<AlipayEbppProdmodeAgreementUploadResponse> getResponseClass() {
		return AlipayEbppProdmodeAgreementUploadResponse.class;
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
