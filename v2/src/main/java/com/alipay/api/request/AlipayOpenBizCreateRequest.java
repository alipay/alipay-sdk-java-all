package com.alipay.api.request;

import com.alipay.api.domain.Gavintest;
import com.alipay.api.domain.GavintestNewLeveaOne;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenBizCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.biz.create request
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:30:29
 */
public class AlipayOpenBizCreateRequest implements AlipayRequest<AlipayOpenBizCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 2121
	 */
	private Gavintest a;

	/** 
	* 1
	 */
	private String b;

	/** 
	* 21
	 */
	private GavintestNewLeveaOne de;

	/** 
	* 1
	 */
	private String stringbuff;

	public void setA(Gavintest a) {
		this.a = a;
	}
	public Gavintest getA() {
		return this.a;
	}

	public void setB(String b) {
		this.b = b;
	}
	public String getB() {
		return this.b;
	}

	public void setDe(GavintestNewLeveaOne de) {
		this.de = de;
	}
	public GavintestNewLeveaOne getDe() {
		return this.de;
	}

	public void setStringbuff(String stringbuff) {
		this.stringbuff = stringbuff;
	}
	public String getStringbuff() {
		return this.stringbuff;
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
		return "alipay.open.biz.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("a", this.a == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.a, true));
		txtParams.put("b", this.b);
		txtParams.put("de", this.de == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.de, true));
		txtParams.put("stringbuff", this.stringbuff);
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

	public Class<AlipayOpenBizCreateResponse> getResponseClass() {
		return AlipayOpenBizCreateResponse.class;
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
