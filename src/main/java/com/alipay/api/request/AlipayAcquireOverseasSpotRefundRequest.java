package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAcquireOverseasSpotRefundResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.acquire.overseas.spot.refund request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOverseasSpotRefundRequest implements AlipayRequest<AlipayAcquireOverseasSpotRefundResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* refund currency
	 */
	private String currency;

	/** 
	* The refund order id on partner system.

partner_refund_id together with partner identify a refund transaction
	 */
	private String partnerRefundId;

	/** 
	* The original partner transaction id given in the payment request
	 */
	private String partnerTransId;

	/** 
	* Less than or equal to the original transaction amont and the left transaction amount if ever refunded.
	 */
	private String refundAmount;

	/** 
	* The reason of refund
	 */
	private String refundReason;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return this.currency;
	}

	public void setPartnerRefundId(String partnerRefundId) {
		this.partnerRefundId = partnerRefundId;
	}
	public String getPartnerRefundId() {
		return this.partnerRefundId;
	}

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId() {
		return this.partnerTransId;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason() {
		return this.refundReason;
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
		return "alipay.acquire.overseas.spot.refund";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("currency", this.currency);
		txtParams.put("partner_refund_id", this.partnerRefundId);
		txtParams.put("partner_trans_id", this.partnerTransId);
		txtParams.put("refund_amount", this.refundAmount);
		txtParams.put("refund_reason", this.refundReason);
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

	public Class<AlipayAcquireOverseasSpotRefundResponse> getResponseClass() {
		return AlipayAcquireOverseasSpotRefundResponse.class;
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
