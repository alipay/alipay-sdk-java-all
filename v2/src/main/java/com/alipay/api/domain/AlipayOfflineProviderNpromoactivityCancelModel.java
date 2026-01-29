package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备推广活动关闭
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:50
 */
public class AlipayOfflineProviderNpromoactivityCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6369436829272433694L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

}
