package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.tradeperiod.batchquery request
 * 
 * @author auto create
 * @since 1.0, 2026-07-01 11:57:57
 */
public class AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryRequest implements AlipayRequest<AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 指定一段时间查询，返回该时间的交易时间段，比如查询1797868800000到1798560000000时间范围内的交易时间段，返回中包含：未开盘、集合竞价、交易中、周末休日等信息
	 */
	private String bizContent;

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getBizContent() {
		return this.bizContent;
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
		return "alipay.finance.quotation.quotetradeopen.tradeperiod.batchquery";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_content", this.bizContent);
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

	public Class<AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryResponse> getResponseClass() {
		return AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryResponse.class;
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
