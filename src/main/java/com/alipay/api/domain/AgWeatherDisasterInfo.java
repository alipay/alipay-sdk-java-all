package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业气象灾害预警信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 18:20:31
 */
public class AgWeatherDisasterInfo extends AlipayObject {

	private static final long serialVersionUID = 1336518748855234837L;

	/**
	 * 数据实际日期，YYYYMMDD
	 */
	@ApiField("actual_date")
	private String actualDate;

	/**
	 * 附加信息
	 */
	@ApiField("addition_info")
	private String additionInfo;

	/**
	 * 预测日期，YYYYMMDD
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/**
	 * 高温预警指数，值域0～1
	 */
	@ApiField("high_temperature_index")
	private String highTemperatureIndex;

	/**
	 * 高温风险等级，值域0～5，按严重程度递增
	 */
	@ApiField("high_temperature_level")
	private Long highTemperatureLevel;

	/**
	 * 低温预警指数，值域0～1
	 */
	@ApiField("low_temperature_index")
	private String lowTemperatureIndex;

	/**
	 * 低温风险等级，值域0～5，按严重程度递增
	 */
	@ApiField("low_temperature_level")
	private String lowTemperatureLevel;

	/**
	 * 暴雨预警指数，值域0～1
	 */
	@ApiField("rainstorm_index")
	private String rainstormIndex;

	/**
	 * 暴雨风险等级，值域0～3，按严重程度递增
	 */
	@ApiField("rainstorm_level")
	private Long rainstormLevel;

	public String getActualDate() {
		return this.actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}

	public String getAdditionInfo() {
		return this.additionInfo;
	}
	public void setAdditionInfo(String additionInfo) {
		this.additionInfo = additionInfo;
	}

	public String getForecastDate() {
		return this.forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getHighTemperatureIndex() {
		return this.highTemperatureIndex;
	}
	public void setHighTemperatureIndex(String highTemperatureIndex) {
		this.highTemperatureIndex = highTemperatureIndex;
	}

	public Long getHighTemperatureLevel() {
		return this.highTemperatureLevel;
	}
	public void setHighTemperatureLevel(Long highTemperatureLevel) {
		this.highTemperatureLevel = highTemperatureLevel;
	}

	public String getLowTemperatureIndex() {
		return this.lowTemperatureIndex;
	}
	public void setLowTemperatureIndex(String lowTemperatureIndex) {
		this.lowTemperatureIndex = lowTemperatureIndex;
	}

	public String getLowTemperatureLevel() {
		return this.lowTemperatureLevel;
	}
	public void setLowTemperatureLevel(String lowTemperatureLevel) {
		this.lowTemperatureLevel = lowTemperatureLevel;
	}

	public String getRainstormIndex() {
		return this.rainstormIndex;
	}
	public void setRainstormIndex(String rainstormIndex) {
		this.rainstormIndex = rainstormIndex;
	}

	public Long getRainstormLevel() {
		return this.rainstormLevel;
	}
	public void setRainstormLevel(Long rainstormLevel) {
		this.rainstormLevel = rainstormLevel;
	}

}
