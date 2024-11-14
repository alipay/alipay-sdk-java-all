package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券取消核销详情
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:18:11
 */
public class VoucherRefundDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3194221534485613235L;

	/**
	 * 本次取消核销次数
	 */
	@ApiField("voucher_refund_use_times")
	private Long voucherRefundUseTimes;

	public Long getVoucherRefundUseTimes() {
		return this.voucherRefundUseTimes;
	}
	public void setVoucherRefundUseTimes(Long voucherRefundUseTimes) {
		this.voucherRefundUseTimes = voucherRefundUseTimes;
	}

}
