package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销相关规则
 *
 * @author auto create
 * @since 1.0, 2021-08-23 14:15:53
 */
public class VoucherUseRule extends AlipayObject {

	private static final long serialVersionUID = 8375499136667687935L;

	/**
	 * 折扣券详情 限制: 券类型voucher_type为折扣券DISCOUNT_VOUCHER时必传
	 */
	@ApiField("discount_voucher")
	private DiscountVoucher discountVoucher;

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
	 * 特价券详情 限制: 券类型voucher_type为特价券SPECIAL_VOUCHER时必传
	 */
	@ApiField("special_voucher")
	private SpecialVoucher specialVoucher;

	/**
	 * 日期区间内可以使用优惠
	 */
	@ApiField("voucher_valid_period")
	private VoucherValidPeriod voucherValidPeriod;

	public DiscountVoucher getDiscountVoucher() {
		return this.discountVoucher;
	}
	public void setDiscountVoucher(DiscountVoucher discountVoucher) {
		this.discountVoucher = discountVoucher;
	}

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

	public SpecialVoucher getSpecialVoucher() {
		return this.specialVoucher;
	}
	public void setSpecialVoucher(SpecialVoucher specialVoucher) {
		this.specialVoucher = specialVoucher;
	}

	public VoucherValidPeriod getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriod voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
