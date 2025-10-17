package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 16:57:58
 */
public class AlipayCommerceMedicalTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8139234297564837611L;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 银行编码
	 */
	@ApiField("bank_id")
	private String bankId;

	/** 
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 银行订单ID
	 */
	@ApiField("bank_order_id")
	private String bankOrderId;

	/** 
	 * 当orderType=INSURANCE_PAY时该字段会返回
	 */
	@ApiField("medical_pay_cancel_msg")
	private String medicalPayCancelMsg;

	/** 
	 * 当orderType=INSURANCE_PAY时该字段会返回
	 */
	@ApiField("medical_pay_cancel_result")
	private String medicalPayCancelResult;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 当orderType=OWN_PAY时该字段会返回
	 */
	@ApiField("own_pay_cancel_msg")
	private String ownPayCancelMsg;

	/** 
	 * 当orderType=OWN_PAY时该字段会返回
	 */
	@ApiField("own_pay_cancel_result")
	private String ownPayCancelResult;

	/** 
	 * 整笔交易撤销结果
	 */
	@ApiField("trade_cancel_result")
	private String tradeCancelResult;

	/** 
	 * 逸康交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankId( ) {
		return this.bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}
	public String getBankOrderId( ) {
		return this.bankOrderId;
	}

	public void setMedicalPayCancelMsg(String medicalPayCancelMsg) {
		this.medicalPayCancelMsg = medicalPayCancelMsg;
	}
	public String getMedicalPayCancelMsg( ) {
		return this.medicalPayCancelMsg;
	}

	public void setMedicalPayCancelResult(String medicalPayCancelResult) {
		this.medicalPayCancelResult = medicalPayCancelResult;
	}
	public String getMedicalPayCancelResult( ) {
		return this.medicalPayCancelResult;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setOwnPayCancelMsg(String ownPayCancelMsg) {
		this.ownPayCancelMsg = ownPayCancelMsg;
	}
	public String getOwnPayCancelMsg( ) {
		return this.ownPayCancelMsg;
	}

	public void setOwnPayCancelResult(String ownPayCancelResult) {
		this.ownPayCancelResult = ownPayCancelResult;
	}
	public String getOwnPayCancelResult( ) {
		return this.ownPayCancelResult;
	}

	public void setTradeCancelResult(String tradeCancelResult) {
		this.tradeCancelResult = tradeCancelResult;
	}
	public String getTradeCancelResult( ) {
		return this.tradeCancelResult;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
