package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置触发器
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:50:19
 */
public class AlipayCloudCloudbaseFunctionTriggerSetModel extends AlipayObject {

	private static final long serialVersionUID = 3339965246815332223L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 定时触发器列表
	 */
	@ApiListField("schedules")
	@ApiField("schedule")
	private List<Schedule> schedules;

	/**
	 * 触发器名称
	 */
	@ApiField("trigger_name")
	private String triggerName;

	/**
	 * 触发器类型
 - SCHEDULE
	 */
	@ApiField("type")
	private String type;

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

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public List<Schedule> getSchedules() {
		return this.schedules;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	public String getTriggerName() {
		return this.triggerName;
	}
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
