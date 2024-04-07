package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AntMerchantExpandStaticstockFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ant.merchant.expand.staticstock.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-01-04 20:01:58
 */
public class AntMerchantExpandStaticstockFileUploadRequest implements AlipayUploadRequest<AntMerchantExpandStaticstockFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 文件内容，以文件流形式进行传输
	 */
	private FileItem fileContent;

	/** 
	* 上传的内容中存在的文件静态格式
	 */
	private String fileFormat;

	/** 
	* 文件名称
	 */
	private String fileName;

	/** 
	* 文件url
	 */
	private String fileUrl;

	/** 
	* 库存变动周期结束时间，默认前一天的23点59分59秒
	 */
	private String timePeriodEnd;

	/** 
	* 库存变动周期开始时间，默认前一天的0点
	 */
	private String timePeriodStart;

	/** 
	* 上传excel文件中文件的条数
	 */
	private Long totalCount;

	/** 
	* 上传批次号
	 */
	private String uploadBatchNo;

	/** 
	* 上传的类型：分为文件上传和连接上传；
	 */
	private String uploadFormat;

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

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setTimePeriodEnd(String timePeriodEnd) {
		this.timePeriodEnd = timePeriodEnd;
	}
	public String getTimePeriodEnd() {
		return this.timePeriodEnd;
	}

	public void setTimePeriodStart(String timePeriodStart) {
		this.timePeriodStart = timePeriodStart;
	}
	public String getTimePeriodStart() {
		return this.timePeriodStart;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setUploadBatchNo(String uploadBatchNo) {
		this.uploadBatchNo = uploadBatchNo;
	}
	public String getUploadBatchNo() {
		return this.uploadBatchNo;
	}

	public void setUploadFormat(String uploadFormat) {
		this.uploadFormat = uploadFormat;
	}
	public String getUploadFormat() {
		return this.uploadFormat;
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
		return "ant.merchant.expand.staticstock.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("file_format", this.fileFormat);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_url", this.fileUrl);
		txtParams.put("time_period_end", this.timePeriodEnd);
		txtParams.put("time_period_start", this.timePeriodStart);
		txtParams.put("total_count", this.totalCount);
		txtParams.put("upload_batch_no", this.uploadBatchNo);
		txtParams.put("upload_format", this.uploadFormat);
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

	public Class<AntMerchantExpandStaticstockFileUploadResponse> getResponseClass() {
		return AntMerchantExpandStaticstockFileUploadResponse.class;
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
