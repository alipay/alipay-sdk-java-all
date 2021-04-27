package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销相关规则
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:57:56
 */
public class VoucherUseRule extends AlipayObject {

	private static final long serialVersionUID = 6545224168387323332L;

	/**
	 * 代金券详情
	 */
	@ApiField("fix_voucher")
	private FixVoucher fixVoucher;

	/**
	 * 日期区间内可以使用优惠
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriod voucherValidPeriod;

	public FixVoucher getFixVoucher() {
		return this.fixVoucher;
	}
	public void setFixVoucher(FixVoucher fixVoucher) {
		this.fixVoucher = fixVoucher;
	}

	public VoucherValidPeriod getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriod voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
