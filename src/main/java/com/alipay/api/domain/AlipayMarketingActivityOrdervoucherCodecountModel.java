package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查券码数量
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:09:17
 */
public class AlipayMarketingActivityOrdervoucherCodecountModel extends AlipayObject {

	private static final long serialVersionUID = 7748451943963754989L;

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
