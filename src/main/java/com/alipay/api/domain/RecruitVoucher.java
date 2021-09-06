package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名提交的券信息
 *
 * @author auto create
 * @since 1.0, 2021-06-30 23:43:29
 */
public class RecruitVoucher extends AlipayObject {

	private static final long serialVersionUID = 7454986885496444148L;

	/**
	 * 券活动id
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
