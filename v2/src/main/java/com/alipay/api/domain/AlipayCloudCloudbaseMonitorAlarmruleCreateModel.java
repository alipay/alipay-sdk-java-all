package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建报警规则
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:32:17
 */
public class AlipayCloudCloudbaseMonitorAlarmruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1763516399773237428L;

	/**
	 * 报警级别
	 */
	@ApiField("alarm_level")
	private String alarmLevel;

	/**
	 * 小程序云app ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 报警名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否启用报警规则
	 */
	@ApiField("open")
	private Boolean open;

	/**
	 * 报警生效时间配置
	 */
	@ApiField("time_config")
	private AlarmTimeConfig timeConfig;

	/**
	 * 多个告警规则的触发条件
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

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
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
