package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券查询
 *
 * @author auto create
 * @since 1.0, 2021-09-09 21:26:16
 */
public class AlipayMarketingActivityOrdervoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8648726727526163296L;

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
