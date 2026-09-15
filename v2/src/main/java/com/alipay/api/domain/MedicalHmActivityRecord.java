package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:42:51
 */
public class MedicalHmActivityRecord extends AlipayObject {

	private static final long serialVersionUID = 4334871853871954831L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private Date activityEndDate;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动开启时间
	 */
	@ApiField("activity_start_date")
	private Date activityStartDate;

	/**
	 * 活动副标题
	 */
	@ApiField("activity_sub_title")
	private String activitySubTitle;

	/**
	 * 活动主标题
	 */
	@ApiField("activity_title")
	private String activityTitle;

	/**
	 * 报名时间
	 */
	@ApiField("registration_date")
	private Date registrationDate;

	public Date getActivityEndDate() {
		return this.activityEndDate;
	}
	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getActivityStartDate() {
		return this.activityStartDate;
	}
	public void setActivityStartDate(Date activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public String getActivitySubTitle() {
		return this.activitySubTitle;
	}
	public void setActivitySubTitle(String activitySubTitle) {
		this.activitySubTitle = activitySubTitle;
	}

	public String getActivityTitle() {
		return this.activityTitle;
	}
	public void setActivityTitle(String activityTitle) {
		this.activityTitle = activityTitle;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
