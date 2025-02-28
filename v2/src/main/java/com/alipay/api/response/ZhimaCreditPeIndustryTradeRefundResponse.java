package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.trade.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:05:53
 */
public class ZhimaCreditPeIndustryTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5868515319933622846L;

	/** 
	 * 资金流水号,退款成功才有值
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 交易外部订单号,退款成功才有值,商户对账使用
	 */
	@ApiField("alipay_out_trade_no")
	private String alipayOutTradeNo;

	/** 
	 * 退款金额,单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付失败原因描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 入参传入的扣款资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/** 
	 * 入参传入的退款资金单号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 支付处理时间，无支付行为时为空
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 退款状态,退款成功:PAY_SUCCESS, 退款失败:PAY_FAILED, 退款中:PAY_INPROGRESS
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 传入的平台订单号
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

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
