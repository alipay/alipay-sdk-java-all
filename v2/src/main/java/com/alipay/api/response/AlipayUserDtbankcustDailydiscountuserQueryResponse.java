package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserRegisterDiscountInfo;
import com.alipay.api.domain.UserTaskProgress;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.dailydiscountuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 13:52:49
 */
public class AlipayUserDtbankcustDailydiscountuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4319529798194872674L;

	/** 
	 * 当前活动状态
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 用户报名该天天减活动状态
	 */
	@ApiField("user_register")
	private String userRegister;

	/** 
	 * 用户报名后优惠信息
	 */
	@ApiField("user_register_discount_info")
	private UserRegisterDiscountInfo userRegisterDiscountInfo;

	/** 
	 * 活动参与进度信息
	 */
	@ApiListField("user_task_progress")
	@ApiField("user_task_progress")
	private List<UserTaskProgress> userTaskProgress;

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setUserRegister(String userRegister) {
		this.userRegister = userRegister;
	}
	public String getUserRegister( ) {
		return this.userRegister;
	}

	public void setUserRegisterDiscountInfo(UserRegisterDiscountInfo userRegisterDiscountInfo) {
		this.userRegisterDiscountInfo = userRegisterDiscountInfo;
	}
	public UserRegisterDiscountInfo getUserRegisterDiscountInfo( ) {
		return this.userRegisterDiscountInfo;
	}

	public void setUserTaskProgress(List<UserTaskProgress> userTaskProgress) {
		this.userTaskProgress = userTaskProgress;
	}
	public List<UserTaskProgress> getUserTaskProgress( ) {
		return this.userTaskProgress;
	}

}
