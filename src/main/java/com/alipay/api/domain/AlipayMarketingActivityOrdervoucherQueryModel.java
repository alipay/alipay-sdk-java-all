package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券查询
 *
 * @author auto create
 * @since 1.0, 2021-08-30 12:01:54
 */
public class AlipayMarketingActivityOrdervoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5465149175482473556L;

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
