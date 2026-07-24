package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 国标曲线数据：百分位（P3/P25/P50/P75/P90，0-18岁按月龄合并）+ BMI 特殊界值（7-18岁消瘦/肥胖）+ BMI 界值（THRESHOLD）
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class ConsultantStandardDataVO extends AlipayObject {

	private static final long serialVersionUID = 2687295639933799757L;

	/**
	 * null
	 */
	@ApiListField("percentile_data")
	@ApiField("reference_data_item")
	private List<ReferenceDataItem> percentileData;

	/**
	 * null
	 */
	@ApiListField("special_data")
	@ApiField("reference_data_item")
	private List<ReferenceDataItem> specialData;

	/**
	 * null
	 */
	@ApiListField("thresholds")
	@ApiField("reference_data_item")
	private List<ReferenceDataItem> thresholds;

	public List<ReferenceDataItem> getPercentileData() {
		return this.percentileData;
	}
	public void setPercentileData(List<ReferenceDataItem> percentileData) {
		this.percentileData = percentileData;
	}

	public List<ReferenceDataItem> getSpecialData() {
		return this.specialData;
	}
	public void setSpecialData(List<ReferenceDataItem> specialData) {
		this.specialData = specialData;
	}

	public List<ReferenceDataItem> getThresholds() {
		return this.thresholds;
	}
	public void setThresholds(List<ReferenceDataItem> thresholds) {
		this.thresholds = thresholds;
	}

}
