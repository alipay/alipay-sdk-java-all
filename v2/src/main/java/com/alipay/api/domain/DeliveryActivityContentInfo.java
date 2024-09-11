package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动内容信息。主要包含商家券与支付券活动。
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:20:05
 */
public class DeliveryActivityContentInfo extends AlipayObject {

	private static final long serialVersionUID = 5791715141897488972L;

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
