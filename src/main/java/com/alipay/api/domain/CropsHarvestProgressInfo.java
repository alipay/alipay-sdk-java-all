package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物收获进度信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 14:29:41
 */
public class CropsHarvestProgressInfo extends AlipayObject {

	private static final long serialVersionUID = 1151475232639759915L;

	/**
	 * 数据实际日期，YYYYMMDD
	 */
	@ApiField("actual_date")
	private String actualDate;

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
	 * 收割进度值，值域0～1
	 */
	@ApiField("harvest_progress_value")
	private String harvestProgressValue;

	/**
	 * 已收割面积，单位亩
	 */
	@ApiField("harvested_area")
	private String harvestedArea;

	/**
	 * 总面积，单位亩
	 */
	@ApiField("total_area")
	private String totalArea;

	public String getActualDate() {
		return this.actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}

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

	public String getHarvestProgressValue() {
		return this.harvestProgressValue;
	}
	public void setHarvestProgressValue(String harvestProgressValue) {
		this.harvestProgressValue = harvestProgressValue;
	}

	public String getHarvestedArea() {
		return this.harvestedArea;
	}
	public void setHarvestedArea(String harvestedArea) {
		this.harvestedArea = harvestedArea;
	}

	public String getTotalArea() {
		return this.totalArea;
	}
	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

}
