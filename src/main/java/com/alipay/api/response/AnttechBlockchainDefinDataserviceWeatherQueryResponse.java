package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.weather.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-27 17:56:54
 */
public class AnttechBlockchainDefinDataserviceWeatherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2673847664278743427L;

	/** 
	 * 数据预报时间
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/** 
	 * 湿度值
	 */
	@ApiField("humidity")
	private String humidity;

	/** 
	 * 降水值
	 */
	@ApiField("precipitation")
	private String precipitation;

	/** 
	 * 温度值
	 */
	@ApiField("temperature")
	private String temperature;

	/** 
	 * 天气描述信息
	 */
	@ApiField("weather_desc")
	private String weatherDesc;

	/** 
	 * 风速值
	 */
	@ApiField("wind_speed")
	private String windSpeed;

	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}
	public String getForecastDate( ) {
		return this.forecastDate;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getHumidity( ) {
		return this.humidity;
	}

	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}
	public String getPrecipitation( ) {
		return this.precipitation;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getTemperature( ) {
		return this.temperature;
	}

	public void setWeatherDesc(String weatherDesc) {
		this.weatherDesc = weatherDesc;
	}
	public String getWeatherDesc( ) {
		return this.weatherDesc;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWindSpeed( ) {
		return this.windSpeed;
	}

}
