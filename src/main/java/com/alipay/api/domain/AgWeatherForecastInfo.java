package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业气象预测信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 18:19:42
 */
public class AgWeatherForecastInfo extends AlipayObject {

	private static final long serialVersionUID = 3853419173161992266L;

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
	 * 平均温度，单位摄氏度
	 */
	@ApiField("avg_temperature")
	private String avgTemperature;

	/**
	 * 预报日期，YYYYMMDD
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/**
	 * 降水值，单位mm
	 */
	@ApiField("precipitation")
	private String precipitation;

	/**
	 * 辐射值，单位瓦
	 */
	@ApiField("radiation")
	private String radiation;

	/**
	 * 风速值，单位米/秒
	 */
	@ApiField("wind_speed")
	private String windSpeed;

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

	public String getAvgTemperature() {
		return this.avgTemperature;
	}
	public void setAvgTemperature(String avgTemperature) {
		this.avgTemperature = avgTemperature;
	}

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

	public String getWindSpeed() {
		return this.windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

}
