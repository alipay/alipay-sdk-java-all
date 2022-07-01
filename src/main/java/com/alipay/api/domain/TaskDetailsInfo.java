package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销任务明细
 *
 * @author auto create
 * @since 1.0, 2022-06-23 17:56:53
 */
public class TaskDetailsInfo extends AlipayObject {

	private static final long serialVersionUID = 4614965589251863668L;

	/**
	 * 参与次数限制
	 */
	@ApiField("access_limit_count")
	private Long accessLimitCount;

	/**
	 * 参与次数限制维度D(天), W(周), M(月), L(终身)
	 */
	@ApiField("access_limit_dimension")
	private String accessLimitDimension;

	/**
	 * 最近一次累计时间(累计计次的任务需要,非累计计次的就等于lastCompleteTime)
	 */
	@ApiField("last_acc_time")
	private Date lastAccTime;

	/**
	 * 最近一次完成时间(已领奖的任务才有)
	 */
	@ApiField("last_complete_time")
	private Date lastCompleteTime;

	/**
	 * 最近一次待领奖任务的领奖过期时间(TO_RECEIVE状态的才有)
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
	 * 一个报名周期内当前完成次数(最近报名后累计完成次数,包括发奖成功,发奖阶段失败,和已推荐未领状态)
无需报名就是全部完成次数，等于taskCompleteTimes
	 */
	@ApiField("period_current_complete_num")
	private String periodCurrentCompleteNum;

	/**
	 * 一个报名周期内最大完成次数(报名有效点数,单次报名多次发奖)
	 */
	@ApiField("period_total_complete_num")
	private String periodTotalCompleteNum;

	/**
	 * 要报名:报名后当前累计周期内有效参与次数,已经过期的参与次数不算
无需报名:当前累计周期内有效参与次数
	 */
	@ApiField("periodic_accessed_num")
	private String periodicAccessedNum;

	/**
	 * 累计计次的任务周期的维度
	 */
	@ApiField("periodic_dimension")
	private String periodicDimension;

	/**
	 * 任务奖品信息列表
	 */
	@ApiListField("prize_detail_dto_list")
	@ApiField("prize_base_info")
	private List<PrizeBaseInfo> prizeDetailDtoList;

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
	 * 任务当次参与完成状态:未报名,已失效,已取消,部分完成(需要累计计次的任务),已完成待领奖,已领奖
	 */
	@ApiField("task_process_status")
	private String taskProcessStatus;

	/**
	 * 任务咨询后有效奖品列表
	 */
	@ApiField("valid_prize_detail_dto")
	private PrizeBaseInfo validPrizeDetailDto;

	public Long getAccessLimitCount() {
		return this.accessLimitCount;
	}
	public void setAccessLimitCount(Long accessLimitCount) {
		this.accessLimitCount = accessLimitCount;
	}

	public String getAccessLimitDimension() {
		return this.accessLimitDimension;
	}
	public void setAccessLimitDimension(String accessLimitDimension) {
		this.accessLimitDimension = accessLimitDimension;
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

	public String getPeriodCurrentCompleteNum() {
		return this.periodCurrentCompleteNum;
	}
	public void setPeriodCurrentCompleteNum(String periodCurrentCompleteNum) {
		this.periodCurrentCompleteNum = periodCurrentCompleteNum;
	}

	public String getPeriodTotalCompleteNum() {
		return this.periodTotalCompleteNum;
	}
	public void setPeriodTotalCompleteNum(String periodTotalCompleteNum) {
		this.periodTotalCompleteNum = periodTotalCompleteNum;
	}

	public String getPeriodicAccessedNum() {
		return this.periodicAccessedNum;
	}
	public void setPeriodicAccessedNum(String periodicAccessedNum) {
		this.periodicAccessedNum = periodicAccessedNum;
	}

	public String getPeriodicDimension() {
		return this.periodicDimension;
	}
	public void setPeriodicDimension(String periodicDimension) {
		this.periodicDimension = periodicDimension;
	}

	public List<PrizeBaseInfo> getPrizeDetailDtoList() {
		return this.prizeDetailDtoList;
	}
	public void setPrizeDetailDtoList(List<PrizeBaseInfo> prizeDetailDtoList) {
		this.prizeDetailDtoList = prizeDetailDtoList;
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

	public PrizeBaseInfo getValidPrizeDetailDto() {
		return this.validPrizeDetailDto;
	}
	public void setValidPrizeDetailDto(PrizeBaseInfo validPrizeDetailDto) {
		this.validPrizeDetailDto = validPrizeDetailDto;
	}

}
