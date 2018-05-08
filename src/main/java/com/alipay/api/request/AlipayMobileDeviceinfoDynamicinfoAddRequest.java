package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileDeviceinfoDynamicinfoAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.dynamicinfo.add request
 * 
 * @author auto create
 * @since 1.0, 2017-03-27 19:38:25
 */
public class AlipayMobileDeviceinfoDynamicinfoAddRequest implements AlipayRequest<AlipayMobileDeviceinfoDynamicinfoAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 蚂蚁金服集团生成的设备id
	 */
	private String apdid;

	/** 
	* 客户端采集的设备动态信息，格式为json串
	 */
	private String dynamicinfo;

	public void setApdid(String apdid) {
		this.apdid = apdid;
	}
	public String getApdid() {
		return this.apdid;
	}

	public void setDynamicinfo(String dynamicinfo) {
		this.dynamicinfo = dynamicinfo;
	}
	public String getDynamicinfo() {
		return this.dynamicinfo;
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
		return "alipay.mobile.deviceinfo.dynamicinfo.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apdid", this.apdid);
		txtParams.put("dynamicinfo", this.dynamicinfo);
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

	public Class<AlipayMobileDeviceinfoDynamicinfoAddResponse> getResponseClass() {
		return AlipayMobileDeviceinfoDynamicinfoAddResponse.class;
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
