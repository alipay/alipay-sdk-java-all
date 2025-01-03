package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataDataserviceSchemaerrorcodeRainyQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.dataservice.schemaerrorcode.rainy.query request
 * 
 * @author auto create
 * @since 1.0, 2024-11-11 20:22:19
 */
public class AlipayDataDataserviceSchemaerrorcodeRainyQueryRequest implements AlipayRequest<AlipayDataDataserviceSchemaerrorcodeRainyQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 1
	 */
	private String stringMust;

	/** 
	* 1
	 */
	private String stringRegexNum;

	public void setStringMust(String stringMust) {
		this.stringMust = stringMust;
	}
	public String getStringMust() {
		return this.stringMust;
	}

	public void setStringRegexNum(String stringRegexNum) {
		this.stringRegexNum = stringRegexNum;
	}
	public String getStringRegexNum() {
		return this.stringRegexNum;
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
		return "alipay.data.dataservice.schemaerrorcode.rainy.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("string_must", this.stringMust);
		txtParams.put("string_regex_num", this.stringRegexNum);
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

	public Class<AlipayDataDataserviceSchemaerrorcodeRainyQueryResponse> getResponseClass() {
		return AlipayDataDataserviceSchemaerrorcodeRainyQueryResponse.class;
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
