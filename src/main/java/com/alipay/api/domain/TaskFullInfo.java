package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务详情信息
 *
 * @author auto create
 * @since 1.0, 2022-07-01 11:34:03
 */
public class TaskFullInfo extends AlipayObject {

	private static final long serialVersionUID = 2512485151124513219L;

	/**
	 * 参与次数限制
	 */
	@ApiField("access_limit_count")
	private Long accessLimitCount;

	/**
	 * 最近一次累计时间
	 */
	@ApiField("last_acc_time")
	private Date lastAccTime;

	/**
	 * 最近一次完成时间(已领奖的任务才有)
	 */
	@ApiField("last_complete_time")
	private Date lastCompleteTime;

	/**
	 * 最近一次待领奖任务的领奖过期时间
	 */
	@ApiField("last_receive_expire_time")
	private Date lastReceiveExpireTime;

	/**
	 * 最近一次报名过期时间
	 */
	@ApiField("last_signup_expire_time")
	private Date lastSignupExpireTime;

	/**
	 * 最近一次报名时间
	 */
	@ApiField("last_signup_time")
	private Date lastSignupTime;

	/**
	 * 是否需要报名
	 */
	@ApiField("need_sign_up")
	private Boolean needSignUp;

	/**
	 * 一个报名周期内当前完成次数
	 */
	@ApiField("period_current_complete_num")
	private Long periodCurrentCompleteNum;

	/**
	 * 一个报名周期内最大完成次数
	 */
	@ApiField("period_total_complete_num")
	private Long periodTotalCompleteNum;

	/**
	 * 要报名:报名后当前累计周期内有效参与次数...
	 */
	@ApiField("periodic_accessed_num")
	private Long periodicAccessedNum;

	/**
	 * 累计计次的任务周期的维度
	 */
	@ApiField("periodic_dimension")
	private String periodicDimension;

	/**
	 * 任务奖品信息列表
	 */
	@ApiListField("prize_detail_list")
	@ApiField("prize_base_info")
	private List<PrizeBaseInfo> prizeDetailList;

	/**
	 * 领奖触发方式
	 */
	@ApiField("send_camp_trigger_type")
	private String sendCampTriggerType;

	/**
	 * 任务基本配置信息
	 */
	@ApiField("task_base_info")
	private TaskBaseInfo taskBaseInfo;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务属性
	 */
	@ApiField("task_material")
	private TaskMaterialInfo taskMaterial;

	/**
	 * 任务当次参与完成状态:未报名,已失效,已...
	 */
	@ApiField("task_process_status")
	private String taskProcessStatus;

	/**
	 * 任务咨询后有效奖品列表
	 */
	@ApiListField("valid_prize_list")
	@ApiField("prize_base_info")
	private List<PrizeBaseInfo> validPrizeList;

	public Long getAccessLimitCount() {
		return this.accessLimitCount;
	}
	public void setAccessLimitCount(Long accessLimitCount) {
		this.accessLimitCount = accessLimitCount;
	}

	public Date getLastAccTime() {
		return this.lastAccTime;
	}
	public void setLastAccTime(Date lastAccTime) {
		this.lastAccTime = lastAccTime;
	}

	public Date getLastCompleteTime() {
		return this.lastCompleteTime;
	}
	public void setLastCompleteTime(Date lastCompleteTime) {
		this.lastCompleteTime = lastCompleteTime;
	}

	public Date getLastReceiveExpireTime() {
		return this.lastReceiveExpireTime;
	}
	public void setLastReceiveExpireTime(Date lastReceiveExpireTime) {
		this.lastReceiveExpireTime = lastReceiveExpireTime;
	}

	public Date getLastSignupExpireTime() {
		return this.lastSignupExpireTime;
	}
	public void setLastSignupExpireTime(Date lastSignupExpireTime) {
		this.lastSignupExpireTime = lastSignupExpireTime;
	}

	public Date getLastSignupTime() {
		return this.lastSignupTime;
	}
	public void setLastSignupTime(Date lastSignupTime) {
		this.lastSignupTime = lastSignupTime;
	}

	public Boolean getNeedSignUp() {
		return this.needSignUp;
	}
	public void setNeedSignUp(Boolean needSignUp) {
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

	public Long getPeriodicAccessedNum() {
		return this.periodicAccessedNum;
	}
	public void setPeriodicAccessedNum(Long periodicAccessedNum) {
		this.periodicAccessedNum = periodicAccessedNum;
	}

	public String getPeriodicDimension() {
		return this.periodicDimension;
	}
	public void setPeriodicDimension(String periodicDimension) {
		this.periodicDimension = periodicDimension;
	}

	public List<PrizeBaseInfo> getPrizeDetailList() {
		return this.prizeDetailList;
	}
	public void setPrizeDetailList(List<PrizeBaseInfo> prizeDetailList) {
		this.prizeDetailList = prizeDetailList;
	}

	public String getSendCampTriggerType() {
		return this.sendCampTriggerType;
	}
	public void setSendCampTriggerType(String sendCampTriggerType) {
		this.sendCampTriggerType = sendCampTriggerType;
	}

	public TaskBaseInfo getTaskBaseInfo() {
		return this.taskBaseInfo;
	}
	public void setTaskBaseInfo(TaskBaseInfo taskBaseInfo) {
		this.taskBaseInfo = taskBaseInfo;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public TaskMaterialInfo getTaskMaterial() {
		return this.taskMaterial;
	}
	public void setTaskMaterial(TaskMaterialInfo taskMaterial) {
		this.taskMaterial = taskMaterial;
	}

	public String getTaskProcessStatus() {
		return this.taskProcessStatus;
	}
	public void setTaskProcessStatus(String taskProcessStatus) {
		this.taskProcessStatus = taskProcessStatus;
	}

	public List<PrizeBaseInfo> getValidPrizeList() {
		return this.validPrizeList;
	}
	public void setValidPrizeList(List<PrizeBaseInfo> validPrizeList) {
		this.validPrizeList = validPrizeList;
	}

}
