package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物统计信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 14:29:54
 */
public class CropsStatisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 7339126163441228988L;

	/**
	 * 作物编码
	 */
	@ApiField("crop_code")
	private String cropCode;

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
	 * 地块数量
	 */
	@ApiField("plot_count")
	private Long plotCount;

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

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
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

	public Long getPlotCount() {
		return this.plotCount;
	}
	public void setPlotCount(Long plotCount) {
		this.plotCount = plotCount;
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
