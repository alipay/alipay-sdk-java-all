package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFundTransferBatchCreateorderResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.fund.transfer.batch.createorder request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayFundTransferBatchCreateorderRequest implements AlipayRequest<AlipayFundTransferBatchCreateorderResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 批次号
	 */
	private String batchNo;

	/** 
	* 扩展数据
	 */
	private String extParam;

	/** 
	* 金额
	 */
	private String payAmount;

	/** 
	* 收款方userId
	 */
	private String payeeId;

	/** 
	* 付款方userId
	 */
	private String payerId;

	/** 
	* token
	 */
	private String token;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo() {
		return this.batchNo;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam() {
		return this.extParam;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount() {
		return this.payAmount;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}
	public String getPayeeId() {
		return this.payeeId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	public String getPayerId() {
		return this.payerId;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return this.token;
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
		return "alipay.fund.transfer.batch.createorder";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("payee_id", this.payeeId);
		txtParams.put("payer_id", this.payerId);
		txtParams.put("token", this.token);
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

	public Class<AlipayFundTransferBatchCreateorderResponse> getResponseClass() {
		return AlipayFundTransferBatchCreateorderResponse.class;
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
