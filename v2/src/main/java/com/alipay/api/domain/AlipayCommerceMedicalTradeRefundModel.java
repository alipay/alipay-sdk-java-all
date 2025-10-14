package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易自费退款接口
 *
 * @author auto create
 * @since 1.0, 2024-09-11 16:59:31
 */
public class AlipayCommerceMedicalTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6597318276236875812L;

	/**
	 * 和trade_no不能同时为空，如果都传以trade_no优先
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 本次请求自费退款金额，单位是元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 同一笔交易多次请求退款需保证唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 蚂蚁逸康平台交易号和out_trade_no不能同时为空
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
