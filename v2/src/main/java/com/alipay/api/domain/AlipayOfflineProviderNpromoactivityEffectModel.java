package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户活动生效
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:51
 */
public class AlipayOfflineProviderNpromoactivityEffectModel extends AlipayObject {

	private static final long serialVersionUID = 4844227228369783813L;

	/**
	 * 用户在支付侧参加设备活动的id，服务商在拉取 leads 时获得。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 生效用户活动任务的业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 用户参与活动的设备编号
	 */
	@ApiField("dvc_sn")
	private String dvcSn;

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

	public String getDvcSn() {
		return this.dvcSn;
	}
	public void setDvcSn(String dvcSn) {
		this.dvcSn = dvcSn;
	}

}
