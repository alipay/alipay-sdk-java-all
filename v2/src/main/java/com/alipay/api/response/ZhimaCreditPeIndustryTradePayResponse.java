package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:22:28
 */
public class ZhimaCreditPeIndustryTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1725869161452938518L;

	/** 
	 * 交易资金流水号
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 交易外部订单号,交易成功才有值,商户对账使用
	 */
	@ApiField("alipay_out_trade_no")
	private String alipayOutTradeNo;

	/** 
	 * 支付金额,单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付失败原因描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 传入的扣款资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/** 
	 * 传入的资金类型
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/** 
	 * 支付状态,支付成功:PAY_SUCCESS, 支付失败:PAY_FAILED, 支付中:PAY_INPROGRESS
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付处理时间，无支付行为时为空
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

	public void setAlipayOutTradeNo(String alipayOutTradeNo) {
		this.alipayOutTradeNo = alipayOutTradeNo;
	}
	public String getAlipayOutTradeNo( ) {
		return this.alipayOutTradeNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}
	public String getOutFundNo( ) {
		return this.outFundNo;
	}

	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}
	public String getPayAmountType( ) {
		return this.payAmountType;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
