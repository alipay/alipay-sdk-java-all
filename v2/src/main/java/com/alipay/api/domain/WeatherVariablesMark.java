package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象参数查询标记
 *
 * @author auto create
 * @since 1.0, 2026-10-15 15:34:33
 */
public class WeatherVariablesMark extends AlipayObject {

	private static final long serialVersionUID = 1335865842371794739L;

	/**
	 * 是否查询体感温度。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("apparent_temperature")
	private Boolean apparentTemperature;

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
	 * 是否查询散射辐照瞬时值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("diffuse_radiation_instant")
	private Boolean diffuseRadiationInstant;

	/**
	 * 是否查询散射辐照平均值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("diffuse_radiation_mean")
	private Boolean diffuseRadiationMean;

	/**
	 * 直接法向量辐照的标记，true表示查询，默认false
	 */
	@ApiField("direct_normal_irradiance")
	private Boolean directNormalIrradiance;

	/**
	 * 是否查询直接法向辐照瞬时值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("direct_normal_irradiance_instant")
	private Boolean directNormalIrradianceInstant;

	/**
	 * 直接辐照的标记，true表示查询，默认false
	 */
	@ApiField("direct_radiation")
	private Boolean directRadiation;

	/**
	 * 是否查询直接辐照瞬时值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("direct_radiation_instant")
	private Boolean directRadiationInstant;

	/**
	 * 是否查询直接辐照平均值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("direct_radiation_mean")
	private Boolean directRadiationMean;

	/**
	 * 是否查询降水量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("precipitation")
	private Boolean precipitation;

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
	 * 是否查询降雨量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("rain")
	private Boolean rain;

	/**
	 * 地面两米处的相对空气湿度标记，true表示查询，默认false
	 */
	@ApiField("relative_humidity_2m")
	private Boolean relativeHumidity2m;

	/**
	 * 分钟级降水量（临近预报）,支持未来2小时的降雨预报数据。
	 */
	@ApiField("short_term_rain")
	private Boolean shortTermRain;

	/**
	 * 短波辐照的标记，true表示查询，默认false
	 */
	@ApiField("shortwave_radiation")
	private Boolean shortwaveRadiation;

	/**
	 * 是否查询短波辐照瞬时值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("shortwave_radiation_instant")
	private Boolean shortwaveRadiationInstant;

	/**
	 * 是否查询短波辐照平均值。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("shortwave_radiation_mean")
	private Boolean shortwaveRadiationMean;

	/**
	 * 是否查询降雪量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("snowfall")
	private Boolean snowfall;

	/**
	 * 是否查询0至10厘米土壤水分。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_moisture_0_to_10")
	private Boolean soilMoisture0To10;

	/**
	 * 是否查询0至5厘米土壤水分。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_moisture_0_to_5")
	private Boolean soilMoisture0To5;

	/**
	 * 是否查询100至200厘米土壤水分。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_moisture_100_to_200")
	private Boolean soilMoisture100To200;

	/**
	 * 是否查询10至40厘米土壤水分。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_moisture_10_to_40")
	private Boolean soilMoisture10To40;

	/**
	 * 是否查询40至100厘米土壤水分。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_moisture_40_to_100")
	private Boolean soilMoisture40To100;

	/**
	 * 是否查询10厘米土壤温度。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_temperature_10")
	private Boolean soilTemperature10;

	/**
	 * 是否查询100厘米土壤温度。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_temperature_100")
	private Boolean soilTemperature100;

	/**
	 * 是否查询200厘米土壤温度。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_temperature_200")
	private Boolean soilTemperature200;

	/**
	 * 是否查询40厘米土壤温度。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_temperature_40")
	private Boolean soilTemperature40;

	/**
	 * 是否查询5厘米土壤温度。true表示查询，false或未传表示不查询。支持历史实测天气查询。
	 */
	@ApiField("soil_temperature_5")
	private Boolean soilTemperature5;

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
	 * 是否查询100米U风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("u_wind_100m")
	private Boolean uWind100m;

