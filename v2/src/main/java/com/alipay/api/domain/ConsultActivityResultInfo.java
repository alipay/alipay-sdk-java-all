package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询后的活动结果信息
 *
 * @author auto create
 * @since 1.0, 2024-01-24 15:52:18
 */
public class ConsultActivityResultInfo extends AlipayObject {

	private static final long serialVersionUID = 1862281342662384948L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 咨询结果码
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
