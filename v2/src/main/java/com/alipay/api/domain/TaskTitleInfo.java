package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 顶部卡片信息
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:19:30
 */
public class TaskTitleInfo extends AlipayObject {

	private static final long serialVersionUID = 4728999542419278953L;

	/**
	 * 剩余积分数，积分兑现金10:1
	 */
	@ApiField("remain_point_amount")
	private Long remainPointAmount;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public Long getRemainPointAmount() {
		return this.remainPointAmount;
	}
	public void setRemainPointAmount(Long remainPointAmount) {
		this.remainPointAmount = remainPointAmount;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
