package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗移动支付场景退款
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:42:56
 */
public class AlipayCommerceMedicalDirectTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4147816737739793111L;

	/**
	 * 与trade_no不能都为空，都有值时优先取trade_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款金额，单元是元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 用户退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 同一笔交易多次请求退款需保证唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 与out_trade_no不能都为空，都有值时优先取trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
