package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上线员工价活动
 *
 * @author auto create
 * @since 1.0, 2025-12-10 15:02:39
 */
public class AlipayCommerceEcActivityOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2633899274567747517L;

	/**
	 * 员工价活动id，指定需要上线的活动；通过 alipay.commerce.ec.activity.discount.create 创建活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 蚂蚁门店id；通过 ant.merchant.expand.shop.create 创建蚂蚁门店
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

}
