package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动变更内容
 *
 * @author auto create
 * @since 1.0, 2022-07-19 10:45:32
 */
public class ActivityOperateContext extends AlipayObject {

	private static final long serialVersionUID = 7417986583232913697L;

	/**
	 * 活动单品信息(仅操作类型为MODIFY时存在)
	 */
	@ApiField("activity_goods_benefit")
	private ActivityGoodsBenefit activityGoodsBenefit;

	/**
	 * 变更后的活动状态，枚举：WAIT_AUDIT（审核中）/AUDIT_FAIL（审核拒绝）/AUDIT_SUCCESS（审核通过）/PAUSE（暂停)
	 */
	@ApiField("activity_status")
	private String activityStatus;

	public ActivityGoodsBenefit getActivityGoodsBenefit() {
		return this.activityGoodsBenefit;
	}
	public void setActivityGoodsBenefit(ActivityGoodsBenefit activityGoodsBenefit) {
		this.activityGoodsBenefit = activityGoodsBenefit;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

}
