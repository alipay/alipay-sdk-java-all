package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象参数
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:34:33
 */
public class WeatherVariables extends AlipayObject {

	private static final long serialVersionUID = 6816642622194662146L;

	/**
	 * 体感温度	°C
	 */
	@ApiField("apparent_temperature")
	private String apparentTemperature;

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
	 * 散射辐照瞬时值	W/m^2
	 */
	@ApiField("diffuse_radiation_instant")
	private String diffuseRadiationInstant;

	/**
	 * 散射辐照平均值，单位W/m2，预测支持。
	 */
	@ApiField("diffuse_radiation_mean")
	private String diffuseRadiationMean;

	/**
	 * 直接法向量辐照,单位 W/m^2
	 */
	@ApiField("direct_normal_irradiance")
	private String directNormalIrradiance;

	/**
	 * 直接法向量辐照瞬时值	W/m^2
	 */
	@ApiField("direct_normal_irradiance_instant")
	private String directNormalIrradianceInstant;

	/**
	 * 直接辐照, W/m^2
	 */
	@ApiField("direct_radiation")
	private String directRadiation;

	/**
	 * 直接辐照瞬时值	W/m^2
	 */
	@ApiField("direct_radiation_instant")
	private String directRadiationInstant;

	/**
	 * 直接辐照平均值，单位W/m2，预测支持。
	 */
	@ApiField("direct_radiation_mean")
	private String directRadiationMean;

	/**
	 * 该条数据的预测批次时间
	 */
	@ApiField("forecast_batch_time")
	private Date forecastBatchTime;

	/**
	 * 降水量（包含所有形式）	mm
	 */
	@ApiField("precipitation")
	private String precipitation;

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
	 * 降雨量	mm
	 */
	@ApiField("rain")
	private String rain;

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
	 * 分钟级降水（临近预报），支持未来2小时降雨预报数据，单位：毫米。
	 */
	@ApiField("short_term_rain")
	private String shortTermRain;

	/**
	 * 短波辐照，单位 W/m^2
	 */
	@ApiField("shortwave_radiation")
	private String shortwaveRadiation;

	/**
	 * 短波辐照瞬时值	W/m^2
	 */
	@ApiField("shortwave_radiation_instant")
	private String shortwaveRadiationInstant;

	/**
	 * 短波辐照平均值，单位W/m2，支持短期天气预测。
	 */
	@ApiField("shortwave_radiation_mean")
	private String shortwaveRadiationMean;

	/**
	 * 降雪量	cm
	 */
	@ApiField("snowfall")
	private String snowfall;

	/**
	 * 0-10cm土壤水分，单位m3/m3，历史实测支持。
	 */
	@ApiField("soil_moisture_0_to_10")
	private String soilMoisture0To10;

	/**
	 * 0-5cm土壤水分，单位m3/m3，历史实测支持。
	 */
	@ApiField("soil_moisture_0_to_5")
	private String soilMoisture0To5;

	/**
	 * 100-200cm土壤水分，单位m3/m3，历史实测支持。
	 */
	@ApiField("soil_moisture_100_to_200")
	private String soilMoisture100To200;

	/**
	 * 10-40cm土壤水分，单位m3/m3，历史实测支持。
	 */
	@ApiField("soil_moisture_10_to_40")
	private String soilMoisture10To40;

	/**
	 * 40-100cm土壤水分，单位m3/m3，历史实测支持。
	 */
	@ApiField("soil_moisture_40_to_100")
	private String soilMoisture40To100;

	/**
	 * 10cm土壤温度，单位摄氏度，可为负数，历史实测支持。
	 */
	@ApiField("soil_temperature_10")
	private String soilTemperature10;

	/**
	 * 100cm土壤温度，单位摄氏度，可为负数，历史实测支持。
	 */
	@ApiField("soil_temperature_100")
	private String soilTemperature100;

	/**
	 * 200cm土壤温度，单位摄氏度，可为负数，历史实测支持。
	 */
	@ApiField("soil_temperature_200")
	private String soilTemperature200;

	/**
	 * 40cm土壤温度，单位摄氏度，可为负数，历史实测支持。
	 */
	@ApiField("soil_temperature_40")
	private String soilTemperature40;

	/**
	 * 5cm土壤温度，单位摄氏度，可为负数，历史实测支持。
	 */
	@ApiField("soil_temperature_5")
	private String soilTemperature5;

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
	 * 地面100米处U风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("u_wind_100_m")
	private String uWind100M;

	/**
	 * 地面10米处U风速分量，单位m/s，可为负数。预测和历史实测支持。
	 */
	@ApiField("u_wind_10_m")
	private String uWind10M;

