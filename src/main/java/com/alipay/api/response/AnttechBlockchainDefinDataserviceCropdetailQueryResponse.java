package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CropsGrowthInfo;
import com.alipay.api.domain.AgWeatherMonthlyStats;
import com.alipay.api.domain.CropsSoilMoistureInfo;
import com.alipay.api.domain.AgWeatherDisasterHistory;
import com.alipay.api.domain.AgWeatherDisasterInfo;
import com.alipay.api.domain.AgWeatherForecastInfo;
import com.alipay.api.domain.AgWeatherWeeklyStats;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.cropdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 18:26:34
 */
public class AnttechBlockchainDefinDataserviceCropdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6888383327426841526L;

	/** 
	 * 长势检测10期数据，product_code=1002返回
	 */
	@ApiListField("growth_infos")
	@ApiField("crops_growth_info")
	private List<CropsGrowthInfo> growthInfos;

	/** 
	 * 气象历史12月信息，product_type=1010返回
	 */
	@ApiListField("month_weather_infos")
	@ApiField("ag_weather_monthly_stats")
	private List<AgWeatherMonthlyStats> monthWeatherInfos;

	/** 
	 * 土壤墒情七天预测，product_code=1005返回
	 */
	@ApiListField("soil_moisture_infos")
	@ApiField("crops_soil_moisture_info")
	private List<CropsSoilMoistureInfo> soilMoistureInfos;

	/** 
	 * 气象灾害历史信息，product_type=1011返回
	 */
	@ApiField("weather_disaster_history")
	private AgWeatherDisasterHistory weatherDisasterHistory;

	/** 
	 * 气象灾害7天预测，product_code=1006返回
	 */
	@ApiListField("weather_disaster_infos")
	@ApiField("ag_weather_disaster_info")
	private List<AgWeatherDisasterInfo> weatherDisasterInfos;

	/** 
	 * 农业气象7天预测，product_code=1007返回
	 */
	@ApiListField("weather_forecast_infos")
	@ApiField("ag_weather_forecast_info")
	private List<AgWeatherForecastInfo> weatherForecastInfos;

	/** 
	 * 气象历史50周信息，product_type=1008返回
	 */
	@ApiListField("week_weather_infos")
	@ApiField("ag_weather_weekly_stats")
	private List<AgWeatherWeeklyStats> weekWeatherInfos;

	public void setGrowthInfos(List<CropsGrowthInfo> growthInfos) {
		this.growthInfos = growthInfos;
	}
	public List<CropsGrowthInfo> getGrowthInfos( ) {
		return this.growthInfos;
	}

	public void setMonthWeatherInfos(List<AgWeatherMonthlyStats> monthWeatherInfos) {
		this.monthWeatherInfos = monthWeatherInfos;
	}
	public List<AgWeatherMonthlyStats> getMonthWeatherInfos( ) {
		return this.monthWeatherInfos;
	}

	public void setSoilMoistureInfos(List<CropsSoilMoistureInfo> soilMoistureInfos) {
		this.soilMoistureInfos = soilMoistureInfos;
	}
	public List<CropsSoilMoistureInfo> getSoilMoistureInfos( ) {
		return this.soilMoistureInfos;
	}

	public void setWeatherDisasterHistory(AgWeatherDisasterHistory weatherDisasterHistory) {
		this.weatherDisasterHistory = weatherDisasterHistory;
	}
	public AgWeatherDisasterHistory getWeatherDisasterHistory( ) {
		return this.weatherDisasterHistory;
	}

	public void setWeatherDisasterInfos(List<AgWeatherDisasterInfo> weatherDisasterInfos) {
		this.weatherDisasterInfos = weatherDisasterInfos;
	}
	public List<AgWeatherDisasterInfo> getWeatherDisasterInfos( ) {
		return this.weatherDisasterInfos;
	}

	public void setWeatherForecastInfos(List<AgWeatherForecastInfo> weatherForecastInfos) {
		this.weatherForecastInfos = weatherForecastInfos;
	}
	public List<AgWeatherForecastInfo> getWeatherForecastInfos( ) {
		return this.weatherForecastInfos;
	}

	public void setWeekWeatherInfos(List<AgWeatherWeeklyStats> weekWeatherInfos) {
		this.weekWeatherInfos = weekWeatherInfos;
	}
	public List<AgWeatherWeeklyStats> getWeekWeatherInfos( ) {
		return this.weekWeatherInfos;
	}

}
