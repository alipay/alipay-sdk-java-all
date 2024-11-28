package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销详情
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:18:05
 */
public class VoucherUseDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4175196675663639464L;

	/**
	 * 本次核销次数（不包含撤销核销的次数）
	 */
	@ApiField("voucher_use_times")
	private Long voucherUseTimes;

	public Long getVoucherUseTimes() {
		return this.voucherUseTimes;
	}
	public void setVoucherUseTimes(Long voucherUseTimes) {
		this.voucherUseTimes = voucherUseTimes;
	}

}
