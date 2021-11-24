package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询活动详情
 *
 * @author auto create
 * @since 1.0, 2021-11-17 10:15:09
 */
public class AlipayMarketingActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7332293444299535237L;

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
