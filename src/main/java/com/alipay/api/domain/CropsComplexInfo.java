package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 作物综合信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 15:13:59
 */
public class CropsComplexInfo extends AlipayObject {

	private static final long serialVersionUID = 3672949666426967672L;

	/**
	 * 作物编码列表
	 */
	@ApiListField("crops")
	@ApiField("string")
	private List<String> crops;

	/**
	 * 作物当期长势信息(1002)
	 */
	@ApiListField("growth_info")
	@ApiField("crops_growth_info")
	private List<CropsGrowthInfo> growthInfo;

	/**
	 * 作物收割预测信息
	 */
	@ApiListField("harvest_forecast_info")
	@ApiField("crops_harvest_forecast_info")
	private List<CropsHarvestForecastInfo> harvestForecastInfo;

	/**
	 * 农作物收割进度信息(1014)
	 */
	@ApiListField("harvest_progress_info")
	@ApiField("crops_harvest_progress_info")
	private List<CropsHarvestProgressInfo> harvestProgressInfo;

	/**
	 * 作物种植信息(1001)
	 */
	@ApiListField("planting_info")
	@ApiField("crops_planting_info")
	private List<CropsPlantingInfo> plantingInfo;

	/**
	 * 区域编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 土壤墒情信息(1005)
	 */
	@ApiListField("soil_moisture_info")
	@ApiField("crops_soil_moisture_info")
	private List<CropsSoilMoistureInfo> soilMoistureInfo;

	/**
	 * 数据更新日期，YYYYMMDD
	 */
	@ApiField("update_date")
	private String updateDate;

	/**
	 * 气象灾害预警(1006)
	 */
	@ApiField("weather_disaster_info")
	private AgWeatherDisasterInfo weatherDisasterInfo;

	/**
	 * 农业气象预报数据(1007)
	 */
	@ApiField("weather_forecast_info")
	private AgWeatherForecastInfo weatherForecastInfo;

	/**
	 * 作物产量预估(1004)
	 */
	@ApiListField("yield_forecast_info")
	@ApiField("crops_yield_forecast_info")
	private List<CropsYieldForecastInfo> yieldForecastInfo;

	public List<String> getCrops() {
		return this.crops;
	}
	public void setCrops(List<String> crops) {
		this.crops = crops;
	}

	public List<CropsGrowthInfo> getGrowthInfo() {
		return this.growthInfo;
	}
	public void setGrowthInfo(List<CropsGrowthInfo> growthInfo) {
		this.growthInfo = growthInfo;
	}

	public List<CropsHarvestForecastInfo> getHarvestForecastInfo() {
		return this.harvestForecastInfo;
	}
	public void setHarvestForecastInfo(List<CropsHarvestForecastInfo> harvestForecastInfo) {
		this.harvestForecastInfo = harvestForecastInfo;
	}

	public List<CropsHarvestProgressInfo> getHarvestProgressInfo() {
		return this.harvestProgressInfo;
	}
	public void setHarvestProgressInfo(List<CropsHarvestProgressInfo> harvestProgressInfo) {
		this.harvestProgressInfo = harvestProgressInfo;
	}

	public List<CropsPlantingInfo> getPlantingInfo() {
		return this.plantingInfo;
	}
	public void setPlantingInfo(List<CropsPlantingInfo> plantingInfo) {
		this.plantingInfo = plantingInfo;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public List<CropsSoilMoistureInfo> getSoilMoistureInfo() {
		return this.soilMoistureInfo;
	}
	public void setSoilMoistureInfo(List<CropsSoilMoistureInfo> soilMoistureInfo) {
		this.soilMoistureInfo = soilMoistureInfo;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public AgWeatherDisasterInfo getWeatherDisasterInfo() {
		return this.weatherDisasterInfo;
	}
	public void setWeatherDisasterInfo(AgWeatherDisasterInfo weatherDisasterInfo) {
		this.weatherDisasterInfo = weatherDisasterInfo;
	}

	public AgWeatherForecastInfo getWeatherForecastInfo() {
		return this.weatherForecastInfo;
	}
	public void setWeatherForecastInfo(AgWeatherForecastInfo weatherForecastInfo) {
		this.weatherForecastInfo = weatherForecastInfo;
	}

	public List<CropsYieldForecastInfo> getYieldForecastInfo() {
		return this.yieldForecastInfo;
	}
	public void setYieldForecastInfo(List<CropsYieldForecastInfo> yieldForecastInfo) {
		this.yieldForecastInfo = yieldForecastInfo;
	}

}
