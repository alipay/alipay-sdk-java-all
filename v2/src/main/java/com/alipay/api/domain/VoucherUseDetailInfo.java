package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销详情
 *
 * @author auto create
 * @since 1.0, 2026-04-08 10:38:23
 */
public class VoucherUseDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1848274726392848338L;

	/**
	 * 核销优惠金额, 单位:元
	 */
	@ApiField("voucher_use_amount")
	private String voucherUseAmount;

	/**
	 * 本次核销次数（不包含撤销核销的次数）
	 */
	@ApiField("voucher_use_times")
	private Long voucherUseTimes;

	public String getVoucherUseAmount() {
		return this.voucherUseAmount;
	}
	public void setVoucherUseAmount(String voucherUseAmount) {
		this.voucherUseAmount = voucherUseAmount;
	}

	public Long getVoucherUseTimes() {
		return this.voucherUseTimes;
	}
	public void setVoucherUseTimes(Long voucherUseTimes) {
		this.voucherUseTimes = voucherUseTimes;
	}

}
