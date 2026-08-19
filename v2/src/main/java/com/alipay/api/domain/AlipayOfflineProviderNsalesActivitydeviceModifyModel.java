package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单活动任务设备更换
 *
 * @author auto create
 * @since 1.0, 2026-08-18 14:13:17
 */
public class AlipayOfflineProviderNsalesActivitydeviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4847151561934162115L;

	/**
	 * 卖进订单活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动原设备编号
	 */
	@ApiField("source_sn")
	private String sourceSn;

	/**
	 * 活动目标替换设备编号
	 */
	@ApiField("target_sn")
	private String targetSn;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getSourceSn() {
		return this.sourceSn;
	}
	public void setSourceSn(String sourceSn) {
		this.sourceSn = sourceSn;
	}

	public String getTargetSn() {
		return this.targetSn;
	}
	public void setTargetSn(String targetSn) {
		this.targetSn = targetSn;
	}

}
