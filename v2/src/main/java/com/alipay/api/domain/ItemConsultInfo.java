package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品咨询信息
 *
 * @author auto create
 * @since 1.0, 2025-06-14 18:01:04
 */
public class ItemConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 6534924855637161245L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品优惠金额，单位为元
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	/**
	 * 商品优惠数量
	 */
	@ApiField("promo_count")
	private String promoCount;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

	public String getPromoCount() {
		return this.promoCount;
	}
	public void setPromoCount(String promoCount) {
		this.promoCount = promoCount;
	}

}
