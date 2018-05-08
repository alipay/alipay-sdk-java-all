package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayGotoneMessageMailSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.gotone.message.mail.send request
 * 
 * @author auto create
 * @since 1.0, 2017-08-03 15:58:50
 */
public class AlipayGotoneMessageMailSendRequest implements AlipayRequest<AlipayGotoneMessageMailSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 模板参数
	 */
	private String arguments;

	/** 
	* 收件人邮箱地址
	 */
	private String receiver;

	/** 
	* 邮件模板对应的serviceCode
	 */
	private String serviceCode;

	/** 
	* 邮件标题
	 */
	private String subject;

	/** 
	* 用户的支付宝ID
	 */
	private String userId;

	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
	public String getArguments() {
		return this.arguments;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver() {
		return this.receiver;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.gotone.message.mail.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("arguments", this.arguments);
		txtParams.put("receiver", this.receiver);
		txtParams.put("service_code", this.serviceCode);
		txtParams.put("subject", this.subject);
		txtParams.put("user_id", this.userId);
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

	public Class<AlipayGotoneMessageMailSendResponse> getResponseClass() {
		return AlipayGotoneMessageMailSendResponse.class;
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
