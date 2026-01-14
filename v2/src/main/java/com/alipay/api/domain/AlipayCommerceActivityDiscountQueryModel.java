package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询员工价立减活动
 *
 * @author auto create
 * @since 1.0, 2026-01-04 10:47:41
 */
public class AlipayCommerceActivityDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3636344179167375217L;

	/**
	 * 活动ID，用于查询指定的活动。创建活动接口获取
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 蚂蚁门店ID，用于水平权限鉴权。蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
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
