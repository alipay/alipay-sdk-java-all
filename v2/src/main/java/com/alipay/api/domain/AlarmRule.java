package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 告警规则
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:45:58
 */
public class AlarmRule extends AlipayObject {

	private static final long serialVersionUID = 5445495725488517827L;

	/**
	 * 报警级别
 - EMERGENCY(紧急)
 - CRITICAL(严重)
 - HIGH(高)
 - MEDIUM(中)
 - LOW(低)
	 */
	@ApiField("alarm_level")
	private String alarmLevel;

	/**
	 * 规则id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 报警规则名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否启用
	 */
	@ApiField("open")
	private Boolean open;

	/**
	 * 报警生效时间配置
	 */
	@ApiField("time_config")
	private AlarmTimeConfig timeConfig;

	/**
	 * 报警触发条件
 - OR(满足任意条件)
 - AND(满足所有条件)
	 */
	@ApiField("trigger_condition")
	private String triggerCondition;

	/**
	 * 报警触发条件集合
	 */
	@ApiListField("triggers")
	@ApiField("alarm_trigger")
	private List<AlarmTrigger> triggers;

	public String getAlarmLevel() {
		return this.alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOpen() {
		return this.open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}

	public AlarmTimeConfig getTimeConfig() {
		return this.timeConfig;
	}
	public void setTimeConfig(AlarmTimeConfig timeConfig) {
		this.timeConfig = timeConfig;
	}

	public String getTriggerCondition() {
		return this.triggerCondition;
	}
	public void setTriggerCondition(String triggerCondition) {
		this.triggerCondition = triggerCondition;
	}

	public List<AlarmTrigger> getTriggers() {
		return this.triggers;
	}
	public void setTriggers(List<AlarmTrigger> triggers) {
		this.triggers = triggers;
	}

}
