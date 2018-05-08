package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDatabizCorePaymentAbilityGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.get request
 * 
 * @author auto create
 * @since 1.0, 2017-03-27 18:01:50
 */
public class AlipayDatabizCorePaymentAbilityGetRequest implements AlipayRequest<AlipayDatabizCorePaymentAbilityGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 外部商户应用名称
	 */
	private String appInfo;

	/** 
	* 移动设备唯一标示码，后续版本废弃该参数，手机号码作为唯一查询标示。
	 */
	private String imei;

	/** 
	* 手机号码，必选！
	 */
	private String mobileNum;

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public String getAppInfo() {
		return this.appInfo;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getImei() {
		return this.imei;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getMobileNum() {
		return this.mobileNum;
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
		return "alipay.databiz.core.payment.ability.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_info", this.appInfo);
		txtParams.put("imei", this.imei);
		txtParams.put("mobile_num", this.mobileNum);
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

	public Class<AlipayDatabizCorePaymentAbilityGetResponse> getResponseClass() {
		return AlipayDatabizCorePaymentAbilityGetResponse.class;
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
