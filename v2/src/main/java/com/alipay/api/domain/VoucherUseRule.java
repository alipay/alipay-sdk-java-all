package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销相关规则
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:53:52
 */
public class VoucherUseRule extends AlipayObject {

	private static final long serialVersionUID = 2576589741877278979L;

	/**
	 * 折扣券详情
	 */
	@ApiField("discount_voucher")
	private DiscountVoucher discountVoucher;

	/**
	 * 兑换券详情
	 */
	@ApiField("exchange_voucher")
	private ExchangeVoucher exchangeVoucher;

	/**
	 * 满减券详情
	 */
	@ApiField("fix_voucher")
	private FixVoucher fixVoucher;

	/**
	 * 特价券详情
	 */
	@ApiField("special_voucher")
	private SpecialVoucher specialVoucher;

	/**
	 * 商家券可用范围
	 */
	@ApiField("voucher_available_scope")
	private VoucherAvailableScope voucherAvailableScope;

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

	public VoucherAvailableScope getVoucherAvailableScope() {
		return this.voucherAvailableScope;
	}
	public void setVoucherAvailableScope(VoucherAvailableScope voucherAvailableScope) {
		this.voucherAvailableScope = voucherAvailableScope;
	}

	public VoucherValidPeriod getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(VoucherValidPeriod voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
