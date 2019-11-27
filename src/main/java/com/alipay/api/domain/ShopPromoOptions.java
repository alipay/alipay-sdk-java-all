package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺下优惠活动查询配置
 *
 * @author auto create
 * @since 1.0, 2019-08-12 09:58:12
 */
public class ShopPromoOptions extends AlipayObject {

	private static final long serialVersionUID = 5886829612447521619L;

	/**
	 * 店铺信息中是否包含店铺的优惠活动列表，默认为true
	 */
	@ApiField("include_promos")
	private Boolean includePromos;

	/**
	 * 店铺信息中包含的优惠券个数，只当include_coupons为true时有效。例如某个店铺下有10个优惠券，coupon_size为3时，只返回3个优惠券。默认值为5
	 */
	@ApiField("shop_promo_size")
	private Long shopPromoSize;

	public Boolean getIncludePromos() {
		return this.includePromos;
	}
	public void setIncludePromos(Boolean includePromos) {
		this.includePromos = includePromos;
	}

	public Long getShopPromoSize() {
		return this.shopPromoSize;
	}
	public void setShopPromoSize(Long shopPromoSize) {
		this.shopPromoSize = shopPromoSize;
	}

}
