package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家优惠详情
 *
 * @author auto create
 * @since 1.0, 2024-09-29 21:27:45
 */
public class MerchantPromoDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8853714687874465618L;

	/**
	 * 芝麻差异化定价优惠金额
	 */
	@ApiField("sesame_promo_amount")
	private String sesamePromoAmount;

	public String getSesamePromoAmount() {
		return this.sesamePromoAmount;
	}
	public void setSesamePromoAmount(String sesamePromoAmount) {
		this.sesamePromoAmount = sesamePromoAmount;
	}

}
