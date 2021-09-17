package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券使用规则配置
 *
 * @author auto create
 * @since 1.0, 2021-08-06 11:15:18
 */
public class VoucherUseRuleModify extends AlipayObject {

	private static final long serialVersionUID = 3364416452126776466L;

	/**
	 * 日期区间内可以使用优惠
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriodModify voucherValidPeriod;

	public VoucherValidPeriodModify getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriodModify voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
