package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销相关规则
 *
 * @author auto create
 * @since 1.0, 2021-07-26 14:22:02
 */
public class VoucherUseRule extends AlipayObject {

	private static final long serialVersionUID = 7243644678869351958L;

	/**
	 * 兑换券详情

限制:
券类型为兑换券时必传
	 */
	@ApiField("exchange_voucher")
	private ExchangeVoucher exchangeVoucher;

	/**
	 * 满减券详情

限制:
券类型为满减券时必传
	 */
	@ApiField("fix_voucher")
	private FixVoucher fixVoucher;

	/**
	 * 日期区间内可以使用优惠
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriod voucherValidPeriod;

	public ExchangeVoucher getExchangeVoucher() {
		return this.exchangeVoucher;
	}
	public void setExchangeVoucher(ExchangeVoucher exchangeVoucher) {
		this.exchangeVoucher = exchangeVoucher;
	}

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
