package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业气象历史灾害统计信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 18:24:58
 */
public class AgWeatherDisasterHistory extends AlipayObject {

	private static final long serialVersionUID = 4264328855273916917L;

	/**
	 * 数据生产日期，YYYYMMDD
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 高温一年灾害天数
	 */
	@ApiField("high_temperature_days")
	private String highTemperatureDays;

	/**
	 * 高温一年灾害频率等级：
0-无风险，1-极低频，2-较低频，3-中度，4-较高频，5-极高频
	 */
	@ApiField("high_temperature_level")
	private String highTemperatureLevel;

	/**
	 * 低温一年灾害天数
	 */
	@ApiField("low_temperature_days")
	private String lowTemperatureDays;

	/**
	 * 低温一年灾害频率等级：
0-无风险，1-极低频，2-较低频，3-中度，4-较高频，5-极高频
	 */
	@ApiField("low_temperature_level")
	private String lowTemperatureLevel;

	/**
	 * 暴雨一年灾害天数
	 */
	@ApiField("rainstorm_days")
	private String rainstormDays;

	/**
	 * 暴雨一年灾害频率等级：
0-无风险，1-极低频，2-较低频，3-中度，4-较高频，5-极高频
	 */
	@ApiField("rainstorm_level")
	private String rainstormLevel;

	/**
	 * 数据更新日期，YYYYMMDD
	 */
	@ApiField("update_date")
	private String updateDate;

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getHighTemperatureDays() {
		return this.highTemperatureDays;
	}
	public void setHighTemperatureDays(String highTemperatureDays) {
		this.highTemperatureDays = highTemperatureDays;
	}

	public String getHighTemperatureLevel() {
		return this.highTemperatureLevel;
	}
	public void setHighTemperatureLevel(String highTemperatureLevel) {
		this.highTemperatureLevel = highTemperatureLevel;
	}

	public String getLowTemperatureDays() {
		return this.lowTemperatureDays;
	}
	public void setLowTemperatureDays(String lowTemperatureDays) {
		this.lowTemperatureDays = lowTemperatureDays;
	}

	public String getLowTemperatureLevel() {
		return this.lowTemperatureLevel;
	}
	public void setLowTemperatureLevel(String lowTemperatureLevel) {
		this.lowTemperatureLevel = lowTemperatureLevel;
	}

	public String getRainstormDays() {
		return this.rainstormDays;
	}
	public void setRainstormDays(String rainstormDays) {
		this.rainstormDays = rainstormDays;
	}

	public String getRainstormLevel() {
		return this.rainstormLevel;
	}
	public void setRainstormLevel(String rainstormLevel) {
		this.rainstormLevel = rainstormLevel;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
