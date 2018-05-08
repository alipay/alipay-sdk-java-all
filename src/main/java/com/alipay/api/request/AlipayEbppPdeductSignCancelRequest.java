package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppPdeductSignCancelResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.cancel request
 * 
 * @author auto create
 * @since 1.0, 2017-08-04 11:19:20
 */
public class AlipayEbppPdeductSignCancelRequest implements AlipayRequest<AlipayEbppPdeductSignCancelResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 此值只是供代扣中心做最后的渠道统计用，并不做值是什么的强校验，只要不为空就可以
	 */
	private String agentChannel;

	/** 
	* 标识发起方的ID，从服务窗发起则为appId的值，appId即开放平台分配给接入ISV的id，此处也可以随便真其它值，只要能标识唯一即可
	 */
	private String agentCode;

	/** 
	* 支付宝代扣协议ID
	 */
	private String agreementId;

	/** 
	* 需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb=自己指定的回跳连接地址,访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb=www.baidu.com则最后回调的内容是www.baidu.com?token=312314ADFDSFAS,然后签约时直接取得地址后token的值即可
	 */
	private String payPasswordToken;

	/** 
	* 用户ID
	 */
	private String userId;

	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}
	public String getAgentChannel() {
		return this.agentChannel;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId() {
		return this.agreementId;
	}

	public void setPayPasswordToken(String payPasswordToken) {
		this.payPasswordToken = payPasswordToken;
	}
	public String getPayPasswordToken() {
		return this.payPasswordToken;
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
		return "alipay.ebpp.pdeduct.sign.cancel";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("pay_password_token", this.payPasswordToken);
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

	public Class<AlipayEbppPdeductSignCancelResponse> getResponseClass() {
		return AlipayEbppPdeductSignCancelResponse.class;
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
