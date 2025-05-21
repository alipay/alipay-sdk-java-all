package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息前置咨询
 *
 * @author auto create
 * @since 1.0, 2023-09-14 15:01:26
 */
public class AlipayCommerceTransportPromotionRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3784386347933889941L;

	/**
	 * 金额，只支持两位小数点的正数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 在优惠券里配置的优惠标记
	 */
	@ApiField("promo_tag")
	private String promoTag;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPromoTag() {
		return this.promoTag;
	}
	public void setPromoTag(String promoTag) {
		this.promoTag = promoTag;
	}

}
