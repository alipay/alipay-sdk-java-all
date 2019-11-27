package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺分数结果信息
 *
 * @author auto create
 * @since 1.0, 2017-08-17 14:23:05
 */
public class ShopScoreInfo extends AlipayObject {

	private static final long serialVersionUID = 5672373183776236423L;

	/**
	 * 月均人气分
	 */
	@ApiField("avg_score")
	private String avgScore;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAvgScore() {
		return this.avgScore;
	}
	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
