package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券取消核销详情
 *
 * @author auto create
 * @since 1.0, 2026-04-08 10:38:11
 */
public class VoucherRefundDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2813391962836379378L;

	/**
	 * 取消核销优惠金额, 单位:元
	 */
	@ApiField("voucher_refund_amount")
	private String voucherRefundAmount;

	/**
	 * 本次取消核销次数
	 */
	@ApiField("voucher_refund_use_times")
	private Long voucherRefundUseTimes;

	public String getVoucherRefundAmount() {
		return this.voucherRefundAmount;
	}
	public void setVoucherRefundAmount(String voucherRefundAmount) {
		this.voucherRefundAmount = voucherRefundAmount;
	}

	public Long getVoucherRefundUseTimes() {
		return this.voucherRefundUseTimes;
	}
	public void setVoucherRefundUseTimes(Long voucherRefundUseTimes) {
		this.voucherRefundUseTimes = voucherRefundUseTimes;
	}

}
