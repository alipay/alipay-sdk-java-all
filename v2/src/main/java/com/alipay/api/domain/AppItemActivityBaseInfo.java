package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动基础信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemActivityBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 8876585693383352268L;

	/**
	 * 活动名称。
	 */
	@ApiField("activity_name")
	private String activityName;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

}
