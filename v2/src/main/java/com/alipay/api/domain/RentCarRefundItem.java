package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活租车退款明细
 *
 * @author auto create
 * @since 1.0, 2024-07-19 17:56:47
 */
public class RentCarRefundItem extends AlipayObject {

	private static final long serialVersionUID = 8478499426528955362L;

	/**
	 * 当前退款请求在此支付流水中退款的金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 当前退款请求在此支付流水中退款的结果
	 */
	@ApiField("refund_result")
	private String refundResult;

	/**
	 * 支付流水的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundResult() {
		return this.refundResult;
	}
	public void setRefundResult(String refundResult) {
		this.refundResult = refundResult;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
