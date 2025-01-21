package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券使用规则配置
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:43:47
 */
public class VoucherUseRuleModify extends AlipayObject {

	private static final long serialVersionUID = 5447511991325846784L;

	/**
	 * 兑换券详情。
	 */
	@ApiField("exchange_voucher")
	private ExchangeVoucherModify exchangeVoucher;

	/**
	 * 券可用范围修改信息。
	 */
	@ApiField("voucher_available_scope")
	private VoucherAvailableScopeModify voucherAvailableScope;

	/**
	 * 日期区间内可以使用优惠。
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriodModify voucherValidPeriod;

	public ExchangeVoucherModify getExchangeVoucher() {
		return this.exchangeVoucher;
	}
	public void setExchangeVoucher(ExchangeVoucherModify exchangeVoucher) {
		this.exchangeVoucher = exchangeVoucher;
	}

	public VoucherAvailableScopeModify getVoucherAvailableScope() {
		return this.voucherAvailableScope;
	}
	public void setVoucherAvailableScope(VoucherAvailableScopeModify voucherAvailableScope) {
		this.voucherAvailableScope = voucherAvailableScope;
	}

	public VoucherValidPeriodModify getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriodModify voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
