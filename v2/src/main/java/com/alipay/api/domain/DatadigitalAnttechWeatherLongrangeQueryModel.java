package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 气象中长期预测服务
 *
 * @author auto create
 * @since 1.0, 2026-06-30 20:24:53
 */
public class DatadigitalAnttechWeatherLongrangeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3877461562453566924L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 预测天数，限制 16-45。
	 */
	@ApiField("forecast_days")
	private Long forecastDays;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，表示地理位置的经度坐标，单位为度。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 请求 ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 取值范围：
temperature2m
dewPoint2m
apparentTemperature
relativeHumidity2m
pressureMsl
surfacePressure
weatherCode
precipitation
cloudCover
windSpeed10m
windSpeed100m
windSpeed200m
windDirection10m
windDirection100m
windDirection200m
shortwaveRadiationInstant
directRadiationInstant
diffuseRadiationInstant
shortwaveRadiation
directRadiation
diffuseRadiation
windGusts10m
temperatureMax2m
temperatureMin2m
	 */
	@ApiListField("weather_variables")
	@ApiField("string")
	private List<String> weatherVariables;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getWeatherVariables() {
		return this.weatherVariables;
	}
	public void setWeatherVariables(List<String> weatherVariables) {
		this.weatherVariables = weatherVariables;
	}

}
