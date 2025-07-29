package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史气象查询服务
 *
 * @author auto create
 * @since 1.0, 2025-06-12 19:34:27
 */
public class DatadigitalAnttechWeatherFutureQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5462954388368799925L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 需要预测的天数,为 0 到 14 之间的整数
	 */
	@ApiField("forecast_days")
	private Long forecastDays;

	/**
	 * 纬度，单位°
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，单位 °
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 此前预测的天数, 为 1 到 5 之间的整数，此前几天的预测结果
	 */
	@ApiField("past_days")
	private Long pastDays;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 8 - Asia/Shanghai （北京时间，UTC+8）
	 */
	@ApiField("timezone")
	private String timezone;

	/**
	 * 气象变量查询标记
	 */
	@ApiField("weather_variables_mark")
	private WeatherVariablesMark weatherVariablesMark;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public Long getForecastDays() {
		return this.forecastDays;
	}
	public void setForecastDays(Long forecastDays) {
		this.forecastDays = forecastDays;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Long getPastDays() {
		return this.pastDays;
	}
	public void setPastDays(Long pastDays) {
		this.pastDays = pastDays;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTimezone() {
		return this.timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public WeatherVariablesMark getWeatherVariablesMark() {
		return this.weatherVariablesMark;
	}
	public void setWeatherVariablesMark(WeatherVariablesMark weatherVariablesMark) {
		this.weatherVariablesMark = weatherVariablesMark;
	}

}
