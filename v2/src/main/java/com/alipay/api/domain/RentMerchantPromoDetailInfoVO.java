package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家优惠详情
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentMerchantPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4194792976479583358L;

	/**
	 * 芝麻差异化定价优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("sesame_promo_amount")
	private String sesamePromoAmount;

	/**
	 * 商家满减券优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("voucher_promo_amount")
	private String voucherPromoAmount;

	public String getSesamePromoAmount() {
		return this.sesamePromoAmount;
	}
	public void setSesamePromoAmount(String sesamePromoAmount) {
		this.sesamePromoAmount = sesamePromoAmount;
	}

	public String getVoucherPromoAmount() {
		return this.voucherPromoAmount;
	}
	public void setVoucherPromoAmount(String voucherPromoAmount) {
		this.voucherPromoAmount = voucherPromoAmount;
	}

}