	/**
	 * 地面120米处U风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("u_wind_120_m")
	private String uWind120M;

	/**
	 * 地面180米处U风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("u_wind_180_m")
	private String uWind180M;

	/**
	 * 地面80米处U风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("u_wind_80_m")
	private String uWind80M;

	/**
	 * 地面100米处V风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("v_wind_100_m")
	private String vWind100M;

	/**
	 * 地面10米处V风速分量，单位m/s，可为负数。预测和历史实测支持。
	 */
	@ApiField("v_wind_10_m")
	private String vWind10M;

	/**
	 * 地面120米处V风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("v_wind_120_m")
	private String vWind120M;

	/**
	 * 地面180米处V风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("v_wind_180_m")
	private String vWind180M;

	/**
	 * 地面80米处V风速分量，单位m/s，可为负数。预测支持。
	 */
	@ApiField("v_wind_80_m")
	private String vWind80M;

	/**
	 * 气象变量的日期
	 */
	@ApiField("variable_date")
	private Date variableDate;

	/**
	 * 天气代码
	 */
	@ApiField("weather_code")
	private String weatherCode;

	/**
	 * 天气现象数值码，返回天气现象对应的数值枚举。0表示晴，61表示小雨，完整取值及含义见枚举值。
	 */
	@ApiField("weather_type_code")
	private String weatherTypeCode;

	/**
	 * 地面100米处风向，单位°，预测支持。
	 */
	@ApiField("wind_direction_100_m")
	private String windDirection100M;

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
	 * 地面 180 米处风向	°
	 */
	@ApiField("wind_direction_180_m")
	private String windDirection180M;

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
	 * 地面10米处阵风，单位m/s，预测支持。
	 */
	@ApiField("wind_gusts_10_m")
	private String windGusts10M;

	/**
	 * 地面100米处风速，单位m/s，预测支持。
	 */
	@ApiField("wind_speed_100_m")
	private String windSpeed100M;

	/**
	 * 地面十米处风速，单位 m/s
	 */
	@ApiField("wind_speed_10_m")
	private String windSpeed10M;

	/**
	 * 地面十米处风速，单位 m/s 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_10m")
	@Deprecated
	private String windSpeed10m;

	/**
	 * 地面 120 米处风速，单位m/s
	 */
	@ApiField("wind_speed_120_m")
	private String windSpeed120M;

	/**
	 * 地面 120 米处风速，单位m/s 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_120m")
	@Deprecated
	private String windSpeed120m;

	/**
	 * 地面 180 米处风速	m/s
	 */
	@ApiField("wind_speed_180_m")
	private String windSpeed180M;

	/**
	 * 地面80米处风速，单位 m/s
	 */
	@ApiField("wind_speed_80_m")
	private String windSpeed80M;

	/**
	 * 地面80米处风速，单位 m/s 当前字段已废弃(网关SDK字段映射不一致)
	 */
	@ApiField("wind_speed_80m")
	@Deprecated
	private String windSpeed80m;

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

	public String getDiffuseRadiationInstant() {
		return this.diffuseRadiationInstant;
	}
	public void setDiffuseRadiationInstant(String diffuseRadiationInstant) {
		this.diffuseRadiationInstant = diffuseRadiationInstant;
	}

	public String getDiffuseRadiationMean() {
		return this.diffuseRadiationMean;
	}
	public void setDiffuseRadiationMean(String diffuseRadiationMean) {
		this.diffuseRadiationMean = diffuseRadiationMean;
	}

	public String getDirectNormalIrradiance() {
		return this.directNormalIrradiance;
	}
	public void setDirectNormalIrradiance(String directNormalIrradiance) {
		this.directNormalIrradiance = directNormalIrradiance;
	}

