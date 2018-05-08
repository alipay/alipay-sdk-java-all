package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileDeviceinfoGetidbytokenResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.getidbytoken request
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 16:20:47
 */
public class AlipayMobileDeviceinfoGetidbytokenRequest implements AlipayRequest<AlipayMobileDeviceinfoGetidbytokenResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 蚂蚁金服集团安全生成的设备token
	 */
	private String apdidtoken;

	/** 
	* 阿里巴巴集团安全生成的设备token
	 */
	private String umidtoken;

	public void setApdidtoken(String apdidtoken) {
		this.apdidtoken = apdidtoken;
	}
	public String getApdidtoken() {
		return this.apdidtoken;
	}

	public void setUmidtoken(String umidtoken) {
		this.umidtoken = umidtoken;
	}
	public String getUmidtoken() {
		return this.umidtoken;
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
		return "alipay.mobile.deviceinfo.getidbytoken";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apdidtoken", this.apdidtoken);
		txtParams.put("umidtoken", this.umidtoken);
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

	public Class<AlipayMobileDeviceinfoGetidbytokenResponse> getResponseClass() {
		return AlipayMobileDeviceinfoGetidbytokenResponse.class;
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
