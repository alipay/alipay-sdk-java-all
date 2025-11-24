package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待咨询的活动信息
 *
 * @author auto create
 * @since 1.0, 2021-08-25 20:55:41
 */
public class ConsultActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 2452723194477553312L;

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
