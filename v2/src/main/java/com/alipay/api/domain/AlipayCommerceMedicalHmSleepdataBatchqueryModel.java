package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗家空间睡眠数据批量查询
 *
 * @author auto create
 * @since 1.0, 2026-09-29 17:52:53
 */
public class AlipayCommerceMedicalHmSleepdataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5361575612685942362L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 结束日期(yyyyMMdd)
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 用户开发id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 开始日期(yyyyMMdd)
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
