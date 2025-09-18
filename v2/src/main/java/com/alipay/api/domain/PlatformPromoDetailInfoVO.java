package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台优惠详情
 *
 * @author auto create
 * @since 1.0, 2024-09-29 21:27:45
 */
public class PlatformPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1177278738493675896L;

	/**
	 * 立减优惠金额
	 */
	@ApiField("discount_promo_amount")
	private String discountPromoAmount;

	/**
	 * 券优惠金额
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
