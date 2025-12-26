package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单活动任务激活
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:47:34
 */
public class AlipayOfflineProviderNsalesActivityEffectModel extends AlipayObject {

	private static final long serialVersionUID = 8228347413617416432L;

	/**
	 * 活动设备编号
	 */
	@ApiField("activity_dvc_sn")
	private String activityDvcSn;

	/**
	 * 卖进订单活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityDvcSn() {
		return this.activityDvcSn;
	}
	public void setActivityDvcSn(String activityDvcSn) {
		this.activityDvcSn = activityDvcSn;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
