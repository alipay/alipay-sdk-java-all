package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺优惠信息
 *
 * @author auto create
 * @since 1.0, 2019-08-16 15:16:26
 */
public class ShopPromotionInfo extends AlipayObject {

	private static final long serialVersionUID = 6366541889526319538L;

	/**
	 * 是否还有更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/**
	 * 优惠信息列表
	 */
	@ApiListField("shop_promos")
	@ApiField("oversea_promo_info")
	private List<OverseaPromoInfo> shopPromos;

	public Boolean getHasMore() {
		return this.hasMore;
	}
	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<OverseaPromoInfo> getShopPromos() {
		return this.shopPromos;
	}
	public void setShopPromos(List<OverseaPromoInfo> shopPromos) {
		this.shopPromos = shopPromos;
	}

}
