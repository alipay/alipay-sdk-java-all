package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中长期天气参数
 *
 * @author auto create
 * @since 1.0, 2026-06-30 20:24:53
 */
public class LongRangeWeatherVariables extends AlipayObject {

	private static final long serialVersionUID = 5627784136769964187L;

	/**
	 * 体感温度，表示人体实际感受到的温度，单位：°C。
	 */
	@ApiField("apparent_temperature")
	private String apparentTemperature;

	/**
	 * 云量，单位：%
	 */
	@ApiField("cloud_cover")
	private String cloudCover;

	/**
	 * 表示地面二米处的露点温度，参数类型为 string，单位：°C。
	 */
	@ApiField("dew_point_2_m")
	private String dewPoint2M;

	/**
	 * 散射辐射，单位：W/m2
	 */
	@ApiField("diffuse_radiation")
	private String diffuseRadiation;

	/**
	 * 散射辐射瞬时值，表示当前时刻的散射短波辐射强度，单位：W/m2。
	 */
	@ApiField("diffuse_radiation_instant")
	private String diffuseRadiationInstant;

	/**
	 * 直接辐射，表示来自太阳直射方向的辐射强度，用于描述天气或气象条件中的太阳辐射情况，单位：W/m2。
	 */
	@ApiField("direct_radiation")
	private String directRadiation;

	/**
	 * 直接辐射瞬时值，单位：W/m2
	 */
	@ApiField("direct_radiation_instant")
	private String directRadiationInstant;

	/**
	 * 降水量，单位：mm
	 */
	@ApiField("precipitation")
	private String precipitation;

	/**
	 * 海平面气压，单位hPa
	 */
	@ApiField("pressure_msl")
	private String pressureMsl;

	/**
	 * 地面2米处相对湿度，表示距离地面2米高度处空气中水汽含量相对于同温度下饱和水汽含量的百分比，单位：%。
	 */
	@ApiField("relative_humidity_2_m")
	private String relativeHumidity2M;

	/**
	 * 短波辐射，单位：W/m2
	 */
	@ApiField("shortwave_radiation")
	private String shortwaveRadiation;

	/**
	 * 短波辐射瞬时值，表示当前时刻的短波太阳辐射强度，单位：W/m2。
	 */
	@ApiField("shortwave_radiation_instant")
	private String shortwaveRadiationInstant;

	/**
	 * 地表气压，表示观测点地表处的大气压力，单位hPa。
	 */
	@ApiField("surface_pressure")
	private String surfacePressure;

	/**
	 * 地面2米处气温，表示距离地表2米高度处测得的空气温度，单位：°C。
	 */
	@ApiField("temperature_2_m")
	private String temperature2M;

	/**
	 * 地面2米处最高气温，单位：°C
	 */
	@ApiField("temperature_max_2_m")
	private String temperatureMax2M;

	/**
	 * 地面 2 米处最低气温，单位：°C
	 */
	@ApiField("temperature_min_2_m")
	private String temperatureMin2M;

	/**
	 * 气象变量的日期
	 */
	@ApiField("variable_date")
	private Date variableDate;

	/**
	 * 天气代码，枚举范围：
CLEAR:晴
MAINLY_CLEAR:大部晴朗
PARTLY_CLOUDY:局部多云
OVERCAST:阴/多云
FOG:雾
RIME_FOG:雾凇雾
DRIZZLE_LIGHT:小毛毛雨
DRIZZLE_MODERATE:中等毛毛雨
DRIZZLE_HEAVY:强毛毛雨
FREEZING_DRIZZLE_LIGHT:小冻毛毛雨
FREEZING_DRIZZLE_HEAVY:强冻毛毛雨
RAIN_LIGHT:小雨
RAIN_MODERATE:中雨
RAIN_HEAVY:大雨
FREEZING_RAIN_LIGHT:小冻雨
FREEZING_RAIN_HEAVY:强冻雨
SNOW_LIGHT:小雪
SNOW_MODERATE:中雪
SNOW_HEAVY:大雪
SNOW_GRAINS:雪粒
RAIN_SHOWER_LIGHT:小阵雨
RAIN_SHOWER_MODERATE:中等阵雨
RAIN_SHOWER_HEAVY:强阵雨
SNOW_SHOWER_LIGHT:小阵雪
SNOW_SHOWER_HEAVY:强阵雪
THUNDERSTORM:雷暴
THUNDERSTORM_HAIL_LIGHT:雷暴伴小冰雹
THUNDERSTORM_HAIL_HEAVY:雷暴伴强冰雹
UNKNOWN:未识别/空值
	 */
	@ApiField("weather_code")
	private String weatherCode;

	/**
	 * 100 米高度风向，表示距地面 100 米高度处的风向，通常以角度表示，单位：°。
	 */
	@ApiField("wind_direction_100_m")
	private String windDirection100M;

