package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 告警历史详情
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:45:23
 */
public class AlarmHistoryDetail extends AlipayObject {

	private static final long serialVersionUID = 2123778744428774112L;

	/**
	 * 报警内容
	 */
	@ApiField("alarm_content")
	private String alarmContent;

	/**
	 * 报警时间
	 */
	@ApiField("alarm_time")
	private String alarmTime;

	/**
	 * 告警历史ID
	 */
	@ApiField("history_id")
	private String historyId;

	/**
	 * 告警规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getAlarmContent() {
		return this.alarmContent;
	}
	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	public String getAlarmTime() {
		return this.alarmTime;
	}
	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getHistoryId() {
		return this.historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
