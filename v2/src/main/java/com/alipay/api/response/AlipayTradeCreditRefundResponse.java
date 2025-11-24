package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 17:02:34
 */
public class AlipayTradeCreditRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6333483997116138736L;

	/** 
	 * 信用订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 退款成功时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 退款成功金额，单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款的支付宝交易订单号，便于商家对账使用
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public String getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
