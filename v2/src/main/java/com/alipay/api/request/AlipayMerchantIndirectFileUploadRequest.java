package com.alipay.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMerchantIndirectFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.merchant.indirect.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:46:43
 */
public class AlipayMerchantIndirectFileUploadRequest implements AlipayUploadRequest<AlipayMerchantIndirectFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 文件二进制流
	 */
	private FileItem fileContent;

	/** 
	* 文件名(用于幂等),构造字段时，可使用年月日_报告类型来处理。
	 */
	private String fileName;

	/** 
	* 文件类型，目前仅支持txt
	 */
	private String fileType;

	/** 
	* 间联小程序ID
	 */
	private String mrchindAppId;

	/** 
	* 当前文件的记录总数(校验用)
	 */
	private Long recordCount;

	/** 
	* 报告类型，(DAILY/WEEK/MONTH)
	 */
	private String reportType;

	/** 
	* 报告周期的结束时间，时间格式为yyyy-MM-dd，默认为当天0点
	 */
	private Date timePeriodEnd;

	/** 
	* 报告周期的起始时间，时间格式为yyyy-MM-dd，默认为当天0点
	 */
	private Date timePeriodStart;

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
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

	public void setMrchindAppId(String mrchindAppId) {
		this.mrchindAppId = mrchindAppId;
	}
	public String getMrchindAppId() {
		return this.mrchindAppId;
	}

	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}
	public Long getRecordCount() {
		return this.recordCount;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getReportType() {
		return this.reportType;
	}

	public void setTimePeriodEnd(Date timePeriodEnd) {
		this.timePeriodEnd = timePeriodEnd;
	}
	public Date getTimePeriodEnd() {
		return this.timePeriodEnd;
	}

	public void setTimePeriodStart(Date timePeriodStart) {
		this.timePeriodStart = timePeriodStart;
	}
	public Date getTimePeriodStart() {
		return this.timePeriodStart;
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
		return "alipay.merchant.indirect.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_type", this.fileType);
		txtParams.put("mrchind_app_id", this.mrchindAppId);
		txtParams.put("record_count", this.recordCount);
		txtParams.put("report_type", this.reportType);
		txtParams.put("time_period_end", this.timePeriodEnd);
		txtParams.put("time_period_start", this.timePeriodStart);
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

	public Class<AlipayMerchantIndirectFileUploadResponse> getResponseClass() {
		return AlipayMerchantIndirectFileUploadResponse.class;
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
