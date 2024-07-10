package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报警历史信息
 *
 * @author auto create
 * @since 1.0, 2024-06-06 18:13:51
 */
public class AlarmHistory extends AlipayObject {

	private static final long serialVersionUID = 2265254752656531273L;

	/**
	 * 报警级别
	 */
	@ApiField("alarm_level")
	private String alarmLevel;

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
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 报警恢复时间
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

	/**
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 触发条件
	 */
	@ApiField("trigger_content")
	private String triggerContent;

	public String getAlarmLevel() {
		return this.alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public String getAlarmTime() {
		return this.alarmTime;
	}
	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRecoverTime() {
		return this.recoverTime;
	}
	public void setRecoverTime(String recoverTime) {
		this.recoverTime = recoverTime;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getTriggerContent() {
		return this.triggerContent;
	}
	public void setTriggerContent(String triggerContent) {
		this.triggerContent = triggerContent;
	}

}
