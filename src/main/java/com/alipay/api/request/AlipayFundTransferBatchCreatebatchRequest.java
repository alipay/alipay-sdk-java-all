package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFundTransferBatchCreatebatchResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.fund.transfer.batch.createbatch request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayFundTransferBatchCreatebatchRequest implements AlipayRequest<AlipayFundTransferBatchCreatebatchResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* batch_memo
	 */
	private String batchMemo;

	/** 
	* 总金额，单位为元：
       AA为收款总金额
            活动收款为份数和单笔金额的积
            江湖救急为目标金额
	 */
	private String bizType;

	/** 
	* aaa
	 */
	private String createUserId;

	/** 
	* ext_param
	 */
	private String extParam;

	/** 
	* pay_amount_single
	 */
	private String payAmountSingle;

	/** 
	* pay_amount_total
	 */
	private String payAmountTotal;

	/** 
	* real_items_total
	 */
	private String realItemsTotal;

	/** 
	* show_items_total
	 */
	private String showItemsTotal;

	public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
	}
	public String getBatchMemo() {
		return this.batchMemo;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam() {
		return this.extParam;
	}

	public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}
	public String getPayAmountSingle() {
		return this.payAmountSingle;
	}

	public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}
	public String getPayAmountTotal() {
		return this.payAmountTotal;
	}

	public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}
	public String getRealItemsTotal() {
		return this.realItemsTotal;
	}

	public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}
	public String getShowItemsTotal() {
		return this.showItemsTotal;
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
		return "alipay.fund.transfer.batch.createbatch";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("batch_memo", this.batchMemo);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("create_user_id", this.createUserId);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("pay_amount_single", this.payAmountSingle);
		txtParams.put("pay_amount_total", this.payAmountTotal);
		txtParams.put("real_items_total", this.realItemsTotal);
		txtParams.put("show_items_total", this.showItemsTotal);
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

	public Class<AlipayFundTransferBatchCreatebatchResponse> getResponseClass() {
		return AlipayFundTransferBatchCreatebatchResponse.class;
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
