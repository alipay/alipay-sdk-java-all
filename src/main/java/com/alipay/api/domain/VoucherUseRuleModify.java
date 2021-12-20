package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券使用规则配置
 *
 * @author auto create
 * @since 1.0, 2021-12-13 18:59:21
 */
public class VoucherUseRuleModify extends AlipayObject {

	private static final long serialVersionUID = 6633334163256352746L;

	/**
	 * 兑换券详情
	 */
	@ApiField("exchange_voucher")
	private ExchangeVoucherModify exchangeVoucher;

	/**
	 * 日期区间内可以使用优惠
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriodModify voucherValidPeriod;

	public ExchangeVoucherModify getExchangeVoucher() {
		return this.exchangeVoucher;
	}
	public void setExchangeVoucher(ExchangeVoucherModify exchangeVoucher) {
		this.exchangeVoucher = exchangeVoucher;
	}

	public VoucherValidPeriodModify getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriodModify voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
