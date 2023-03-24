package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动券领取咨询结果
 *
 * @author auto create
 * @since 1.0, 2021-07-12 10:03:05
 */
public class ActivityConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 8179998329985996691L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 错误码：领取超限(RECEIVE_LIMIT_EXCEEDED)，券余量不足(VOUCHER_INSUFFICIENT_EXCEPTION)，活动未处于有效期内(ACTIVITY_NOT_IN_TIME_EXCEPTION)，通用领取异常(RECEIVE_FAIL_ERROR)
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 是否可领
	 */
	@ApiField("success")
	private Boolean success;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
