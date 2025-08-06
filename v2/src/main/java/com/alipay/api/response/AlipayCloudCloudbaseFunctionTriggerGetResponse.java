package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Schedule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trigger.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:20
 */
public class AlipayCloudCloudbaseFunctionTriggerGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8555727536817847844L;

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
	 */
	@ApiField("type")
	private String type;

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	public List<Schedule> getSchedules( ) {
		return this.schedules;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}
	public String getTriggerName( ) {
		return this.triggerName;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
