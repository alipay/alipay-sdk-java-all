package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人门店关系
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:34:49
 */
public class CraftsmanShopRelationOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5219582693154219654L;

	/**
	 * 推荐权重。整数。小于等于0表示不在口碑店铺页展示 大于0表示在口碑店铺页展示， 值越大，排序越靠前。
	 */
	@ApiField("recommend_weight")
	private Long recommendWeight;

	/**
	 * 口碑门店ID，可通过门店摘要信息批量查询接口 alipay.offline.market.shop.summary.batchquery获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	public Long getRecommendWeight() {
		return this.recommendWeight;
	}
	public void setRecommendWeight(Long recommendWeight) {
		this.recommendWeight = recommendWeight;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
