package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销详情返回结果
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:18:15
 */
public class VoucherUseDetailResultInfo extends AlipayObject {

	private static final long serialVersionUID = 8558843991399422171L;

	/**
	 * 剩余可核销次数
	 */
	@ApiField("voucher_max_un_use_times")
	private Long voucherMaxUnUseTimes;

	public Long getVoucherMaxUnUseTimes() {
		return this.voucherMaxUnUseTimes;
	}
	public void setVoucherMaxUnUseTimes(Long voucherMaxUnUseTimes) {
		this.voucherMaxUnUseTimes = voucherMaxUnUseTimes;
	}

}
