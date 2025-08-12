package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动设备修改
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:48
 */
public class AlipayOfflineProviderNpromoactivityDeviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2418422283933573963L;

	/**
	 * 用户在支付侧参加设备活动的id，服务商在拉取 leads 时获得。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 更换活动设备的业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 原活动设备sn编号
	 */
	@ApiField("source_dvc_sn")
	private String sourceDvcSn;

	/**
	 * 目标活动设备sn编号
	 */
	@ApiField("target_dvc_sn")
	private String targetDvcSn;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getSourceDvcSn() {
		return this.sourceDvcSn;
	}
	public void setSourceDvcSn(String sourceDvcSn) {
		this.sourceDvcSn = sourceDvcSn;
	}

	public String getTargetDvcSn() {
		return this.targetDvcSn;
	}
	public void setTargetDvcSn(String targetDvcSn) {
		this.targetDvcSn = targetDvcSn;
	}

}
