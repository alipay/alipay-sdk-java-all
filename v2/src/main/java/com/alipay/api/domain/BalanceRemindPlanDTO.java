package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 余额提醒计划详情
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:43
 */
public class BalanceRemindPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 1158329525489218651L;

	/**
	 * 单位：元，当设置了触发余额提醒的上限阈值时返回该值，余额大于该值时按规则发送余额提醒通知
	 */
	@ApiField("max_remind_balance")
	private String maxRemindBalance;

	/**
	 * 单位：元，当设置了触发余额提醒的下限阈值时返回该值，余额小于该值时按规则发送余额提醒通知
	 */
	@ApiField("min_remind_balance")
	private String minRemindBalance;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_id")
	private String monitorUserId;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_open_id")
	private String monitorUserOpenId;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 计划版本号
	 */
	@ApiField("plan_version")
	private String planVersion;

	/**
	 * 被监控账户信息
	 */
	@ApiField("remind_account_info")
	private AccountModelDTO remindAccountInfo;

	/**
	 * 提醒人列表
	 */
	@ApiListField("remind_person_list")
	@ApiField("remind_person_info_d_t_o")
	private List<RemindPersonInfoDTO> remindPersonList;

	/**
	 * 通知发送调度信息
	 */
	@ApiListField("schedule_info_list")
	@ApiField("schedule_info_d_t_o")
	private List<ScheduleInfoDTO> scheduleInfoList;

	/**
	 * 计划状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 接入方的业务场景
	 */
	@ApiField("third_biz_scene")
	private String thirdBizScene;

	public String getMaxRemindBalance() {
		return this.maxRemindBalance;
	}
	public void setMaxRemindBalance(String maxRemindBalance) {
		this.maxRemindBalance = maxRemindBalance;
	}

	public String getMinRemindBalance() {
		return this.minRemindBalance;
	}
	public void setMinRemindBalance(String minRemindBalance) {
		this.minRemindBalance = minRemindBalance;
	}

	public String getMonitorUserId() {
		return this.monitorUserId;
	}
	public void setMonitorUserId(String monitorUserId) {
		this.monitorUserId = monitorUserId;
	}

	public String getMonitorUserOpenId() {
		return this.monitorUserOpenId;
	}
	public void setMonitorUserOpenId(String monitorUserOpenId) {
		this.monitorUserOpenId = monitorUserOpenId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanVersion() {
		return this.planVersion;
	}
	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}

	public AccountModelDTO getRemindAccountInfo() {
		return this.remindAccountInfo;
	}
	public void setRemindAccountInfo(AccountModelDTO remindAccountInfo) {
		this.remindAccountInfo = remindAccountInfo;
	}

	public List<RemindPersonInfoDTO> getRemindPersonList() {
		return this.remindPersonList;
	}
	public void setRemindPersonList(List<RemindPersonInfoDTO> remindPersonList) {
		this.remindPersonList = remindPersonList;
	}

	public List<ScheduleInfoDTO> getScheduleInfoList() {
		return this.scheduleInfoList;
	}
	public void setScheduleInfoList(List<ScheduleInfoDTO> scheduleInfoList) {
		this.scheduleInfoList = scheduleInfoList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getThirdBizScene() {
		return this.thirdBizScene;
	}
	public void setThirdBizScene(String thirdBizScene) {
		this.thirdBizScene = thirdBizScene;
	}

}