	/**
	 * 是否查询10米U风速分量。true表示查询，false或未传表示不查询。支持短期天气预测及历史实测。
	 */
	@ApiField("u_wind_10m")
	private Boolean uWind10m;

	/**
	 * 是否查询120米U风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("u_wind_120m")
	private Boolean uWind120m;

	/**
	 * 是否查询180米U风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("u_wind_180m")
	private Boolean uWind180m;

	/**
	 * 是否查询80米U风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("u_wind_80m")
	private Boolean uWind80m;

	/**
	 * 是否查询100米V风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("v_wind_100m")
	private Boolean vWind100m;

	/**
	 * 是否查询10米V风速分量。true表示查询，false或未传表示不查询。支持短期天气预测及历史实测。
	 */
	@ApiField("v_wind_10m")
	private Boolean vWind10m;

	/**
	 * 是否查询120米V风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("v_wind_120m")
	private Boolean vWind120m;

	/**
	 * 是否查询180米V风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("v_wind_180m")
	private Boolean vWind180m;

	/**
	 * 是否查询80米V风速分量。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("v_wind_80m")
	private Boolean vWind80m;

	/**
	 * 是否查询天气代码。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("weather_code")
	private Boolean weatherCode;

	/**
	 * 是否查询天气现象数值码。true表示查询，false或未传表示不查询。
	 */
	@ApiField("weather_type_code")
	private Boolean weatherTypeCode;

	/**
	 * 是否查询100米高度风向。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_direction_100m")
	private Boolean windDirection100m;

	/**
	 * 地面10米处风向标记，true表示查询，默认false
	 */
	@ApiField("wind_direction_10m")
	private Boolean windDirection10m;

	/**
	 * 是否查询120米高度风向。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_direction_120m")
	private Boolean windDirection120m;

	/**
	 * 是否查询180米高度风向。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_direction_180m")
	private Boolean windDirection180m;

	/**
	 * 地面80米处风向的标记，true表示查询，默认false
	 */
	@ApiField("wind_direction_80m")
	private Boolean windDirection80m;

	/**
	 * 是否查询10米高度阵风。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_gusts_10m")
	private Boolean windGusts10m;

	/**
	 * 是否查询100米高度风速。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_speed_100m")
	private Boolean windSpeed100m;

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
	 * 是否查询180米高度风速。true表示查询，false或未传表示不查询。支持短期天气预测。
	 */
	@ApiField("wind_speed_180m")
	private Boolean windSpeed180m;

	/**
	 * 地面80米处风速的标记，true表示查询，默认false
	 */
	@ApiField("wind_speed_80m")
	private Boolean windSpeed80m;

