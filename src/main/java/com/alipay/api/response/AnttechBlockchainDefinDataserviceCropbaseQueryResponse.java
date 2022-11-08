package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CropsGrowthInfo;
import com.alipay.api.domain.CropsHarvestForecastInfo;
import com.alipay.api.domain.CropsHarvestProgressInfo;
import com.alipay.api.domain.CropsPlantingInfo;
import com.alipay.api.domain.CropsSoilMoistureInfo;
import com.alipay.api.domain.AgWeatherDisasterInfo;
import com.alipay.api.domain.AgWeatherForecastInfo;
import com.alipay.api.domain.CropsYieldForecastInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.cropbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 18:21:32
 */
public class AnttechBlockchainDefinDataserviceCropbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531215846496866897L;

	/** 
	 * 作物编码列表
	 */
	@ApiListField("crops")
	@ApiField("string")
	private List<String> crops;

	/** 
	 * 区域内作物当期长势信息(1002)
	 */
	@ApiListField("growth_info")
	@ApiField("crops_growth_info")
	private List<CropsGrowthInfo> growthInfo;

	/** 
	 * 农作物收割预测信息(1003)
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
	 * 区域内各类作物种植信息
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
	 * 农业气象灾害预警
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

	public void setCrops(List<String> crops) {
		this.crops = crops;
	}
	public List<String> getCrops( ) {
		return this.crops;
	}

	public void setGrowthInfo(List<CropsGrowthInfo> growthInfo) {
		this.growthInfo = growthInfo;
	}
	public List<CropsGrowthInfo> getGrowthInfo( ) {
		return this.growthInfo;
	}

	public void setHarvestForecastInfo(List<CropsHarvestForecastInfo> harvestForecastInfo) {
		this.harvestForecastInfo = harvestForecastInfo;
	}
	public List<CropsHarvestForecastInfo> getHarvestForecastInfo( ) {
		return this.harvestForecastInfo;
	}

	public void setHarvestProgressInfo(List<CropsHarvestProgressInfo> harvestProgressInfo) {
		this.harvestProgressInfo = harvestProgressInfo;
	}
	public List<CropsHarvestProgressInfo> getHarvestProgressInfo( ) {
		return this.harvestProgressInfo;
	}

	public void setPlantingInfo(List<CropsPlantingInfo> plantingInfo) {
		this.plantingInfo = plantingInfo;
	}
	public List<CropsPlantingInfo> getPlantingInfo( ) {
		return this.plantingInfo;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionCode( ) {
		return this.regionCode;
	}

	public void setSoilMoistureInfo(List<CropsSoilMoistureInfo> soilMoistureInfo) {
		this.soilMoistureInfo = soilMoistureInfo;
	}
	public List<CropsSoilMoistureInfo> getSoilMoistureInfo( ) {
		return this.soilMoistureInfo;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateDate( ) {
		return this.updateDate;
	}

	public void setWeatherDisasterInfo(AgWeatherDisasterInfo weatherDisasterInfo) {
		this.weatherDisasterInfo = weatherDisasterInfo;
	}
	public AgWeatherDisasterInfo getWeatherDisasterInfo( ) {
		return this.weatherDisasterInfo;
	}

	public void setWeatherForecastInfo(AgWeatherForecastInfo weatherForecastInfo) {
		this.weatherForecastInfo = weatherForecastInfo;
	}
	public AgWeatherForecastInfo getWeatherForecastInfo( ) {
		return this.weatherForecastInfo;
	}

	public void setYieldForecastInfo(List<CropsYieldForecastInfo> yieldForecastInfo) {
		this.yieldForecastInfo = yieldForecastInfo;
	}
	public List<CropsYieldForecastInfo> getYieldForecastInfo( ) {
		return this.yieldForecastInfo;
	}

}
