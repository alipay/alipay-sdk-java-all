package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 班次信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:20:56
 */
public class ShopPosSchedule extends AlipayObject {

	private static final long serialVersionUID = 4799486261835766697L;

	/**
	 * 早班结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 班次ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 班次名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标识班次顺序
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 早班开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
