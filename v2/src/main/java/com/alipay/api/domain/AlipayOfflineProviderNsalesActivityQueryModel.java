package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单活动任务查询
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:51:10
 */
public class AlipayOfflineProviderNsalesActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6138665125155581622L;

	/**
	 * 卖进订单活动id
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
