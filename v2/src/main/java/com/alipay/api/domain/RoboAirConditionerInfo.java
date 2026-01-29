package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 空调信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:39
 */
public class RoboAirConditionerInfo extends AlipayObject {

	private static final long serialVersionUID = 2832521127545878347L;

	/**
	 * 是否有空调能力，1无，2有
	 */
	@ApiField("air_ability")
	private Long airAbility;

	/**
	 * 最大空调温度，单位：度
	 */
	@ApiField("max_temperature")
	private String maxTemperature;

	/**
	 * 最小空调温度，单位：度
	 */
	@ApiField("min_temperature")
	private String minTemperature;

	/**
	 * 空调开启状态：1关闭，2开启
	 */
	@ApiField("open_status")
	private Long openStatus;

	/**
	 * 当前空调温度，单位：度
	 */
	@ApiField("temperature")
	private String temperature;

	public Long getAirAbility() {
		return this.airAbility;
	}
	public void setAirAbility(Long airAbility) {
		this.airAbility = airAbility;
	}

	public String getMaxTemperature() {
		return this.maxTemperature;
	}
	public void setMaxTemperature(String maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public String getMinTemperature() {
		return this.minTemperature;
	}
	public void setMinTemperature(String minTemperature) {
		this.minTemperature = minTemperature;
	}

	public Long getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}

	public String getTemperature() {
		return this.temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}
