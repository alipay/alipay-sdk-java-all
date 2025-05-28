package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广活动查询
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:52
 */
public class AlipayOfflineProviderNpromoactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7547995579123924922L;

	/**
	 * 用户活动id
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
