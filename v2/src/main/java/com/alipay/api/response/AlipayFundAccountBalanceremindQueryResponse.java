package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountModelDTO;
import com.alipay.api.domain.RemindPersonInfoDTO;
import com.alipay.api.domain.ScheduleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.balanceremind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 16:02:05
 */
public class AlipayFundAccountBalanceremindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471611818664772665L;

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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("monitor_user_open_id")
	private String monitorUserOpenId;

	/** 
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 余额提醒计划的名称，在支付宝端内暂未对客展示，为空时会自动填充一个默认值
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
	 * 接入方的业务场景，如示例值：ETC代扣场景
	 */
	@ApiField("third_biz_scene")
	private String thirdBizScene;

	public void setMaxRemindBalance(String maxRemindBalance) {
		this.maxRemindBalance = maxRemindBalance;
	}
	public String getMaxRemindBalance( ) {
		return this.maxRemindBalance;
	}

	public void setMinRemindBalance(String minRemindBalance) {
		this.minRemindBalance = minRemindBalance;
	}
	public String getMinRemindBalance( ) {
		return this.minRemindBalance;
	}

	public void setMonitorUserId(String monitorUserId) {
		this.monitorUserId = monitorUserId;
	}
	public String getMonitorUserId( ) {
		return this.monitorUserId;
	}

	public void setMonitorUserOpenId(String monitorUserOpenId) {
		this.monitorUserOpenId = monitorUserOpenId;
	}
	public String getMonitorUserOpenId( ) {
		return this.monitorUserOpenId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}
	public String getPlanVersion( ) {
		return this.planVersion;
	}

	public void setRemindAccountInfo(AccountModelDTO remindAccountInfo) {
		this.remindAccountInfo = remindAccountInfo;
	}
	public AccountModelDTO getRemindAccountInfo( ) {
		return this.remindAccountInfo;
	}

	public void setRemindPersonList(List<RemindPersonInfoDTO> remindPersonList) {
		this.remindPersonList = remindPersonList;
	}
	public List<RemindPersonInfoDTO> getRemindPersonList( ) {
		return this.remindPersonList;
	}

	public void setScheduleInfoList(List<ScheduleInfoDTO> scheduleInfoList) {
		this.scheduleInfoList = scheduleInfoList;
	}
	public List<ScheduleInfoDTO> getScheduleInfoList( ) {
		return this.scheduleInfoList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setThirdBizScene(String thirdBizScene) {
		this.thirdBizScene = thirdBizScene;
	}
	public String getThirdBizScene( ) {
		return this.thirdBizScene;
	}

}
