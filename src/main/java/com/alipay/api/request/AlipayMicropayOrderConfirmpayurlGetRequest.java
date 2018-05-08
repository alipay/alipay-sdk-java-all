package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMicropayOrderConfirmpayurlGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.micropay.order.confirmpayurl.get request
 * 
 * @author auto create
 * @since 1.0, 2016-06-06 17:53:18
 */
public class AlipayMicropayOrderConfirmpayurlGetRequest implements AlipayRequest<AlipayMicropayOrderConfirmpayurlGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝订单号，冻结流水号.这个是创建冻结订单支付宝返回的
	 */
	private String alipayOrderNo;

	/** 
	* 支付金额,区间必须在[0.01,30]，只能保留小数点后两位
	 */
	private String amount;

	/** 
	* 支付备注
	 */
	private String memo;

	/** 
	* 收款方的支付宝ID
	 */
	private String receiveUserId;

	/** 
	* 本次转账的外部单据号（只能由字母和数字组成,maxlength=32）
	 */
	private String transferOutOrderNo;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	public String getReceiveUserId() {
		return this.receiveUserId;
	}

	public void setTransferOutOrderNo(String transferOutOrderNo) {
		this.transferOutOrderNo = transferOutOrderNo;
	}
	public String getTransferOutOrderNo() {
		return this.transferOutOrderNo;
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
		return "alipay.micropay.order.confirmpayurl.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_order_no", this.alipayOrderNo);
		txtParams.put("amount", this.amount);
		txtParams.put("memo", this.memo);
		txtParams.put("receive_user_id", this.receiveUserId);
		txtParams.put("transfer_out_order_no", this.transferOutOrderNo);
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

	public Class<AlipayMicropayOrderConfirmpayurlGetResponse> getResponseClass() {
		return AlipayMicropayOrderConfirmpayurlGetResponse.class;
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
