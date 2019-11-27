package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayLifeassistantProdGatewayAccessResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.lifeassistant.prod.gateway.access request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayLifeassistantProdGatewayAccessRequest implements AlipayRequest<AlipayLifeassistantProdGatewayAccessResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务类型
1-手机充值
2-公共事业缴费
3-信用卡还款
	 */
	private String bizType;

	/** 
	* json格式字符串
	 */
	private String extParams;

	/** 
	* 商户类型
10001-新浪微博
	 */
	private String mType;

	/** 
	* 外部用户ID
	 */
	private String uid;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}
	public String getExtParams() {
		return this.extParams;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}
	public String getmType() {
		return this.mType;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid() {
		return this.uid;
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
		return "alipay.lifeassistant.prod.gateway.access";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("ext_params", this.extParams);
		txtParams.put("m_type", this.mType);
		txtParams.put("uid", this.uid);
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

	public Class<AlipayLifeassistantProdGatewayAccessResponse> getResponseClass() {
		return AlipayLifeassistantProdGatewayAccessResponse.class;
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
