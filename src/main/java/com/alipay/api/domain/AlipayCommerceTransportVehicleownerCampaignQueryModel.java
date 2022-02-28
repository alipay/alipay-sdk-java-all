package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动接口查询
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:35:17
 */
public class AlipayCommerceTransportVehicleownerCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7328337486888957547L;

	/**
	 * 活动id的列表
	 */
	@ApiListField("activity_id")
	@ApiField("string")
	private List<String> activityId;

	public List<String> getActivityId() {
		return this.activityId;
	}
	public void setActivityId(List<String> activityId) {
		this.activityId = activityId;
	}

}
