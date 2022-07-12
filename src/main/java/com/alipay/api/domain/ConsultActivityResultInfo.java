package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询后的活动结果信息
 *
 * @author auto create
 * @since 1.0, 2021-12-28 10:23:08
 */
public class ConsultActivityResultInfo extends AlipayObject {

	private static final long serialVersionUID = 4851176689783616528L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 咨询结果码

SUCCESS：可以领取

COUNT_OVER_LIMIT：不可领取，次数超过限制

BUDGET_NOT_ENOUGH：不可领取，预算不足

ACTIVITY_NOT_START：活动未开始

ACTIVITY_NOT_PERMISSION：商户没有权限发放该活动

OTHER：不可领取，未知原因
	 */
	@ApiField("consult_result_code")
	private String consultResultCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getConsultResultCode() {
		return this.consultResultCode;
	}
	public void setConsultResultCode(String consultResultCode) {
		this.consultResultCode = consultResultCode;
	}

}
