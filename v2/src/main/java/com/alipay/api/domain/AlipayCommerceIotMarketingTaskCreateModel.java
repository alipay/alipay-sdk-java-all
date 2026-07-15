package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商海报投放任务接口
 *
 * @author auto create
 * @since 1.0, 2026-03-23 15:49:43
 */
public class AlipayCommerceIotMarketingTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6589735374526249953L;

	/**
	 * 投放设备bizTid列表,服务商所有的设备，取设备的bizTid 多个bizTid示例：["010100q0jl5X4o8LZQWAOUxu6GcrtPl4wR68wQerXVACt5EAaQISk4k","010100q0iZ5XP3eiSA25lhlyGq8dxPMOHe8Ae4s1BGptXegHN3fCQ1g"]
	 */
	@ApiListField("biz_tids")
	@ApiField("string")
	private List<String> bizTids;

	/**
	 * 投放任务有效期结束时间戳
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 投放计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 投放计划开始时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 投放模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public List<String> getBizTids() {
		return this.bizTids;
	}
	public void setBizTids(List<String> bizTids) {
		this.bizTids = bizTids;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
