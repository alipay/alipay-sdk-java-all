package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政府补贴详情
 *
 * @author auto create
 * @since 1.0, 2026-04-21 14:50:51
 */
public class GovernmentPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4646818357877413713L;

	/**
	 * 政府满减优惠金额
	 */
	@ApiField("discount_promo_amount")
	private String discountPromoAmount;

	/**
	 * 政府券优惠金额
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
