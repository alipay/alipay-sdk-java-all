package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.ZhimaDataBatchFeedbackResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: zhima.data.batch.feedback request
 * 
 * @author auto create
 * @since 1.0, 2017-05-02 14:40:53
 */
public class ZhimaDataBatchFeedbackRequest implements AlipayUploadRequest<ZhimaDataBatchFeedbackResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 扩展参数
	 */
	private String bizExtParams;

	/** 
	* 单条数据的数据列，多个列以逗号隔开
	 */
	private String columns;

	/** 
	* 反馈的json格式文件，其中{"records":  是每个文件的固定开头，文件中的字段名请使用数据反馈模板（该模板是通过“获取数据反馈模板”接口获得）中字段编码列的英文字段来组装
	 */
	private FileItem file;

	/** 
	* 是反馈文件的数据编码，如果文件格式是UTF-8，则填写UTF-8，如果文件格式是GBK，则填写GBK
	 */
	private String fileCharset;

	/** 
	* 文件描述信息
	 */
	private String fileDescription;

	/** 
	* 反馈的数据类型
	 */
	private String fileType;

	/** 
	* 主键列使用反馈字段进行组合，也可以使用反馈的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no,pay_month或者order_no,bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键列
	 */
	private String primaryKeyColumns;

	/** 
	* 文件数据记录条数
	 */
	private String records;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams() {
		return this.bizExtParams;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getColumns() {
		return this.columns;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}
	public FileItem getFile() {
		return this.file;
	}

	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}
	public String getFileCharset() {
		return this.fileCharset;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFileDescription() {
		return this.fileDescription;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setPrimaryKeyColumns(String primaryKeyColumns) {
		this.primaryKeyColumns = primaryKeyColumns;
	}
	public String getPrimaryKeyColumns() {
		return this.primaryKeyColumns;
	}

	public void setRecords(String records) {
		this.records = records;
	}
	public String getRecords() {
		return this.records;
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
		return "zhima.data.batch.feedback";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_ext_params", this.bizExtParams);
		txtParams.put("columns", this.columns);
		txtParams.put("file_charset", this.fileCharset);
		txtParams.put("file_description", this.fileDescription);
		txtParams.put("file_type", this.fileType);
		txtParams.put("primary_key_columns", this.primaryKeyColumns);
		txtParams.put("records", this.records);
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
		params.put("file", this.file);
		return params;
	}

	public Class<ZhimaDataBatchFeedbackResponse> getResponseClass() {
		return ZhimaDataBatchFeedbackResponse.class;
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
