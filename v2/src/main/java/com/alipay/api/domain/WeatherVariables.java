package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象参数
 *
 * @author auto create
 * @since 1.0, 2025-06-12 19:34:27
 */
public class WeatherVariables extends AlipayObject {

	private static final long serialVersionUID = 5721326215758137632L;

	/**
	 * 总云量，单位%
	 */
	@ApiField("cloud_cover")
	private String cloudCover;

	/**
	 * 高云量，单位 %
	 */
	@ApiField("cloud_cover_high")
	private String cloudCoverHigh;

	/**
	 * 低云量，单位 %
	 */
	@ApiField("cloud_cover_low")
	private String cloudCoverLow;

	/**
	 * 中云量，单位 %
	 */
	@ApiField("cloud_cover_mid")
	private String cloudCoverMid;

	/**
	 * 地面两米处的露点温度，单位 摄氏度
	 */
	@ApiField("dew_point_2_m")
	private String dewPoint2M;

	/**
	 * 地面两米处的露点温度，单位 摄氏度 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("dew_point_2m")
	@Deprecated
	private String dewPoint2m;

	/**
	 * 散射辐照	，单位W/m^2
	 */
	@ApiField("diffuse_radiation")
	private String diffuseRadiation;

	/**
	 * 直接法向量辐照,单位 W/m^2
	 */
	@ApiField("direct_normal_irradiance")
	private String directNormalIrradiance;

	/**
	 * 直接辐照, W/m^2
	 */
	@ApiField("direct_radiation")
	private String directRadiation;

	/**
	 * 降雨概率（未来一小时）（降雨量大于0.1mm）单位 %
	 */
	@ApiField("precipitation_probability")
	private String precipitationProbability;

	/**
	 * 海平面大气压，单位hPa
	 */
	@ApiField("pressure_msl")
	private String pressureMsl;

	/**
	 * 地面两米处的相对空气湿度，单位 %
	 */
	@ApiField("relative_humidity_2_m")
	private String relativeHumidity2M;

	/**
	 * 地面两米处的相对空气湿度，单位 % 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("relative_humidity_2m")
	@Deprecated
	private String relativeHumidity2m;

	/**
	 * 短波辐照，单位 W/m^2
	 */
	@ApiField("shortwave_radiation")
	private String shortwaveRadiation;

	/**
	 * 地表大气压，单位hPa
	 */
	@ApiField("surface_pressure")
	private String surfacePressure;

	/**
	 * 地面两米处的空气温度, 单位 摄氏度
	 */
	@ApiField("temperature_2_m")
	private String temperature2M;

	/**
	 * 地面两米处的空气温度, 单位 摄氏度 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("temperature_2m")
	@Deprecated
	private String temperature2m;

	/**
	 * 气象变量的日期
	 */
	@ApiField("variable_date")
	private Date variableDate;

	/**
	 * 地面10米处风向，单位 °
	 */
	@ApiField("wind_direction_10_m")
	private String windDirection10M;

	/**
	 * 地面10米处风向，单位 ° 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_direction_10m")
	@Deprecated
	private String windDirection10m;

	/**
	 * 地面 120 米处风向，单位	°
	 */
	@ApiField("wind_direction_120_m")
	private String windDirection120M;

	/**
	 * 地面 120 米处风向，单位	° 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_direction_120m")
	@Deprecated
	private String windDirection120m;

	/**
	 * 地面80米处风向，单位°
	 */
	@ApiField("wind_direction_80_m")
	private String windDirection80M;

	/**
	 * 地面80米处风向，单位° 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_direction_80m")
	@Deprecated
	private String windDirection80m;

	/**
	 * 地面十米处风速，单位 km/h
	 */
	@ApiField("wind_speed_10_m")
	private String windSpeed10M;

	/**
	 * 地面十米处风速，单位 km/h 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_10m")
	@Deprecated
	private String windSpeed10m;

	/**
	 * 地面 120 米处风速，单位km/h
	 */
	@ApiField("wind_speed_120_m")
	private String windSpeed120M;

	/**
	 * 地面 120 米处风速，单位km/h 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_120m")
	@Deprecated
	private String windSpeed120m;

	/**
	 * 地面80米处风速，单位 km/h
	 */
	@ApiField("wind_speed_80_m")
	private String windSpeed80M;

