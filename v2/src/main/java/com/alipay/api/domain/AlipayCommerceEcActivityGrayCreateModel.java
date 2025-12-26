package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建活动灰度策略
 *
 * @author auto create
 * @since 1.0, 2025-12-10 15:02:06
 */
public class AlipayCommerceEcActivityGrayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6799156199759353179L;

	/**
	 * 员工价活动id，用于指定需要修改灰度策略的活动；通过 alipay.commerce.ec.activity.discount.create 创建活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权；通过 ant.merchant.expand.shop.create 创建蚂蚁门店
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * null
	 */
	@ApiListField("gray_account_list")
	@ApiField("string")
	private List<String> grayAccountList;

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

	public List<String> getGrayAccountList() {
		return this.grayAccountList;
	}
	public void setGrayAccountList(List<String> grayAccountList) {
		this.grayAccountList = grayAccountList;
	}

}
