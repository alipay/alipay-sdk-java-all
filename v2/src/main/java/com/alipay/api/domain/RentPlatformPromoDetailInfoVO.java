package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台优惠详情
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentPlatformPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6688624543998146331L;

	/**
	 * 立减优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("discount_promo_amount")
	private String discountPromoAmount;

	/**
	 * 券优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("voucher_promo_amount")
	private String voucherPromoAmount;

	public String getDiscountPromoAmount() {
		return this.discountPromoAmount;
	}
	public void setDiscountPromoAmount(String discountPromoAmount) {
		this.discountPromoAmount = discountPromoAmount;
	}

	public String getVoucherPromoAmount() {
		return this.voucherPromoAmount;
	}
	public void setVoucherPromoAmount(String voucherPromoAmount) {
		this.voucherPromoAmount = voucherPromoAmount;
	}

}
