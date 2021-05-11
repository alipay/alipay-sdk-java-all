package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查券码数量
 *
 * @author auto create
 * @since 1.0, 2021-05-10 00:39:06
 */
public class AlipayMarketingActivityOrdervoucherCodecountModel extends AlipayObject {

	private static final long serialVersionUID = 2432147695126968628L;

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