	public String getDirectNormalIrradianceInstant() {
		return this.directNormalIrradianceInstant;
	}
	public void setDirectNormalIrradianceInstant(String directNormalIrradianceInstant) {
		this.directNormalIrradianceInstant = directNormalIrradianceInstant;
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

	public String getDirectRadiationMean() {
		return this.directRadiationMean;
	}
	public void setDirectRadiationMean(String directRadiationMean) {
		this.directRadiationMean = directRadiationMean;
	}

	public Date getForecastBatchTime() {
		return this.forecastBatchTime;
	}
	public void setForecastBatchTime(Date forecastBatchTime) {
		this.forecastBatchTime = forecastBatchTime;
	}

	public String getPrecipitation() {
		return this.precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
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

	public String getRain() {
		return this.rain;
	}
	public void setRain(String rain) {
		this.rain = rain;
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

	public String getShortTermRain() {
		return this.shortTermRain;
	}
	public void setShortTermRain(String shortTermRain) {
		this.shortTermRain = shortTermRain;
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

	public String getShortwaveRadiationMean() {
		return this.shortwaveRadiationMean;
	}
	public void setShortwaveRadiationMean(String shortwaveRadiationMean) {
		this.shortwaveRadiationMean = shortwaveRadiationMean;
	}

	public String getSnowfall() {
		return this.snowfall;
	}
	public void setSnowfall(String snowfall) {
		this.snowfall = snowfall;
	}

	public String getSoilMoisture0To10() {
		return this.soilMoisture0To10;
	}
	public void setSoilMoisture0To10(String soilMoisture0To10) {
		this.soilMoisture0To10 = soilMoisture0To10;
	}

	public String getSoilMoisture0To5() {
		return this.soilMoisture0To5;
	}
	public void setSoilMoisture0To5(String soilMoisture0To5) {
		this.soilMoisture0To5 = soilMoisture0To5;
	}

	public String getSoilMoisture100To200() {
		return this.soilMoisture100To200;
	}
	public void setSoilMoisture100To200(String soilMoisture100To200) {
		this.soilMoisture100To200 = soilMoisture100To200;
	}

	public String getSoilMoisture10To40() {
		return this.soilMoisture10To40;
	}
	public void setSoilMoisture10To40(String soilMoisture10To40) {
		this.soilMoisture10To40 = soilMoisture10To40;
	}

	public String getSoilMoisture40To100() {
		return this.soilMoisture40To100;
	}
	public void setSoilMoisture40To100(String soilMoisture40To100) {
		this.soilMoisture40To100 = soilMoisture40To100;
	}

	public String getSoilTemperature10() {
		return this.soilTemperature10;
	}
	public void setSoilTemperature10(String soilTemperature10) {
		this.soilTemperature10 = soilTemperature10;
	}

	public String getSoilTemperature100() {
		return this.soilTemperature100;
	}
	public void setSoilTemperature100(String soilTemperature100) {
		this.soilTemperature100 = soilTemperature100;
	}

	public String getSoilTemperature200() {
		return this.soilTemperature200;
	}
	public void setSoilTemperature200(String soilTemperature200) {
		this.soilTemperature200 = soilTemperature200;
	}

	public String getSoilTemperature40() {
		return this.soilTemperature40;
	}
	public void setSoilTemperature40(String soilTemperature40) {
		this.soilTemperature40 = soilTemperature40;
	}

	public String getSoilTemperature5() {
		return this.soilTemperature5;
	}
	public void setSoilTemperature5(String soilTemperature5) {
		this.soilTemperature5 = soilTemperature5;
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

	public String getuWind100M() {
		return this.uWind100M;
	}
	public void setuWind100M(String uWind100M) {
		this.uWind100M = uWind100M;
	}

	public String getuWind10M() {
		return this.uWind10M;
	}
	public void setuWind10M(String uWind10M) {
		this.uWind10M = uWind10M;
	}

	public String getuWind120M() {
		return this.uWind120M;
	}
	public void setuWind120M(String uWind120M) {
		this.uWind120M = uWind120M;
	}

	public String getuWind180M() {
		return this.uWind180M;
	}
	public void setuWind180M(String uWind180M) {
		this.uWind180M = uWind180M;
	}

	public String getuWind80M() {
		return this.uWind80M;
	}
	public void setuWind80M(String uWind80M) {
		this.uWind80M = uWind80M;
	}

	public String getvWind100M() {
		return this.vWind100M;
	}
	public void setvWind100M(String vWind100M) {
		this.vWind100M = vWind100M;
	}

	public String getvWind10M() {
		return this.vWind10M;
	}
	public void setvWind10M(String vWind10M) {
		this.vWind10M = vWind10M;
	}

	public String getvWind120M() {
		return this.vWind120M;
	}
	public void setvWind120M(String vWind120M) {
		this.vWind120M = vWind120M;
	}

	public String getvWind180M() {
		return this.vWind180M;
	}
	public void setvWind180M(String vWind180M) {
		this.vWind180M = vWind180M;
	}

	public String getvWind80M() {
		return this.vWind80M;
	}
	public void setvWind80M(String vWind80M) {
		this.vWind80M = vWind80M;
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

	public String getWeatherTypeCode() {
		return this.weatherTypeCode;
	}
	public void setWeatherTypeCode(String weatherTypeCode) {
		this.weatherTypeCode = weatherTypeCode;
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

	public String getWindDirection180M() {
		return this.windDirection180M;
	}
	public void setWindDirection180M(String windDirection180M) {
		this.windDirection180M = windDirection180M;
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

	public String getWindSpeed180M() {
		return this.windSpeed180M;
	}
	public void setWindSpeed180M(String windSpeed180M) {
		this.windSpeed180M = windSpeed180M;
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
