package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品集－门店
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:35:00
 */
public class PortfolioShop extends AlipayObject {

	private static final long serialVersionUID = 7678228744321778723L;

	/**
	 * 展示权重；必须大于等于0；排序规则：权重倒叙
	 */
	@ApiField("display_weight")
	private Long displayWeight;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public Long getDisplayWeight() {
		return this.displayWeight;
	}
	public void setDisplayWeight(Long displayWeight) {
		this.displayWeight = displayWeight;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
