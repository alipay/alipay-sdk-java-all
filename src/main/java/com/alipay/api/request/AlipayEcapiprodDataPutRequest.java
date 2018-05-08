package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcapiprodDataPutResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.data.put request
 * 
 * @author auto create
 * @since 1.0, 2015-04-02 16:45:23
 */
public class AlipayEcapiprodDataPutRequest implements AlipayRequest<AlipayEcapiprodDataPutResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 数据类型
	 */
	private String category;

	/** 
	* 数据字符编码，默认UTF-8
	 */
	private String charSet;

	/** 
	* 数据采集平台生成的采集任务编号
	 */
	private String collectingTaskId;

	/** 
	* 身份证，工商注册号等
	 */
	private String entityCode;

	/** 
	* 姓名或公司名等，name和code不能同时为空
	 */
	private String entityName;

	/** 
	* 人或公司等
	 */
	private String entityType;

	/** 
	* 渠道商
	 */
	private String isvCode;

	/** 
	* 数据主体,以json格式传输的数据
	 */
	private String jsonData;

	/** 
	* 数据合作方
	 */
	private String orgCode;

	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return this.category;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}
	public String getCharSet() {
		return this.charSet;
	}

	public void setCollectingTaskId(String collectingTaskId) {
		this.collectingTaskId = collectingTaskId;
	}
	public String getCollectingTaskId() {
		return this.collectingTaskId;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityCode() {
		return this.entityCode;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getEntityType() {
		return this.entityType;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode() {
		return this.isvCode;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	public String getJsonData() {
		return this.jsonData;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode() {
		return this.orgCode;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.ecapiprod.data.put";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("char_set", this.charSet);
		txtParams.put("collecting_task_id", this.collectingTaskId);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("json_data", this.jsonData);
		txtParams.put("org_code", this.orgCode);
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

	public Class<AlipayEcapiprodDataPutResponse> getResponseClass() {
		return AlipayEcapiprodDataPutResponse.class;
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
