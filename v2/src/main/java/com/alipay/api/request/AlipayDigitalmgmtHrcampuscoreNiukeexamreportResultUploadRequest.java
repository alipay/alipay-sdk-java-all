package com.alipay.api.request;

import com.alipay.api.domain.NiukeExamReportCallbackRequest;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcampuscore.niukeexamreport.result.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:59:41
 */
public class AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadRequest implements AlipayUploadRequest<AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 牛客笔试报告变更回调请求体
	 */
	private NiukeExamReportCallbackRequest niukeExamReportCallbackRequest;

	/** 
	* 成绩报告二进制字节流
	 */
	private FileItem reportFile;

	public void setNiukeExamReportCallbackRequest(NiukeExamReportCallbackRequest niukeExamReportCallbackRequest) {
		this.niukeExamReportCallbackRequest = niukeExamReportCallbackRequest;
	}
	public NiukeExamReportCallbackRequest getNiukeExamReportCallbackRequest() {
		return this.niukeExamReportCallbackRequest;
	}

	public void setReportFile(FileItem reportFile) {
		this.reportFile = reportFile;
	}
	public FileItem getReportFile() {
		return this.reportFile;
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
		return "alipay.digitalmgmt.hrcampuscore.niukeexamreport.result.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("niuke_exam_report_callback_request", this.niukeExamReportCallbackRequest == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.niukeExamReportCallbackRequest, true));
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
		params.put("report_file", this.reportFile);
		return params;
	}

	public Class<AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadResponse> getResponseClass() {
		return AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadResponse.class;
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
