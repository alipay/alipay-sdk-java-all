package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业气象信息月信息，包括温度、降水的月均值等
 *
 * @author auto create
 * @since 1.0, 2022-09-27 14:29:29
 */
public class AgWeatherMonthlyStats extends AlipayObject {

	private static final long serialVersionUID = 3768498443825764115L;

	/**
	 * 累计降水-月度距平值，单位mm
	 */
	@ApiField("acc_precipitation_anomaly")
	private String accPrecipitationAnomaly;

	/**
	 * 累计降水-历史月平均值，单位mm
	 */
	@ApiField("acc_precipitation_month")
	private String accPrecipitationMonth;

	/**
	 * 累计降水-本年度月度值，单位mm
	 */
	@ApiField("acc_precipitation_year")
	private String accPrecipitationYear;

	/**
	 * 平均温度-月度距平值，单位摄氏度
	 */
	@ApiField("avg_temperature_anomaly")
	private String avgTemperatureAnomaly;

	/**
	 * 平均温度-历史月平均值，单位摄氏度
	 */
	@ApiField("avg_temperature_month")
	private String avgTemperatureMonth;

	/**
	 * 平均温度-本年度月度值，单位摄氏度
	 */
	@ApiField("avg_temperature_year")
	private String avgTemperatureYear;

	/**
	 * 数据生产日期，YYYYMMDD
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 土壤湿度-月度距平值，单位百分比
	 */
	@ApiField("soil_moisture_anomaly")
	private String soilMoistureAnomaly;

	/**
	 * 土壤湿度-历史月平均值，单位百分比
	 */
	@ApiField("soil_moisture_month")
	private String soilMoistureMonth;

	/**
	 * 土壤湿度-本年度月度值，单位百分比
	 */
	@ApiField("soil_moisture_year")
	private String soilMoistureYear;

	/**
	 * 数据更新日期，YYYYMMDD
	 */
	@ApiField("update_date")
	private String updateDate;

	/**
	 * 风速-月度距平值，单位米/秒
	 */
	@ApiField("wind_speed_anomaly")
	private String windSpeedAnomaly;

	/**
	 * 风速-历史月平均值，单位米/秒
	 */
	@ApiField("wind_speed_month")
	private String windSpeedMonth;

	/**
	 * 风速-本年度月度值，单位米/秒
	 */
	@ApiField("wind_speed_year")
	private String windSpeedYear;

	public String getAccPrecipitationAnomaly() {
		return this.accPrecipitationAnomaly;
	}
	public void setAccPrecipitationAnomaly(String accPrecipitationAnomaly) {
		this.accPrecipitationAnomaly = accPrecipitationAnomaly;
	}

	public String getAccPrecipitationMonth() {
		return this.accPrecipitationMonth;
	}
	public void setAccPrecipitationMonth(String accPrecipitationMonth) {
		this.accPrecipitationMonth = accPrecipitationMonth;
	}

	public String getAccPrecipitationYear() {
		return this.accPrecipitationYear;
	}
	public void setAccPrecipitationYear(String accPrecipitationYear) {
		this.accPrecipitationYear = accPrecipitationYear;
	}

	public String getAvgTemperatureAnomaly() {
		return this.avgTemperatureAnomaly;
	}
	public void setAvgTemperatureAnomaly(String avgTemperatureAnomaly) {
		this.avgTemperatureAnomaly = avgTemperatureAnomaly;
	}

	public String getAvgTemperatureMonth() {
		return this.avgTemperatureMonth;
	}
	public void setAvgTemperatureMonth(String avgTemperatureMonth) {
		this.avgTemperatureMonth = avgTemperatureMonth;
	}

	public String getAvgTemperatureYear() {
		return this.avgTemperatureYear;
	}
	public void setAvgTemperatureYear(String avgTemperatureYear) {
		this.avgTemperatureYear = avgTemperatureYear;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getSoilMoistureAnomaly() {
		return this.soilMoistureAnomaly;
	}
	public void setSoilMoistureAnomaly(String soilMoistureAnomaly) {
		this.soilMoistureAnomaly = soilMoistureAnomaly;
	}

	public String getSoilMoistureMonth() {
		return this.soilMoistureMonth;
	}
	public void setSoilMoistureMonth(String soilMoistureMonth) {
		this.soilMoistureMonth = soilMoistureMonth;
	}

	public String getSoilMoistureYear() {
		return this.soilMoistureYear;
	}
	public void setSoilMoistureYear(String soilMoistureYear) {
		this.soilMoistureYear = soilMoistureYear;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getWindSpeedAnomaly() {
		return this.windSpeedAnomaly;
	}
	public void setWindSpeedAnomaly(String windSpeedAnomaly) {
		this.windSpeedAnomaly = windSpeedAnomaly;
	}

	public String getWindSpeedMonth() {
		return this.windSpeedMonth;
	}
	public void setWindSpeedMonth(String windSpeedMonth) {
		this.windSpeedMonth = windSpeedMonth;
	}

	public String getWindSpeedYear() {
		return this.windSpeedYear;
	}
	public void setWindSpeedYear(String windSpeedYear) {
		this.windSpeedYear = windSpeedYear;
	}

}
