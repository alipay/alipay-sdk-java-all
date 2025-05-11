package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家优惠详情
 *
 * @author auto create
 * @since 1.0, 2024-12-13 11:18:24
 */
public class MerchantPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4449519366552369916L;

	/**
	 * 芝麻差异化定价优惠金额
	 */
	@ApiField("sesame_promo_amount")
	private String sesamePromoAmount;

	/**
	 * 商家满减券优惠金额
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
