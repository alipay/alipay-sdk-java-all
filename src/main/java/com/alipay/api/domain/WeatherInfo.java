package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象信息
 *
 * @author auto create
 * @since 1.0, 2022-11-01 10:24:14
 */
public class WeatherInfo extends AlipayObject {

	private static final long serialVersionUID = 2452288338128764269L;

	/**
	 * 数据预报时间
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/**
	 * 降水值
	 */
	@ApiField("precipitation")
	private String precipitation;

	/**
	 * 辐射值
	 */
	@ApiField("radiation")
	private String radiation;

	/**
	 * 温度值
	 */
	@ApiField("temperature")
	private String temperature;

	/**
	 * 风速值
	 */
	@ApiField("wind_speed")
	private String windSpeed;

	public String getForecastDate() {
		return this.forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getPrecipitation() {
		return this.precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}

	public String getRadiation() {
		return this.radiation;
	}
	public void setRadiation(String radiation) {
		this.radiation = radiation;
	}

	public String getTemperature() {
		return this.temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWindSpeed() {
		return this.windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

}
