package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券查询
 *
 * @author auto create
 * @since 1.0, 2021-05-10 13:22:39
 */
public class AlipayMarketingActivityOrdervoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1342921492621529361L;

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
