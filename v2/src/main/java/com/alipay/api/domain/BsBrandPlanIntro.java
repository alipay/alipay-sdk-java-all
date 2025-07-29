package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-计划-计划介绍
 *
 * @author auto create
 * @since 1.0, 2023-05-31 17:30:31
 */
public class BsBrandPlanIntro extends AlipayObject {

	private static final long serialVersionUID = 4161114784772312759L;

	/**
	 * 联营-计划-计划描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 联营-计划-计划结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 支付宝联营计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联营-计划-计划开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
