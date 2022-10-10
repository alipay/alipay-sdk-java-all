package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testpathkey.query request
 * 
 * @author auto create
 * @since 1.0, 2022-10-09 14:17:09
 */
public class AlipayOpenOperationOpenbizmockTestpathkeyQueryRequest implements AlipayRequest<AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 测试
	 */
	private String a;

	/** 
	* ceshi
	 */
	private String b;

	/** 
	* 测试
	 */
	private String c;

	/** 
	* 4
	 */
	private String d;

	/** 
	* ceshi
	 */
	private String keykey;

	public void setA(String a) {
		this.a = a;
	}
	public String getA() {
		return this.a;
	}

	public void setB(String b) {
		this.b = b;
	}
	public String getB() {
		return this.b;
	}

	public void setC(String c) {
		this.c = c;
	}
	public String getC() {
		return this.c;
	}

	public void setD(String d) {
		this.d = d;
	}
	public String getD() {
		return this.d;
	}

	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}
	public String getKeykey() {
		return this.keykey;
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
		return "alipay.open.operation.openbizmock.testpathkey.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("a", this.a);
		txtParams.put("b", this.b);
		txtParams.put("c", this.c);
		txtParams.put("d", this.d);
		txtParams.put("keykey", this.keykey);
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

	public Class<AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse> getResponseClass() {
		return AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse.class;
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