	public Boolean getApparentTemperature() {
		return this.apparentTemperature;
	}
	public void setApparentTemperature(Boolean apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

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

	public Boolean getDiffuseRadiationInstant() {
		return this.diffuseRadiationInstant;
	}
	public void setDiffuseRadiationInstant(Boolean diffuseRadiationInstant) {
		this.diffuseRadiationInstant = diffuseRadiationInstant;
	}

	public Boolean getDiffuseRadiationMean() {
		return this.diffuseRadiationMean;
	}
	public void setDiffuseRadiationMean(Boolean diffuseRadiationMean) {
		this.diffuseRadiationMean = diffuseRadiationMean;
	}

	public Boolean getDirectNormalIrradiance() {
		return this.directNormalIrradiance;
	}
	public void setDirectNormalIrradiance(Boolean directNormalIrradiance) {
		this.directNormalIrradiance = directNormalIrradiance;
	}

	public Boolean getDirectNormalIrradianceInstant() {
		return this.directNormalIrradianceInstant;
	}
	public void setDirectNormalIrradianceInstant(Boolean directNormalIrradianceInstant) {
		this.directNormalIrradianceInstant = directNormalIrradianceInstant;
	}

	public Boolean getDirectRadiation() {
		return this.directRadiation;
	}
	public void setDirectRadiation(Boolean directRadiation) {
		this.directRadiation = directRadiation;
	}

	public Boolean getDirectRadiationInstant() {
		return this.directRadiationInstant;
	}
	public void setDirectRadiationInstant(Boolean directRadiationInstant) {
		this.directRadiationInstant = directRadiationInstant;
	}

	public Boolean getDirectRadiationMean() {
		return this.directRadiationMean;
	}
	public void setDirectRadiationMean(Boolean directRadiationMean) {
		this.directRadiationMean = directRadiationMean;
	}

	public Boolean getPrecipitation() {
		return this.precipitation;
	}
	public void setPrecipitation(Boolean precipitation) {
		this.precipitation = precipitation;
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

	public Boolean getRain() {
		return this.rain;
	}
	public void setRain(Boolean rain) {
		this.rain = rain;
	}

	public Boolean getRelativeHumidity2m() {
		return this.relativeHumidity2m;
	}
	public void setRelativeHumidity2m(Boolean relativeHumidity2m) {
		this.relativeHumidity2m = relativeHumidity2m;
	}

	public Boolean getShortTermRain() {
		return this.shortTermRain;
	}
	public void setShortTermRain(Boolean shortTermRain) {
		this.shortTermRain = shortTermRain;
	}

	public Boolean getShortwaveRadiation() {
		return this.shortwaveRadiation;
	}
	public void setShortwaveRadiation(Boolean shortwaveRadiation) {
		this.shortwaveRadiation = shortwaveRadiation;
	}

	public Boolean getShortwaveRadiationInstant() {
		return this.shortwaveRadiationInstant;
	}
	public void setShortwaveRadiationInstant(Boolean shortwaveRadiationInstant) {
		this.shortwaveRadiationInstant = shortwaveRadiationInstant;
	}

	public Boolean getShortwaveRadiationMean() {
		return this.shortwaveRadiationMean;
	}
	public void setShortwaveRadiationMean(Boolean shortwaveRadiationMean) {
		this.shortwaveRadiationMean = shortwaveRadiationMean;
	}

	public Boolean getSnowfall() {
		return this.snowfall;
	}
	public void setSnowfall(Boolean snowfall) {
		this.snowfall = snowfall;
	}

	public Boolean getSoilMoisture0To10() {
		return this.soilMoisture0To10;
	}
	public void setSoilMoisture0To10(Boolean soilMoisture0To10) {
		this.soilMoisture0To10 = soilMoisture0To10;
	}

	public Boolean getSoilMoisture0To5() {
		return this.soilMoisture0To5;
	}
	public void setSoilMoisture0To5(Boolean soilMoisture0To5) {
		this.soilMoisture0To5 = soilMoisture0To5;
	}

	public Boolean getSoilMoisture100To200() {
		return this.soilMoisture100To200;
	}
	public void setSoilMoisture100To200(Boolean soilMoisture100To200) {
		this.soilMoisture100To200 = soilMoisture100To200;
	}

	public Boolean getSoilMoisture10To40() {
		return this.soilMoisture10To40;
	}
	public void setSoilMoisture10To40(Boolean soilMoisture10To40) {
		this.soilMoisture10To40 = soilMoisture10To40;
	}

	public Boolean getSoilMoisture40To100() {
		return this.soilMoisture40To100;
	}
	public void setSoilMoisture40To100(Boolean soilMoisture40To100) {
		this.soilMoisture40To100 = soilMoisture40To100;
	}

	public Boolean getSoilTemperature10() {
		return this.soilTemperature10;
	}
	public void setSoilTemperature10(Boolean soilTemperature10) {
		this.soilTemperature10 = soilTemperature10;
	}

	public Boolean getSoilTemperature100() {
		return this.soilTemperature100;
	}
	public void setSoilTemperature100(Boolean soilTemperature100) {
		this.soilTemperature100 = soilTemperature100;
	}

	public Boolean getSoilTemperature200() {
		return this.soilTemperature200;
	}
	public void setSoilTemperature200(Boolean soilTemperature200) {
		this.soilTemperature200 = soilTemperature200;
	}

	public Boolean getSoilTemperature40() {
		return this.soilTemperature40;
	}
	public void setSoilTemperature40(Boolean soilTemperature40) {
		this.soilTemperature40 = soilTemperature40;
	}

	public Boolean getSoilTemperature5() {
		return this.soilTemperature5;
	}
	public void setSoilTemperature5(Boolean soilTemperature5) {
		this.soilTemperature5 = soilTemperature5;
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

	public Boolean getuWind100m() {
		return this.uWind100m;
	}
	public void setuWind100m(Boolean uWind100m) {
		this.uWind100m = uWind100m;
	}

	public Boolean getuWind10m() {
		return this.uWind10m;
	}
	public void setuWind10m(Boolean uWind10m) {
		this.uWind10m = uWind10m;
	}

	public Boolean getuWind120m() {
		return this.uWind120m;
	}
	public void setuWind120m(Boolean uWind120m) {
		this.uWind120m = uWind120m;
	}

	public Boolean getuWind180m() {
		return this.uWind180m;
	}
	public void setuWind180m(Boolean uWind180m) {
		this.uWind180m = uWind180m;
	}

	public Boolean getuWind80m() {
		return this.uWind80m;
	}
	public void setuWind80m(Boolean uWind80m) {
		this.uWind80m = uWind80m;
	}

	public Boolean getvWind100m() {
		return this.vWind100m;
	}
	public void setvWind100m(Boolean vWind100m) {
		this.vWind100m = vWind100m;
	}

	public Boolean getvWind10m() {
		return this.vWind10m;
	}
	public void setvWind10m(Boolean vWind10m) {
		this.vWind10m = vWind10m;
	}

	public Boolean getvWind120m() {
		return this.vWind120m;
	}
	public void setvWind120m(Boolean vWind120m) {
		this.vWind120m = vWind120m;
	}

	public Boolean getvWind180m() {
		return this.vWind180m;
	}
	public void setvWind180m(Boolean vWind180m) {
		this.vWind180m = vWind180m;
	}

	public Boolean getvWind80m() {
		return this.vWind80m;
	}
	public void setvWind80m(Boolean vWind80m) {
		this.vWind80m = vWind80m;
	}

	public Boolean getWeatherCode() {
		return this.weatherCode;
	}
	public void setWeatherCode(Boolean weatherCode) {
		this.weatherCode = weatherCode;
	}

	public Boolean getWeatherTypeCode() {
		return this.weatherTypeCode;
	}
	public void setWeatherTypeCode(Boolean weatherTypeCode) {
		this.weatherTypeCode = weatherTypeCode;
	}

	public Boolean getWindDirection100m() {
		return this.windDirection100m;
	}
	public void setWindDirection100m(Boolean windDirection100m) {
		this.windDirection100m = windDirection100m;
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

	public Boolean getWindDirection180m() {
		return this.windDirection180m;
	}
	public void setWindDirection180m(Boolean windDirection180m) {
		this.windDirection180m = windDirection180m;
	}

	public Boolean getWindDirection80m() {
		return this.windDirection80m;
	}
	public void setWindDirection80m(Boolean windDirection80m) {
		this.windDirection80m = windDirection80m;
	}

	public Boolean getWindGusts10m() {
		return this.windGusts10m;
	}
	public void setWindGusts10m(Boolean windGusts10m) {
		this.windGusts10m = windGusts10m;
	}

	public Boolean getWindSpeed100m() {
		return this.windSpeed100m;
	}
	public void setWindSpeed100m(Boolean windSpeed100m) {
		this.windSpeed100m = windSpeed100m;
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

	public Boolean getWindSpeed180m() {
		return this.windSpeed180m;
	}
	public void setWindSpeed180m(Boolean windSpeed180m) {
		this.windSpeed180m = windSpeed180m;
	}

	public Boolean getWindSpeed80m() {
		return this.windSpeed80m;
	}
	public void setWindSpeed80m(Boolean windSpeed80m) {
		this.windSpeed80m = windSpeed80m;
	}

}
