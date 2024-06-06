package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmhistory.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 17:44:28
 */
public class AlipayCloudCloudbaseMonitorAlarmhistoryGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7473363466241691565L;

	/** 
	 * 报警时间
	 */
	@ApiField("alarm_time")
	private String alarmTime;

	/** 
	 * 报警持续时长(分钟)
	 */
	@ApiField("duration")
	private String duration;

	/** 
	 * 报警历史ID
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 恢复时间
	 */
	@ApiField("recover_time")
	private String recoverTime;

	/** 
	 * 报警规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/** 
	 * 报警规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}
	public String getAlarmTime( ) {
		return this.alarmTime;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDuration( ) {
		return this.duration;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setRecoverTime(String recoverTime) {
		this.recoverTime = recoverTime;
	}
	public String getRecoverTime( ) {
		return this.recoverTime;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleId( ) {
		return this.ruleId;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRuleName( ) {
		return this.ruleName;
	}

}
