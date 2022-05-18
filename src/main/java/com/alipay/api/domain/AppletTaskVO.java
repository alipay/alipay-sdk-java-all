package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 方案任务。
 *
 * @author auto create
 * @since 1.0, 2020-05-19 16:13:11
 */
public class AppletTaskVO extends AlipayObject {

	private static final long serialVersionUID = 4441556631267433366L;

	/**
	 * 是否可以报名
	 */
	@ApiField("can_access")
	private Boolean canAccess;

	/**
	 * 任务显示信息。
	 */
	@ApiField("display")
	private AppletTaskDisplayVO display;

	/**
	 * 是否需要报名
	 */
	@ApiField("need_sign_up")
	private String needSignUp;

	/**
	 * 报名周期内当前完成次数
	 */
	@ApiField("period_current_complete_num")
	private Long periodCurrentCompleteNum;

	/**
	 * 报名周期内最大完成次数
	 */
	@ApiField("period_total_complete_num")
	private Long periodTotalCompleteNum;

	/**
	 * 任务奖品。
	 */
	@ApiListField("prize_list")
	@ApiField("applet_task_prize_v_o")
	private List<AppletTaskPrizeVO> prizeList;

	/**
	 * 报名开始时间。
	 */
	@ApiField("sign_up_begin_time")
	private Date signUpBeginTime;

	/**
	 * 报名结束时间
	 */
	@ApiField("sign_up_end_time")
	private Date signUpEndTime;

	/**
	 * 任务id。
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务名称。
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务状态。NONE_SIGNUP未报名/SIGNUP_EXPIRED报名已失效/PARTLY_DONE未完成/RECEIVE_SUCCESS领奖成功/RECEIVE_FAILED领奖失败/RECEIVE_EXPIRED过期未领奖/SIGNUP_FAILED报名失败/SIGNUP_CANCELED报名已取消/NOT_DONE无需报名的任务未开始
	 */
	@ApiField("task_process_status")
	private String taskProcessStatus;

	public Boolean getCanAccess() {
		return this.canAccess;
	}
	public void setCanAccess(Boolean canAccess) {
		this.canAccess = canAccess;
	}

	public AppletTaskDisplayVO getDisplay() {
		return this.display;
	}
	public void setDisplay(AppletTaskDisplayVO display) {
		this.display = display;
	}

	public String getNeedSignUp() {
		return this.needSignUp;
	}
	public void setNeedSignUp(String needSignUp) {
		this.needSignUp = needSignUp;
	}

	public Long getPeriodCurrentCompleteNum() {
		return this.periodCurrentCompleteNum;
	}
	public void setPeriodCurrentCompleteNum(Long periodCurrentCompleteNum) {
		this.periodCurrentCompleteNum = periodCurrentCompleteNum;
	}

	public Long getPeriodTotalCompleteNum() {
		return this.periodTotalCompleteNum;
	}
	public void setPeriodTotalCompleteNum(Long periodTotalCompleteNum) {
		this.periodTotalCompleteNum = periodTotalCompleteNum;
	}

	public List<AppletTaskPrizeVO> getPrizeList() {
		return this.prizeList;
	}
	public void setPrizeList(List<AppletTaskPrizeVO> prizeList) {
		this.prizeList = prizeList;
	}

	public Date getSignUpBeginTime() {
		return this.signUpBeginTime;
	}
	public void setSignUpBeginTime(Date signUpBeginTime) {
		this.signUpBeginTime = signUpBeginTime;
	}

	public Date getSignUpEndTime() {
		return this.signUpEndTime;
	}
	public void setSignUpEndTime(Date signUpEndTime) {
		this.signUpEndTime = signUpEndTime;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskProcessStatus() {
		return this.taskProcessStatus;
	}
	public void setTaskProcessStatus(String taskProcessStatus) {
		this.taskProcessStatus = taskProcessStatus;
	}

}
