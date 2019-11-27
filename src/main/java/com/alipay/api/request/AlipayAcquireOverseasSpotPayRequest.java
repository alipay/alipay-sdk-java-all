package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAcquireOverseasSpotPayResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.acquire.overseas.spot.pay request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOverseasSpotPayRequest implements AlipayRequest<AlipayAcquireOverseasSpotPayResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* Used as identification of a Alipay user.
The format of the Buyer_identity_code varies depending on the identity_code_type
	 */
	private String buyerIdentityCode;

	/** 
	* The currency used for labeling the price of the transaction;Refer to the acronym of currency table
	 */
	private String currency;

	/** 
	* Containing the extended parameters of the request, it’s in JSON format.

For now it contains the following parameters：
merchant_name;
merchant_no;
business_no;
terminal_id;
mcc;
region_code
	 */
	private String extendInfo;

	/** 
	* he identity code type could be qrcode, barcode or soundwave;

only barcode is supported for now
	 */
	private String identityCodeType;

	/** 
	* Transaction notes
	 */
	private String memo;

	/** 
	* The transaction Id on the partner system which could be a sale order id and payment order id. 
Alipay system uses the partner_trans_id and the partner to identity a transaction on partner side
	 */
	private String partnerTransId;

	/** 
	* There are three kinds of password: login password, payment password and mobile password.
In the barcode payment scenario, the mobile password is used;

3DES is used for encryption/ decryption.
	 */
	private String password;

	/** 
	* the transaction amount in the currency given above;
Range: 0.01-100000000.00. Two digits after decimal point
	 */
	private String transAmount;

	/** 
	* The name of the transaction which will be shown in the transaction records list
	 */
	private String transName;

	public void setBuyerIdentityCode(String buyerIdentityCode) {
		this.buyerIdentityCode = buyerIdentityCode;
	}
	public String getBuyerIdentityCode() {
		return this.buyerIdentityCode;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return this.currency;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo() {
		return this.extendInfo;
	}

	public void setIdentityCodeType(String identityCodeType) {
		this.identityCodeType = identityCodeType;
	}
	public String getIdentityCodeType() {
		return this.identityCodeType;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId() {
		return this.partnerTransId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransAmount() {
		return this.transAmount;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}
	public String getTransName() {
		return this.transName;
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
		return "alipay.acquire.overseas.spot.pay";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("buyer_identity_code", this.buyerIdentityCode);
		txtParams.put("currency", this.currency);
		txtParams.put("extend_info", this.extendInfo);
		txtParams.put("identity_code_type", this.identityCodeType);
		txtParams.put("memo", this.memo);
		txtParams.put("partner_trans_id", this.partnerTransId);
		txtParams.put("password", this.password);
		txtParams.put("trans_amount", this.transAmount);
		txtParams.put("trans_name", this.transName);
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

	public Class<AlipayAcquireOverseasSpotPayResponse> getResponseClass() {
		return AlipayAcquireOverseasSpotPayResponse.class;
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
