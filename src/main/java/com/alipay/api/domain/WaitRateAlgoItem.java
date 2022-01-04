package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待评价算法打分item
 *
 * @author auto create
 * @since 1.0, 2020-04-28 17:20:20
 */
public class WaitRateAlgoItem extends AlipayObject {

	private static final long serialVersionUID = 5682911278654732772L;

	/**
	 * 待评价算法打分itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 算法打分分值
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
