package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayTransferThirdpartyBillCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.transfer.thirdparty.bill.create request
 * 
 * @author auto create
 * @since 1.0, 2014-06-25 17:00:56
 */
public class AlipayTransferThirdpartyBillCreateRequest implements AlipayRequest<AlipayTransferThirdpartyBillCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 收款金额，单位：分
	 */
	private String amount;

	/** 
	* 收款币种，默认为156（人民币）目前只允许转账人民币
	 */
	private String currency;

	/** 
	* 扩展参数
	 */
	private String extParam;

	/** 
	* 转账备注
	 */
	private String memo;

	/** 
	* 合作方的支付宝帐号UID
	 */
	private String partnerId;

	/** 
	* 外部系统收款方UID，付款人和收款人不能是同一个帐户
	 */
	private String payeeAccount;

	/** 
	* （同payer_type所列举的）
目前限制payer_type和payee_type必须一致
	 */
	private String payeeType;

	/** 
	* 外部系统付款方的UID
	 */
	private String payerAccount;

	/** 
	* 1-支付宝帐户
2-淘宝帐户
10001-新浪微博帐户
10002-阿里云帐户
（1、2目前对外不可见、不可用）
	 */
	private String payerType;

	/** 
	* 发起支付交易来源方定义的交易ID，用于将支付回执通知给来源方。不同来源方给出的ID可以重复，同一个来源方给出的ID唯一性由来源方保证。
	 */
	private String paymentId;

	/** 
	* 支付来源
10001-新浪微博
10002-阿里云
	 */
	private String paymentSource;

	/** 
	* 支付款项的标题
	 */
	private String title;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return this.currency;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam() {
		return this.extParam;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public String getPayeeAccount() {
		return this.payeeAccount;
	}

	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}
	public String getPayeeType() {
		return this.payeeType;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}
	public String getPayerAccount() {
		return this.payerAccount;
	}

	public void setPayerType(String payerType) {
		this.payerType = payerType;
	}
	public String getPayerType() {
		return this.payerType;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}
	public String getPaymentSource() {
		return this.paymentSource;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
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
		return "alipay.transfer.thirdparty.bill.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("currency", this.currency);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("memo", this.memo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("payee_account", this.payeeAccount);
		txtParams.put("payee_type", this.payeeType);
		txtParams.put("payer_account", this.payerAccount);
		txtParams.put("payer_type", this.payerType);
		txtParams.put("payment_id", this.paymentId);
		txtParams.put("payment_source", this.paymentSource);
		txtParams.put("title", this.title);
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

	public Class<AlipayTransferThirdpartyBillCreateResponse> getResponseClass() {
		return AlipayTransferThirdpartyBillCreateResponse.class;
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
