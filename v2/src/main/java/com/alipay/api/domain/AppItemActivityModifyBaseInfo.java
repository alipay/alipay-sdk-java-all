package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动基础描述信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemActivityModifyBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 3778676952746456432L;

	/**
	 * 活动id 来源：来自创建接口返回的activity_id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

}
