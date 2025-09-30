package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 控制指令内容
 *
 * @author auto create
 * @since 1.0, 2024-10-22 10:33:34
 */
public class CommandContent extends AlipayObject {

	private static final long serialVersionUID = 8674873371662157358L;

	/**
	 * 节能模式
	 */
	@ApiField("energy_save_mode")
	private String energySaveMode;

	/**
	 * 电源开关
	 */
	@ApiField("power_switch")
	private String powerSwitch;

	/**
	 * 目标温度,单位：摄氏度
	 */
	@ApiField("target_temperature")
	private String targetTemperature;

	/**
	 * 风速
	 */
	@ApiField("wind_speed")
	private String windSpeed;

	/**
	 * 工作模式
	 */
	@ApiField("work_mode")
	private String workMode;

	public String getEnergySaveMode() {
		return this.energySaveMode;
	}
	public void setEnergySaveMode(String energySaveMode) {
		this.energySaveMode = energySaveMode;
	}

	public String getPowerSwitch() {
		return this.powerSwitch;
	}
	public void setPowerSwitch(String powerSwitch) {
		this.powerSwitch = powerSwitch;
	}

	public String getTargetTemperature() {
		return this.targetTemperature;
	}
	public void setTargetTemperature(String targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public String getWindSpeed() {
		return this.windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWorkMode() {
		return this.workMode;
	}
	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}

}
