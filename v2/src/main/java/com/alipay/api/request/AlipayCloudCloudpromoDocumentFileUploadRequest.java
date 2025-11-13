package com.alipay.api.request;

import com.alipay.api.domain.DocumentProcessRule;
import com.alipay.api.domain.TableSchema;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCloudCloudpromoDocumentFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.document.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2025-11-07 17:12:40
 */
public class AlipayCloudCloudpromoDocumentFileUploadRequest implements AlipayUploadRequest<AlipayCloudCloudpromoDocumentFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* API-Key
	 */
	private String apiKey;

	/** 
	* MIME TYPE
	 */
	private String contentType;

	/** 
	* 客户id

	 */
	private String customerId;

	/** 
	* 应用数据ID（创建应用数据时为空，更新需指定应用数据ID）
	 */
	private String documentId;

	/** 
	* 上传文件的二进制流（最大20MB）
	 */
	private FileItem fileContent;

	/** 
	* 操作人标识

	 */
	private String operator;

	/** 
	* 数据处理规则
	 */
	private DocumentProcessRule processRule;

	/** 
	* 表结构配置
	 */
	private TableSchema tableSchema;

	/** 
	* 空间ID
	 */
	private String tenantId;

	/** 
	* 数据类型
	 */
	private String type;

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getApiKey() {
		return this.apiKey;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType() {
		return this.contentType;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return this.customerId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentId() {
		return this.documentId;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}

	public void setProcessRule(DocumentProcessRule processRule) {
		this.processRule = processRule;
	}
	public DocumentProcessRule getProcessRule() {
		return this.processRule;
	}

	public void setTableSchema(TableSchema tableSchema) {
		this.tableSchema = tableSchema;
	}
	public TableSchema getTableSchema() {
		return this.tableSchema;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTenantId() {
		return this.tenantId;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
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
		return "alipay.cloud.cloudpromo.document.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("api_key", this.apiKey);
		txtParams.put("content_type", this.contentType);
		txtParams.put("customer_id", this.customerId);
		txtParams.put("document_id", this.documentId);
		txtParams.put("operator", this.operator);
		txtParams.put("process_rule", this.processRule == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.processRule, true));
		txtParams.put("table_schema", this.tableSchema == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.tableSchema, true));
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("type", this.type);
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

	public Class<AlipayCloudCloudpromoDocumentFileUploadResponse> getResponseClass() {
		return AlipayCloudCloudpromoDocumentFileUploadResponse.class;
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