	/**
	 * 地面80米处风速，单位 km/h 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_80m")
	@Deprecated
	private String windSpeed80m;

	public String getCloudCover() {
		return this.cloudCover;
	}
	public void setCloudCover(String cloudCover) {
		this.cloudCover = cloudCover;
	}

	public String getCloudCoverHigh() {
		return this.cloudCoverHigh;
	}
	public void setCloudCoverHigh(String cloudCoverHigh) {
		this.cloudCoverHigh = cloudCoverHigh;
	}

	public String getCloudCoverLow() {
		return this.cloudCoverLow;
	}
	public void setCloudCoverLow(String cloudCoverLow) {
		this.cloudCoverLow = cloudCoverLow;
	}

	public String getCloudCoverMid() {
		return this.cloudCoverMid;
	}
	public void setCloudCoverMid(String cloudCoverMid) {
		this.cloudCoverMid = cloudCoverMid;
	}

	public String getDewPoint2M() {
		return this.dewPoint2M;
	}
	public void setDewPoint2M(String dewPoint2M) {
		this.dewPoint2M = dewPoint2M;
	}

	public String getDewPoint2m() {
		return this.dewPoint2m;
	}
	public void setDewPoint2m(String dewPoint2m) {
		this.dewPoint2m = dewPoint2m;
	}

	public String getDiffuseRadiation() {
		return this.diffuseRadiation;
	}
	public void setDiffuseRadiation(String diffuseRadiation) {
		this.diffuseRadiation = diffuseRadiation;
	}

	public String getDirectNormalIrradiance() {
		return this.directNormalIrradiance;
	}
	public void setDirectNormalIrradiance(String directNormalIrradiance) {
		this.directNormalIrradiance = directNormalIrradiance;
	}

	public String getDirectRadiation() {
		return this.directRadiation;
	}
	public void setDirectRadiation(String directRadiation) {
		this.directRadiation = directRadiation;
	}

	public String getPrecipitationProbability() {
		return this.precipitationProbability;
	}
	public void setPrecipitationProbability(String precipitationProbability) {
		this.precipitationProbability = precipitationProbability;
	}

	public String getPressureMsl() {
		return this.pressureMsl;
	}
	public void setPressureMsl(String pressureMsl) {
		this.pressureMsl = pressureMsl;
	}

	public String getRelativeHumidity2M() {
		return this.relativeHumidity2M;
	}
	public void setRelativeHumidity2M(String relativeHumidity2M) {
		this.relativeHumidity2M = relativeHumidity2M;
	}

	public String getRelativeHumidity2m() {
		return this.relativeHumidity2m;
	}
	public void setRelativeHumidity2m(String relativeHumidity2m) {
		this.relativeHumidity2m = relativeHumidity2m;
	}

	public String getShortwaveRadiation() {
		return this.shortwaveRadiation;
	}
	public void setShortwaveRadiation(String shortwaveRadiation) {
		this.shortwaveRadiation = shortwaveRadiation;
	}

	public String getSurfacePressure() {
		return this.surfacePressure;
	}
	public void setSurfacePressure(String surfacePressure) {
		this.surfacePressure = surfacePressure;
	}

	public String getTemperature2M() {
		return this.temperature2M;
	}
	public void setTemperature2M(String temperature2M) {
		this.temperature2M = temperature2M;
	}

	public String getTemperature2m() {
		return this.temperature2m;
	}
	public void setTemperature2m(String temperature2m) {
		this.temperature2m = temperature2m;
	}

	public Date getVariableDate() {
		return this.variableDate;
	}
	public void setVariableDate(Date variableDate) {
		this.variableDate = variableDate;
	}

	public String getWindDirection10M() {
		return this.windDirection10M;
	}
	public void setWindDirection10M(String windDirection10M) {
		this.windDirection10M = windDirection10M;
	}

	public String getWindDirection10m() {
		return this.windDirection10m;
	}
	public void setWindDirection10m(String windDirection10m) {
		this.windDirection10m = windDirection10m;
	}

	public String getWindDirection120M() {
		return this.windDirection120M;
	}
	public void setWindDirection120M(String windDirection120M) {
		this.windDirection120M = windDirection120M;
	}

	public String getWindDirection120m() {
		return this.windDirection120m;
	}
	public void setWindDirection120m(String windDirection120m) {
		this.windDirection120m = windDirection120m;
	}

	public String getWindDirection80M() {
		return this.windDirection80M;
	}
	public void setWindDirection80M(String windDirection80M) {
		this.windDirection80M = windDirection80M;
	}

	public String getWindDirection80m() {
		return this.windDirection80m;
	}
	public void setWindDirection80m(String windDirection80m) {
		this.windDirection80m = windDirection80m;
	}

	public String getWindSpeed10M() {
		return this.windSpeed10M;
	}
	public void setWindSpeed10M(String windSpeed10M) {
		this.windSpeed10M = windSpeed10M;
	}

	public String getWindSpeed10m() {
		return this.windSpeed10m;
	}
	public void setWindSpeed10m(String windSpeed10m) {
		this.windSpeed10m = windSpeed10m;
	}

	public String getWindSpeed120M() {
		return this.windSpeed120M;
	}
	public void setWindSpeed120M(String windSpeed120M) {
		this.windSpeed120M = windSpeed120M;
	}

	public String getWindSpeed120m() {
		return this.windSpeed120m;
	}
	public void setWindSpeed120m(String windSpeed120m) {
		this.windSpeed120m = windSpeed120m;
	}

	public String getWindSpeed80M() {
		return this.windSpeed80M;
	}
	public void setWindSpeed80M(String windSpeed80M) {
		this.windSpeed80M = windSpeed80M;
	}

	public String getWindSpeed80m() {
		return this.windSpeed80m;
	}
	public void setWindSpeed80m(String windSpeed80m) {
		this.windSpeed80m = windSpeed80m;
	}

}
