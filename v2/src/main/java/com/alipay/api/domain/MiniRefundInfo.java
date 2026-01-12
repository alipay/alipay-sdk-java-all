package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 6821515431836255617L;

	/**
	 * 退款金额（元）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

}
