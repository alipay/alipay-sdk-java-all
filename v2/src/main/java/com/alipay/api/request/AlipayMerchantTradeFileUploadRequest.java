package com.alipay.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMerchantTradeFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.merchant.trade.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-10-15 13:52:14
 */
public class AlipayMerchantTradeFileUploadRequest implements AlipayUploadRequest<AlipayMerchantTradeFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 数据聚合维度，用于指定当前上传数据的统计维度。
● merchant：服务商侧商户（商编）维度
● cashier：收银员维度
	 */
	private String dataDim;

	/** 
	* 文件二进制流
	 */
	private FileItem fileContent;

	/** 
	* 文件名(用于幂等)，格式规范见说明
	 */
	private String fileName;

	/** 
	* 文件类型，目前仅支持txt
	 */
	private String fileType;

	/** 
	* 服务商小程序ID
	 */
	private String isvAppId;

	/** 
	* 文件中数据条数
	 */
	private Long recordCount;

	/** 
	* 报告类型，(DAY/WEEK/MONTH)
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

	public void setDataDim(String dataDim) {
		this.dataDim = dataDim;
	}
	public String getDataDim() {
		return this.dataDim;
	}

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

	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}
	public String getIsvAppId() {
		return this.isvAppId;
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
		return "alipay.merchant.trade.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("data_dim", this.dataDim);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_type", this.fileType);
		txtParams.put("isv_app_id", this.isvAppId);
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

	public Class<AlipayMerchantTradeFileUploadResponse> getResponseClass() {
		return AlipayMerchantTradeFileUploadResponse.class;
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
