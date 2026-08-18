package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告权益范围查询接口
 *
 * @author auto create
 * @since 1.0, 2026-08-17 19:15:17
 */
public class AlipayCommerceRetailBenefitscopeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1324352746226437997L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
