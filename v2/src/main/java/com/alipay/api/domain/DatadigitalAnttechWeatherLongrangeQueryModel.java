package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 气象中长期预测服务
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:35:54
 */
public class DatadigitalAnttechWeatherLongrangeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6737918312849167387L;

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
	 * 需要查询的中长期天气要素列表，可填写一个或多个要素名称。要素名称与返回字段一致。取值范围及含义如下：
temperature_2_m：2米气温（°C）；
dew_point_2_m：2米露点温度（°C）；
apparent_temperature：体感温度（°C）；
relative_humidity_2_m：2米相对湿度（%）；
pressure_msl：海平面气压（hPa）；
surface_pressure：地表气压（hPa）；
weather_code：天气现象枚举码；
weather_type_code：天气现象数值码；
precipitation：降水量（mm）；
cloud_cover：总云量（%）；
wind_speed_10_m：10米风速（m/s）；
wind_speed_100_m：100米风速（m/s）；
wind_speed_200_m：200米风速（m/s）；
wind_direction_10_m：10米风向（度）；
wind_direction_100_m：100米风向（度）；
wind_direction_200_m：200米风向（度）；
shortwave_radiation_instant：短波辐射瞬时值（W/m2）；
direct_radiation_instant：直接辐射瞬时值（W/m2）；
diffuse_radiation_instant：散射辐射瞬时值（W/m2）；
shortwave_radiation：短波辐射（W/m2）；
direct_radiation：直接辐射（W/m2）；
diffuse_radiation：散射辐射（W/m2）；
wind_gusts_10_m：10米阵风风速（m/s）；
temperature_max_2_m：2米最高气温（°C）；
temperature_min_2_m：2米最低气温（°C）。
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
