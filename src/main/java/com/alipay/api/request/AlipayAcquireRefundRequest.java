package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAcquireRefundResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.acquire.refund request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:17:03
 */
public class AlipayAcquireRefundRequest implements AlipayRequest<AlipayAcquireRefundResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 卖家的操作员ID。
	 */
	private String operatorId;

	/** 
	* 操作员的类型：
0：支付宝操作员
1：商户的操作员
如果传入其它值或者为空，则默认设置为1。
	 */
	private String operatorType;

	/** 
	* 商户退款请求单号，用以标识本次交易的退款请求。
如果不传入本参数，则以out_trade_no填充本参数的值。同时，认为本次请求为全额退款，要求退款金额和交易支付金额一致。
	 */
	private String outRequestNo;

	/** 
	* 商户网站唯一订单号
	 */
	private String outTradeNo;

	/** 
	* 业务关联ID集合，用于放置商户的退款单号、退款流水号等信息，json格式
	 */
	private String refIds;

	/** 
	* 退款金额；退款金额不能大于订单金额，全额退款必须与订单金额一致。
	 */
	private String refundAmount;

	/** 
	* 退款原因说明。
	 */
	private String refundReason;

	/** 
	* 该交易在支付宝系统中的交易流水号。
最短16位，最长64位。
如果同时传了out_trade_no和trade_no，则以trade_no为准
	 */
	private String tradeNo;

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo() {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setRefIds(String refIds) {
		this.refIds = refIds;
	}
	public String getRefIds() {
		return this.refIds;
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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo() {
		return this.tradeNo;
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
		return "alipay.acquire.refund";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("operator_id", this.operatorId);
		txtParams.put("operator_type", this.operatorType);
		txtParams.put("out_request_no", this.outRequestNo);
		txtParams.put("out_trade_no", this.outTradeNo);
		txtParams.put("ref_ids", this.refIds);
		txtParams.put("refund_amount", this.refundAmount);
		txtParams.put("refund_reason", this.refundReason);
		txtParams.put("trade_no", this.tradeNo);
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

	public Class<AlipayAcquireRefundResponse> getResponseClass() {
		return AlipayAcquireRefundResponse.class;
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
