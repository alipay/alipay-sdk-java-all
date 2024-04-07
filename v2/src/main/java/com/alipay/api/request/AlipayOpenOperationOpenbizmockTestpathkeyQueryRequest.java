package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testpathkey.query request
 * 
 * @author auto create
 * @since 1.0, 2024-01-12 11:22:29
 */
public class AlipayOpenOperationOpenbizmockTestpathkeyQueryRequest implements AlipayUploadRequest<AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse> {

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
	* 1
	 */
	private String e;

	/** 
	* 1
	 */
	private FileItem f;

	/** 
	* ceshi
	 */
	private String keykey;

	/** 
	* 1
	 */
	private String testPrice;

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

	public void setE(String e) {
		this.e = e;
	}
	public String getE() {
		return this.e;
	}

	public void setF(FileItem f) {
		this.f = f;
	}
	public FileItem getF() {
		return this.f;
	}

	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}
	public String getKeykey() {
		return this.keykey;
	}

	public void setTestPrice(String testPrice) {
		this.testPrice = testPrice;
	}
	public String getTestPrice() {
		return this.testPrice;
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
		return "alipay.open.operation.openbizmock.testpathkey.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("a", this.a);
		txtParams.put("b", this.b);
		txtParams.put("c", this.c);
		txtParams.put("d", this.d);
		txtParams.put("e", this.e);
		txtParams.put("keykey", this.keykey);
		txtParams.put("test_price", this.testPrice);
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
		params.put("f", this.f);
		return params;
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
