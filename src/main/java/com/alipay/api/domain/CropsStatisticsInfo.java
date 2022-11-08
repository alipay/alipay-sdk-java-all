package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 作物统计信息
 *
 * @author auto create
 * @since 1.0, 2022-10-14 19:06:37
 */
public class CropsStatisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 8588498378978299733L;

	/**
	 * 附加信息
	 */
	@ApiField("addition_info")
	private String additionInfo;

	/**
	 * 作物编码
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 干旱风险地块数
	 */
	@ApiField("drought_risk_plot_count")
	private Long droughtRiskPlotCount;

	/**
	 * 作物预估收割最大时间，YYYYMMDD
	 */
	@ApiField("estimate_harvest_time_max")
	private String estimateHarvestTimeMax;

	/**
	 * 作物预估收割最小时间，YYYYMMDD
	 */
	@ApiField("estimate_harvest_time_min")
	private String estimateHarvestTimeMin;

	/**
	 * 长势一般面积
	 */
	@ApiField("growth_general_area_sum")
	private String growthGeneralAreaSum;

	/**
	 * 长势较强面积
	 */
	@ApiField("growth_stronger_area_sum")
	private String growthStrongerAreaSum;

	/**
	 * 长势极强面积
	 */
	@ApiField("growth_strongest_area_sum")
	private String growthStrongestAreaSum;

	/**
	 * 长势较弱面积
	 */
	@ApiField("growth_weaker_area_sum")
	private String growthWeakerAreaSum;

	/**
	 * 长势极弱种植面积
	 */
	@ApiField("growth_weakest_area_sum")
	private String growthWeakestAreaSum;

	/**
	 * 收割进度值，单位0～1
	 */
	@ApiField("harvest_progress_value")
	private String harvestProgressValue;

	/**
	 * 已收割总面积
	 */
	@ApiField("harvested_area_sum")
	private String harvestedAreaSum;

	/**
	 * 高温风险地块数
	 */
	@ApiField("high_temp_risk_plot_count")
	private Long highTempRiskPlotCount;

	/**
	 * 低温风险地块数
	 */
	@ApiField("low_temp_risk_plot_count")
	private Long lowTempRiskPlotCount;

	/**
	 * 成熟度达100%的地块数
	 */
	@ApiField("maturity_plot_count")
	private Long maturityPlotCount;

	/**
	 * 未收割总面积，单位亩
	 */
	@ApiField("not_harvested_area_sum")
	private String notHarvestedAreaSum;

	/**
	 * 作物种植总面积，单位亩
	 */
	@ApiField("planting_area_sum")
	private String plantingAreaSum;

	/**
	 * 地块总面积
	 */
	@ApiField("plot_area_sum")
	private String plotAreaSum;

	/**
	 * 地块数量
	 */
	@ApiField("plot_count")
	private Long plotCount;

	/**
	 * 暴风雨风险地块数
	 */
	@ApiField("rainstorm_risk_plot_count")
	private Long rainstormRiskPlotCount;

	/**
	 * 地块编码列表
	 */
	@ApiListField("region_codes")
	@ApiField("string")
	private List<String> regionCodes;

	/**
	 * 土壤墒情风险地块数
	 */
	@ApiField("soil_moisture_risk_plot_count")
	private Long soilMoistureRiskPlotCount;

	/**
	 * 总面积，单位亩
	 */
	@ApiField("total_area_sum")
	private String totalAreaSum;

	/**
	 * 预计总产量，单位KG
	 */
	@ApiField("total_yield_sum")
	private String totalYieldSum;

	public String getAdditionInfo() {
		return this.additionInfo;
	}
	public void setAdditionInfo(String additionInfo) {
		this.additionInfo = additionInfo;
	}

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public Long getDroughtRiskPlotCount() {
		return this.droughtRiskPlotCount;
	}
	public void setDroughtRiskPlotCount(Long droughtRiskPlotCount) {
		this.droughtRiskPlotCount = droughtRiskPlotCount;
	}

	public String getEstimateHarvestTimeMax() {
		return this.estimateHarvestTimeMax;
	}
	public void setEstimateHarvestTimeMax(String estimateHarvestTimeMax) {
		this.estimateHarvestTimeMax = estimateHarvestTimeMax;
	}

	public String getEstimateHarvestTimeMin() {
		return this.estimateHarvestTimeMin;
	}
	public void setEstimateHarvestTimeMin(String estimateHarvestTimeMin) {
		this.estimateHarvestTimeMin = estimateHarvestTimeMin;
	}

	public String getGrowthGeneralAreaSum() {
		return this.growthGeneralAreaSum;
	}
	public void setGrowthGeneralAreaSum(String growthGeneralAreaSum) {
		this.growthGeneralAreaSum = growthGeneralAreaSum;
	}

	public String getGrowthStrongerAreaSum() {
		return this.growthStrongerAreaSum;
	}
	public void setGrowthStrongerAreaSum(String growthStrongerAreaSum) {
		this.growthStrongerAreaSum = growthStrongerAreaSum;
	}

	public String getGrowthStrongestAreaSum() {
		return this.growthStrongestAreaSum;
	}
	public void setGrowthStrongestAreaSum(String growthStrongestAreaSum) {
		this.growthStrongestAreaSum = growthStrongestAreaSum;
	}

	public String getGrowthWeakerAreaSum() {
		return this.growthWeakerAreaSum;
	}
	public void setGrowthWeakerAreaSum(String growthWeakerAreaSum) {
		this.growthWeakerAreaSum = growthWeakerAreaSum;
	}

	public String getGrowthWeakestAreaSum() {
		return this.growthWeakestAreaSum;
	}
	public void setGrowthWeakestAreaSum(String growthWeakestAreaSum) {
		this.growthWeakestAreaSum = growthWeakestAreaSum;
	}

	public String getHarvestProgressValue() {
		return this.harvestProgressValue;
	}
	public void setHarvestProgressValue(String harvestProgressValue) {
		this.harvestProgressValue = harvestProgressValue;
	}

	public String getHarvestedAreaSum() {
		return this.harvestedAreaSum;
	}
	public void setHarvestedAreaSum(String harvestedAreaSum) {
		this.harvestedAreaSum = harvestedAreaSum;
	}

	public Long getHighTempRiskPlotCount() {
		return this.highTempRiskPlotCount;
	}
	public void setHighTempRiskPlotCount(Long highTempRiskPlotCount) {
		this.highTempRiskPlotCount = highTempRiskPlotCount;
	}

	public Long getLowTempRiskPlotCount() {
		return this.lowTempRiskPlotCount;
	}
	public void setLowTempRiskPlotCount(Long lowTempRiskPlotCount) {
		this.lowTempRiskPlotCount = lowTempRiskPlotCount;
	}

	public Long getMaturityPlotCount() {
		return this.maturityPlotCount;
	}
	public void setMaturityPlotCount(Long maturityPlotCount) {
		this.maturityPlotCount = maturityPlotCount;
	}

	public String getNotHarvestedAreaSum() {
		return this.notHarvestedAreaSum;
	}
	public void setNotHarvestedAreaSum(String notHarvestedAreaSum) {
		this.notHarvestedAreaSum = notHarvestedAreaSum;
	}

	public String getPlantingAreaSum() {
		return this.plantingAreaSum;
	}
	public void setPlantingAreaSum(String plantingAreaSum) {
		this.plantingAreaSum = plantingAreaSum;
	}

	public String getPlotAreaSum() {
		return this.plotAreaSum;
	}
	public void setPlotAreaSum(String plotAreaSum) {
		this.plotAreaSum = plotAreaSum;
	}

	public Long getPlotCount() {
		return this.plotCount;
	}
	public void setPlotCount(Long plotCount) {
		this.plotCount = plotCount;
	}

	public Long getRainstormRiskPlotCount() {
		return this.rainstormRiskPlotCount;
	}
	public void setRainstormRiskPlotCount(Long rainstormRiskPlotCount) {
		this.rainstormRiskPlotCount = rainstormRiskPlotCount;
	}

	public List<String> getRegionCodes() {
		return this.regionCodes;
	}
	public void setRegionCodes(List<String> regionCodes) {
		this.regionCodes = regionCodes;
	}

	public Long getSoilMoistureRiskPlotCount() {
		return this.soilMoistureRiskPlotCount;
	}
	public void setSoilMoistureRiskPlotCount(Long soilMoistureRiskPlotCount) {
		this.soilMoistureRiskPlotCount = soilMoistureRiskPlotCount;
	}

	public String getTotalAreaSum() {
		return this.totalAreaSum;
	}
	public void setTotalAreaSum(String totalAreaSum) {
		this.totalAreaSum = totalAreaSum;
	}

	public String getTotalYieldSum() {
		return this.totalYieldSum;
	}
	public void setTotalYieldSum(String totalYieldSum) {
		this.totalYieldSum = totalYieldSum;
	}

}