	/**
	 * 10 米高度风向，表示地面以上 10 米处的风向数据，通常以角度表示，单位：°。
	 */
	@ApiField("wind_direction_10_m")
	private String windDirection10M;

	/**
	 * 表示地面二百米高度处的风向，通常以角度值表示，单位：°。
	 */
	@ApiField("wind_direction_200_m")
	private String windDirection200M;

	/**
	 * 10米高度阵风风速，表示地面以上10米处短时间内出现的最大风速。
	 */
	@ApiField("wind_gusts_10_m")
	private String windGusts10M;

	/**
	 * 一百米高度风速，表示距地面一百米高度处的风速数据，单位：m/s。
	 */
	@ApiField("wind_speed_100_m")
	private String windSpeed100M;

	/**
	 * 10米高度风速，单位：m/s
	 */
	@ApiField("wind_speed_10_m")
	private String windSpeed10M;

	/**
	 * 200米高度风速，表示距地面200米高度处的风速数据，单位：m/s。
	 */
	@ApiField("wind_speed_200_m")
	private String windSpeed200M;

	public String getApparentTemperature() {
		return this.apparentTemperature;
	}
	public void setApparentTemperature(String apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	public String getCloudCover() {
		return this.cloudCover;
	}
	public void setCloudCover(String cloudCover) {
		this.cloudCover = cloudCover;
	}

	public String getDewPoint2M() {
		return this.dewPoint2M;
	}
	public void setDewPoint2M(String dewPoint2M) {
		this.dewPoint2M = dewPoint2M;
	}

	public String getDiffuseRadiation() {
		return this.diffuseRadiation;
	}
	public void setDiffuseRadiation(String diffuseRadiation) {
		this.diffuseRadiation = diffuseRadiation;
	}

	public String getDiffuseRadiationInstant() {
		return this.diffuseRadiationInstant;
	}
	public void setDiffuseRadiationInstant(String diffuseRadiationInstant) {
		this.diffuseRadiationInstant = diffuseRadiationInstant;
	}

	public String getDirectRadiation() {
		return this.directRadiation;
	}
	public void setDirectRadiation(String directRadiation) {
		this.directRadiation = directRadiation;
	}

	public String getDirectRadiationInstant() {
		return this.directRadiationInstant;
	}
	public void setDirectRadiationInstant(String directRadiationInstant) {
		this.directRadiationInstant = directRadiationInstant;
	}

	public String getPrecipitation() {
		return this.precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
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

	public String getShortwaveRadiation() {
		return this.shortwaveRadiation;
	}
	public void setShortwaveRadiation(String shortwaveRadiation) {
		this.shortwaveRadiation = shortwaveRadiation;
	}

	public String getShortwaveRadiationInstant() {
		return this.shortwaveRadiationInstant;
	}
	public void setShortwaveRadiationInstant(String shortwaveRadiationInstant) {
		this.shortwaveRadiationInstant = shortwaveRadiationInstant;
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

	public String getTemperatureMax2M() {
		return this.temperatureMax2M;
	}
	public void setTemperatureMax2M(String temperatureMax2M) {
		this.temperatureMax2M = temperatureMax2M;
	}

	public String getTemperatureMin2M() {
		return this.temperatureMin2M;
	}
	public void setTemperatureMin2M(String temperatureMin2M) {
		this.temperatureMin2M = temperatureMin2M;
	}

	public Date getVariableDate() {
		return this.variableDate;
	}
	public void setVariableDate(Date variableDate) {
		this.variableDate = variableDate;
	}

	public String getWeatherCode() {
		return this.weatherCode;
	}
	public void setWeatherCode(String weatherCode) {
		this.weatherCode = weatherCode;
	}

	public String getWindDirection100M() {
		return this.windDirection100M;
	}
	public void setWindDirection100M(String windDirection100M) {
		this.windDirection100M = windDirection100M;
	}

	public String getWindDirection10M() {
		return this.windDirection10M;
	}
	public void setWindDirection10M(String windDirection10M) {
		this.windDirection10M = windDirection10M;
	}

	public String getWindDirection200M() {
		return this.windDirection200M;
	}
	public void setWindDirection200M(String windDirection200M) {
		this.windDirection200M = windDirection200M;
	}

	public String getWindGusts10M() {
		return this.windGusts10M;
	}
	public void setWindGusts10M(String windGusts10M) {
		this.windGusts10M = windGusts10M;
	}

	public String getWindSpeed100M() {
		return this.windSpeed100M;
	}
	public void setWindSpeed100M(String windSpeed100M) {
		this.windSpeed100M = windSpeed100M;
	}

	public String getWindSpeed10M() {
		return this.windSpeed10M;
	}
	public void setWindSpeed10M(String windSpeed10M) {
		this.windSpeed10M = windSpeed10M;
	}

	public String getWindSpeed200M() {
		return this.windSpeed200M;
	}
	public void setWindSpeed200M(String windSpeed200M) {
		this.windSpeed200M = windSpeed200M;
	}

}
