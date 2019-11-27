package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.GavintestNewLeveaOne;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenOpenednCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.openedn.create request
 * 
 * @author auto create
 * @since 1.0, 2019-10-21 17:48:31
 */
public class AlipayOpenOpenednCreateRequest implements AlipayRequest<AlipayOpenOpenednCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 21
	 */
	private List<GavintestNewLeveaOne> sed;

	/** 
	* 1
	 */
	private String str;

	public void setSed(List<GavintestNewLeveaOne> sed) {
		this.sed = sed;
	}
	public List<GavintestNewLeveaOne> getSed() {
		return this.sed;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return this.str;
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
		return "alipay.open.openedn.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("sed", this.sed == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.sed, true));
		txtParams.put("str", this.str);
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

	public Class<AlipayOpenOpenednCreateResponse> getResponseClass() {
		return AlipayOpenOpenednCreateResponse.class;
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
