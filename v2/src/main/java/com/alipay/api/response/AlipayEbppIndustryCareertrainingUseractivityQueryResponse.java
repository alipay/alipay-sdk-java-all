package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.useractivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 16:52:41
 */
public class AlipayEbppIndustryCareertrainingUseractivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1635841565541155825L;

	/** 
	 * 活动结束时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/** 
	 * 活动开始时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/** 
	 * 活动状态
	 */
	@ApiField("activity_status")
	private Boolean activityStatus;

	/** 
	 * 是否可以参与
	 */
	@ApiField("can_join")
	private Boolean canJoin;

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
	public String getActivityEndTime( ) {
		return this.activityEndTime;
	}

	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}
	public String getActivityStartTime( ) {
		return this.activityStartTime;
	}

	public void setActivityStatus(Boolean activityStatus) {
		this.activityStatus = activityStatus;
	}
	public Boolean getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setCanJoin(Boolean canJoin) {
		this.canJoin = canJoin;
	}
	public Boolean getCanJoin( ) {
		return this.canJoin;
	}

}
