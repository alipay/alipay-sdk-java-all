package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券优惠抵扣信息
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class VoucherDeductInfo extends AlipayObject {

	private static final long serialVersionUID = 3796741755985785685L;

	/**
	 * 折扣券详情 限制: 券类型voucher_type为折扣券DISCOUNT_VOUCHER时必传
	 */
	@ApiField("discount_voucher_info")
	private DiscountVoucherInfo discountVoucherInfo;

	/**
	 * 兑换券详情 限制: 券类型为兑换券时必传
	 */
	@ApiField("exchange_voucher_info")
	private ExchangeVoucherInfo exchangeVoucherInfo;

	/**
	 * 满减券详情 限制: 券类型为满减券时必传
	 */
	@ApiField("fix_voucher_info")
	private FixVoucherInfo fixVoucherInfo;

	/**
	 * 特价券详情 限制: 券类型voucher_type为特价券SPECIAL_VOUCHER时必传
	 */
	@ApiField("special_voucher_info")
	private SpecialVoucherInfo specialVoucherInfo;

	/**
	 * 券类型。 枚举值： 商家券支持三类券类型： FIX_VOUCHER：满减券； DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； 兑换券仅支持一类券类型： EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public DiscountVoucherInfo getDiscountVoucherInfo() {
		return this.discountVoucherInfo;
	}
	public void setDiscountVoucherInfo(DiscountVoucherInfo discountVoucherInfo) {
		this.discountVoucherInfo = discountVoucherInfo;
	}

	public ExchangeVoucherInfo getExchangeVoucherInfo() {
		return this.exchangeVoucherInfo;
	}
	public void setExchangeVoucherInfo(ExchangeVoucherInfo exchangeVoucherInfo) {
		this.exchangeVoucherInfo = exchangeVoucherInfo;
	}

	public FixVoucherInfo getFixVoucherInfo() {
		return this.fixVoucherInfo;
	}
	public void setFixVoucherInfo(FixVoucherInfo fixVoucherInfo) {
		this.fixVoucherInfo = fixVoucherInfo;
	}

	public SpecialVoucherInfo getSpecialVoucherInfo() {
		return this.specialVoucherInfo;
	}
	public void setSpecialVoucherInfo(SpecialVoucherInfo specialVoucherInfo) {
		this.specialVoucherInfo = specialVoucherInfo;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
