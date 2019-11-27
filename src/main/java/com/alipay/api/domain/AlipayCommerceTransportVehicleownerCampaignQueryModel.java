package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动接口查询
 *
 * @author auto create
 * @since 1.0, 2019-11-27 12:13:01
 */
public class AlipayCommerceTransportVehicleownerCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2617185465842247842L;

	/**
	 * 活动id，系统返回
	 */
	@ApiListField("activity_id")
	@ApiField("string")
	private List<String> activityId;

	/**
	 * 店铺id
	 */
	@ApiListField("shop_id")
	@ApiField("string")
	private List<String> shopId;

	public List<String> getActivityId() {
		return this.activityId;
	}
	public void setActivityId(List<String> activityId) {
		this.activityId = activityId;
	}

	public List<String> getShopId() {
		return this.shopId;
	}
	public void setShopId(List<String> shopId) {
		this.shopId = shopId;
	}

}
