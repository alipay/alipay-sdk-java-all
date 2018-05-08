package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayInsDataAutoCoefficientSyncResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ins.data.auto.coefficient.sync request
 * 
 * @author auto create
 * @since 1.0, 2017-09-08 15:48:05
 */
public class AlipayInsDataAutoCoefficientSyncRequest implements AlipayUploadRequest<AlipayInsDataAutoCoefficientSyncResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* csv文件
	 */
	private FileItem coeffecientTableContent;

	/** 
	* 同步表id，每次同步的系数表应有唯一可辨认的id
	 */
	private String coeffecientTableId;

	/** 
	* 同步系数表的条目数量
	 */
	private Long coeffecientTableSize;

	/** 
	* 请求id，每次请求唯一
	 */
	private String requestId;

	public void setCoeffecientTableContent(FileItem coeffecientTableContent) {
		this.coeffecientTableContent = coeffecientTableContent;
	}
	public FileItem getCoeffecientTableContent() {
		return this.coeffecientTableContent;
	}

	public void setCoeffecientTableId(String coeffecientTableId) {
		this.coeffecientTableId = coeffecientTableId;
	}
	public String getCoeffecientTableId() {
		return this.coeffecientTableId;
	}

	public void setCoeffecientTableSize(Long coeffecientTableSize) {
		this.coeffecientTableSize = coeffecientTableSize;
	}
	public Long getCoeffecientTableSize() {
		return this.coeffecientTableSize;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId() {
		return this.requestId;
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
		return "alipay.ins.data.auto.coefficient.sync";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("coeffecient_table_id", this.coeffecientTableId);
		txtParams.put("coeffecient_table_size", this.coeffecientTableSize);
		txtParams.put("request_id", this.requestId);
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
		params.put("coeffecient_table_content", this.coeffecientTableContent);
		return params;
	}

	public Class<AlipayInsDataAutoCoefficientSyncResponse> getResponseClass() {
		return AlipayInsDataAutoCoefficientSyncResponse.class;
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
