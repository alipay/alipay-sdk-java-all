package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * UBO信息
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:30:09
 */
public class UboVO extends AlipayObject {

	private static final long serialVersionUID = 3299752423318129426L;

	/**
	 * 职务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 控股比例
	 */
	@ApiField("invest_rate")
	private String investRate;

	/**
	 * ubo名称
	 */
	@ApiField("name")
	private String name;

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getInvestRate() {
		return this.investRate;
	}
	public void setInvestRate(String investRate) {
		this.investRate = investRate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
