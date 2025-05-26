package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新告警规则
 *
 * @author auto create
 * @since 1.0, 2024-06-06 17:02:24
 */
public class AlipayCloudCloudbaseMonitorAlarmruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6183687655261375217L;

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
	 * 规则ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 报警规则名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 告警是否启用
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
