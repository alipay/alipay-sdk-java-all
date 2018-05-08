package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcardEduPublicBindResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecard.edu.public.bind request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:41
 */
public class AlipayEcardEduPublicBindRequest implements AlipayRequest<AlipayEcardEduPublicBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 机构编码
	 */
	private String agentCode;

	/** 
	* 公众账号协议Id
	 */
	private String agreementId;

	/** 
	* 支付宝userId
	 */
	private String alipayUserId;

	/** 
	* 一卡通姓名
	 */
	private String cardName;

	/** 
	* 一卡通卡号
	 */
	private String cardNo;

	/** 
	* 公众账号id
	 */
	private String publicId;

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

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId() {
		return this.alipayUserId;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardName() {
		return this.cardName;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return this.cardNo;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId() {
		return this.publicId;
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
		return "alipay.ecard.edu.public.bind";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("alipay_user_id", this.alipayUserId);
		txtParams.put("card_name", this.cardName);
		txtParams.put("card_no", this.cardNo);
		txtParams.put("public_id", this.publicId);
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

	public Class<AlipayEcardEduPublicBindResponse> getResponseClass() {
		return AlipayEcardEduPublicBindResponse.class;
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
