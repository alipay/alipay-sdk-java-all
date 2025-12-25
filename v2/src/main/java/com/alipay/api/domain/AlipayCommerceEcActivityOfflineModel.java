package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下线员工价活动
 *
 * @author auto create
 * @since 1.0, 2025-12-10 15:02:31
 */
public class AlipayCommerceEcActivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6594188842115171848L;

	/**
	 * 员工价活动id，用于指定需要下线的活动；通过 alipay.commerce.ec.activity.discount.create 创建活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
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
