package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象参数查询标记
 *
 * @author auto create
 * @since 1.0, 2025-05-20 19:21:36
 */
public class WeatherVariablesMark extends AlipayObject {

	private static final long serialVersionUID = 8893769212122966982L;

	/**
	 * 总云量的标记，true表示查询，默认false
	 */
	@ApiField("cloud_cover")
	private Boolean cloudCover;

	/**
	 * 高云量的标记，true表示查询，默认false
	 */
	@ApiField("cloud_cover_high")
	private Boolean cloudCoverHigh;

	/**
	 * 低云量的标记，true表示查询，默认false
	 */
	@ApiField("cloud_cover_low")
	private Boolean cloudCoverLow;

	/**
	 * 中云量的标记，true表示查询，默认false
	 */
	@ApiField("cloud_cover_mid")
	private Boolean cloudCoverMid;

	/**
	 * 地面两米处的露点温度的标记，true表示查询，默认false
	 */
	@ApiField("dew_point_2m")
	private Boolean dewPoint2m;

	/**
	 * 散射辐照的标记，true表示查询，默认false
	 */
	@ApiField("diffuse_radiation")
	private Boolean diffuseRadiation;

	/**
	 * 直接法向量辐照的标记，true表示查询，默认false
	 */
	@ApiField("direct_normal_irradiance")
	private Boolean directNormalIrradiance;

	/**
	 * 直接辐照的标记，true表示查询，默认false
	 */
	@ApiField("direct_radiation")
	private Boolean directRadiation;

	/**
	 * 降雨概率的标记，true表示查询，默认false
	 */
	@ApiField("precipitation_probability")
	private Boolean precipitationProbability;

	/**
	 * 海平面大气压的标记，true表示查询，默认false
	 */
	@ApiField("pressure_msl")
	private Boolean pressureMsl;

	/**
	 * 地面两米处的相对空气湿度标记，true表示查询，默认false
	 */
	@ApiField("relative_humidity_2m")
	private Boolean relativeHumidity2m;

	/**
	 * 短波辐照的标记，true表示查询，默认false
	 */
	@ApiField("shortwave_radiation")
	private Boolean shortwaveRadiation;

	/**
	 * 地表大气压的标记，true表示查询，默认false
	 */
	@ApiField("surface_pressure")
	private Boolean surfacePressure;

	/**
	 * 地面两米处的空气温度标记，true表示查询，默认false
	 */
	@ApiField("temperature_2m")
	private Boolean temperature2m;

	/**
	 * 地面10米处风向标记，true表示查询，默认false
	 */
	@ApiField("wind_direction_10m")
	private Boolean windDirection10m;

	/**
	 * 地面120米处风向标记，true表示查询，默认false
	 */
	@ApiField("wind_direction_120m")
	private Boolean windDirection120m;

	/**
	 * 地面80米处风向的标记，true表示查询，默认false
	 */
	@ApiField("wind_direction_80m")
	private Boolean windDirection80m;

	/**
	 * 地面10米处风速标记，true表示查询，默认false
	 */
	@ApiField("wind_speed_10m")
	private Boolean windSpeed10m;

	/**
	 * 地面120米处风速标记，true表示查询，默认false
	 */
	@ApiField("wind_speed_120m")
	private Boolean windSpeed120m;

	/**
	 * 地面80米处风速的标记，true表示查询，默认false
	 */
	@ApiField("wind_speed_80m")
	private Boolean windSpeed80m;

	public Boolean getCloudCover() {
		return this.cloudCover;
	}
	public void setCloudCover(Boolean cloudCover) {
		this.cloudCover = cloudCover;
	}

	public Boolean getCloudCoverHigh() {
		return this.cloudCoverHigh;
	}
	public void setCloudCoverHigh(Boolean cloudCoverHigh) {
		this.cloudCoverHigh = cloudCoverHigh;
	}

	public Boolean getCloudCoverLow() {
		return this.cloudCoverLow;
	}
	public void setCloudCoverLow(Boolean cloudCoverLow) {
		this.cloudCoverLow = cloudCoverLow;
	}

	public Boolean getCloudCoverMid() {
		return this.cloudCoverMid;
	}
	public void setCloudCoverMid(Boolean cloudCoverMid) {
		this.cloudCoverMid = cloudCoverMid;
	}

	public Boolean getDewPoint2m() {
		return this.dewPoint2m;
	}
	public void setDewPoint2m(Boolean dewPoint2m) {
		this.dewPoint2m = dewPoint2m;
	}

	public Boolean getDiffuseRadiation() {
		return this.diffuseRadiation;
	}
	public void setDiffuseRadiation(Boolean diffuseRadiation) {
		this.diffuseRadiation = diffuseRadiation;
	}

	public Boolean getDirectNormalIrradiance() {
		return this.directNormalIrradiance;
	}
	public void setDirectNormalIrradiance(Boolean directNormalIrradiance) {
		this.directNormalIrradiance = directNormalIrradiance;
	}

	public Boolean getDirectRadiation() {
		return this.directRadiation;
	}
	public void setDirectRadiation(Boolean directRadiation) {
		this.directRadiation = directRadiation;
	}

	public Boolean getPrecipitationProbability() {
		return this.precipitationProbability;
	}
	public void setPrecipitationProbability(Boolean precipitationProbability) {
		this.precipitationProbability = precipitationProbability;
	}

	public Boolean getPressureMsl() {
		return this.pressureMsl;
	}
	public void setPressureMsl(Boolean pressureMsl) {
		this.pressureMsl = pressureMsl;
	}

	public Boolean getRelativeHumidity2m() {
		return this.relativeHumidity2m;
	}
	public void setRelativeHumidity2m(Boolean relativeHumidity2m) {
		this.relativeHumidity2m = relativeHumidity2m;
	}

	public Boolean getShortwaveRadiation() {
		return this.shortwaveRadiation;
	}
	public void setShortwaveRadiation(Boolean shortwaveRadiation) {
		this.shortwaveRadiation = shortwaveRadiation;
	}

	public Boolean getSurfacePressure() {
		return this.surfacePressure;
	}
	public void setSurfacePressure(Boolean surfacePressure) {
		this.surfacePressure = surfacePressure;
	}

	public Boolean getTemperature2m() {
		return this.temperature2m;
	}
	public void setTemperature2m(Boolean temperature2m) {
		this.temperature2m = temperature2m;
	}

	public Boolean getWindDirection10m() {
		return this.windDirection10m;
	}
	public void setWindDirection10m(Boolean windDirection10m) {
		this.windDirection10m = windDirection10m;
	}

	public Boolean getWindDirection120m() {
		return this.windDirection120m;
	}
	public void setWindDirection120m(Boolean windDirection120m) {
		this.windDirection120m = windDirection120m;
	}

	public Boolean getWindDirection80m() {
		return this.windDirection80m;
	}
	public void setWindDirection80m(Boolean windDirection80m) {
		this.windDirection80m = windDirection80m;
	}

	public Boolean getWindSpeed10m() {
		return this.windSpeed10m;
	}
	public void setWindSpeed10m(Boolean windSpeed10m) {
		this.windSpeed10m = windSpeed10m;
	}

	public Boolean getWindSpeed120m() {
		return this.windSpeed120m;
	}
	public void setWindSpeed120m(Boolean windSpeed120m) {
		this.windSpeed120m = windSpeed120m;
	}

	public Boolean getWindSpeed80m() {
		return this.windSpeed80m;
	}
	public void setWindSpeed80m(Boolean windSpeed80m) {
		this.windSpeed80m = windSpeed80m;
	}

}
