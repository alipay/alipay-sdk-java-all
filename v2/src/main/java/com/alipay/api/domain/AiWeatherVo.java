package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天气结构
 *
 * @author auto create
 * @since 1.0, 2024-10-29 14:13:52
 */
public class AiWeatherVo extends AlipayObject {

	private static final long serialVersionUID = 3896385253776639338L;

	/**
	 * 空气质量情况
	 */
	@ApiField("aqi_quality")
	private String aqiQuality;

	/**
	 * 空气质量分数
	 */
	@ApiField("aqi_score")
	private String aqiScore;

	/**
	 * 城市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 湿度（%）
	 */
	@ApiField("humidity")
	private String humidity;

	/**
	 * 温度（摄氏度)
	 */
	@ApiField("temperature")
	private String temperature;

	/**
	 * 今天最高温度（摄氏度）
	 */
	@ApiField("today_highest_temperature")
	private String todayHighestTemperature;

	/**
	 * 今天最低温度（摄氏度）
	 */
	@ApiField("today_lowest_temperature")
	private String todayLowestTemperature;

	/**
	 * 天气情况描述
	 */
	@ApiField("weather")
	private String weather;

	/**
	 * 风向
	 */
	@ApiField("wind_direction")
	private String windDirection;

	/**
	 * 风的级数
	 */
	@ApiField("wind_evel")
	private String windEvel;

	public String getAqiQuality() {
		return this.aqiQuality;
	}
	public void setAqiQuality(String aqiQuality) {
		this.aqiQuality = aqiQuality;
	}

	public String getAqiScore() {
		return this.aqiScore;
	}
	public void setAqiScore(String aqiScore) {
		this.aqiScore = aqiScore;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getHumidity() {
		return this.humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getTemperature() {
		return this.temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTodayHighestTemperature() {
		return this.todayHighestTemperature;
	}
	public void setTodayHighestTemperature(String todayHighestTemperature) {
		this.todayHighestTemperature = todayHighestTemperature;
	}

	public String getTodayLowestTemperature() {
		return this.todayLowestTemperature;
	}
	public void setTodayLowestTemperature(String todayLowestTemperature) {
		this.todayLowestTemperature = todayLowestTemperature;
	}

	public String getWeather() {
		return this.weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWindDirection() {
		return this.windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getWindEvel() {
		return this.windEvel;
	}
	public void setWindEvel(String windEvel) {
		this.windEvel = windEvel;
	}

}
