package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放平台预算信息
 *
 * @author auto create
 * @since 1.0, 2022-12-08 16:55:18
 */
public class OpenBudget extends AlipayObject {

	private static final long serialVersionUID = 8367234995364565526L;

	/**
	 * 警告接收人
	 */
	@ApiListField("alert_users")
	@ApiField("string")
	private List<String> alertUsers;

	/**
	 * 预算库ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 预算模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 监控的业务号
	 */
	@ApiField("monitor_biz_id")
	private String monitorBizId;

	/**
	 * 监控模板标识
	 */
	@ApiField("monitor_template_code")
	private String monitorTemplateCode;

	/**
	 * 监控告警触发条件的计算项标识
	 */
	@ApiField("monitor_trigger_code")
	private String monitorTriggerCode;

	/**
	 * 告警阈值
	 */
	@ApiListField("thresholds")
	@ApiField("number")
	private List<Long> thresholds;

	/**
	 * 预算值
	 */
	@ApiField("value")
	private Long value;

	public List<String> getAlertUsers() {
		return this.alertUsers;
	}
	public void setAlertUsers(List<String> alertUsers) {
		this.alertUsers = alertUsers;
	}

	public String getBudgetId() {
		return this.budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMonitorBizId() {
		return this.monitorBizId;
	}
	public void setMonitorBizId(String monitorBizId) {
		this.monitorBizId = monitorBizId;
	}

	public String getMonitorTemplateCode() {
		return this.monitorTemplateCode;
	}
	public void setMonitorTemplateCode(String monitorTemplateCode) {
		this.monitorTemplateCode = monitorTemplateCode;
	}

	public String getMonitorTriggerCode() {
		return this.monitorTriggerCode;
	}
	public void setMonitorTriggerCode(String monitorTriggerCode) {
		this.monitorTriggerCode = monitorTriggerCode;
	}

	public List<Long> getThresholds() {
		return this.thresholds;
	}
	public void setThresholds(List<Long> thresholds) {
		this.thresholds = thresholds;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
