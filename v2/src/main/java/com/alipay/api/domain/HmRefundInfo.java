package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class HmRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 6883727939176918483L;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款路径
	 */
	@ApiField("refund_channel")
	private String refundChannel;

	/**
	 * 退款时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("refund_time")
	private String refundTime;

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundChannel() {
		return this.refundChannel;
	}
	public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

}
