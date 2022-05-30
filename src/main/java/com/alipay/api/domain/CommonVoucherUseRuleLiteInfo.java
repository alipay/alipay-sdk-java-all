package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则摘要信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:45
 */
public class CommonVoucherUseRuleLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 5611239936693241368L;

	/**
	 * 折扣券详情 限制: voucher_type为DISCOUNT_VOUCHER时必传
	 */
	@ApiField("discount_voucher")
	private ActivityDiscountVoucher discountVoucher;

	/**
	 * 兑换券详情 限制: voucher_type为EXCHANGE_VOUCHER时必传
	 */
	@ApiField("exchange_voucher")
	private ActivityExchangeVoucher exchangeVoucher;

	/**
	 * 满减券详情 限制: voucher_type为FIX_VOUCHER时必传
	 */
	@ApiField("fix_voucher")
	private ActivityFixVoucher fixVoucher;

	/**
	 * 特价券详情 限制: voucher_type为SPECIAL_VOUCHER时必传
	 */
	@ApiField("special_voucher")
	private ActivitySpecialVoucher specialVoucher;

	public ActivityDiscountVoucher getDiscountVoucher() {
		return this.discountVoucher;
	}
	public void setDiscountVoucher(ActivityDiscountVoucher discountVoucher) {
		this.discountVoucher = discountVoucher;
	}

	public ActivityExchangeVoucher getExchangeVoucher() {
		return this.exchangeVoucher;
	}
	public void setExchangeVoucher(ActivityExchangeVoucher exchangeVoucher) {
		this.exchangeVoucher = exchangeVoucher;
	}

	public ActivityFixVoucher getFixVoucher() {
		return this.fixVoucher;
	}
	public void setFixVoucher(ActivityFixVoucher fixVoucher) {
		this.fixVoucher = fixVoucher;
	}

	public ActivitySpecialVoucher getSpecialVoucher() {
		return this.specialVoucher;
	}
	public void setSpecialVoucher(ActivitySpecialVoucher specialVoucher) {
		this.specialVoucher = specialVoucher;
	}

}
