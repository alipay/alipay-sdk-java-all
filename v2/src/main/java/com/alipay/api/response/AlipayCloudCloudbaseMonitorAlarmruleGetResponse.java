package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlarmTimeConfig;
import com.alipay.api.domain.AlarmTrigger;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 17:37:03
 */
public class AlipayCloudCloudbaseMonitorAlarmruleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8217243298438936367L;

	/** 
	 * 报警级别
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
	 */
	@ApiField("trigger_condition")
	private String triggerCondition;

	/** 
	 * 报警触发条件集合
	 */
	@ApiListField("triggers")
	@ApiField("alarm_trigger")
	private List<AlarmTrigger> triggers;

	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	public String getAlarmLevel( ) {
		return this.alarmLevel;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setTimeConfig(AlarmTimeConfig timeConfig) {
		this.timeConfig = timeConfig;
	}
	public AlarmTimeConfig getTimeConfig( ) {
		return this.timeConfig;
	}

	public void setTriggerCondition(String triggerCondition) {
		this.triggerCondition = triggerCondition;
	}
	public String getTriggerCondition( ) {
		return this.triggerCondition;
	}

	public void setTriggers(List<AlarmTrigger> triggers) {
		this.triggers = triggers;
	}
	public List<AlarmTrigger> getTriggers( ) {
		return this.triggers;
	}

}
