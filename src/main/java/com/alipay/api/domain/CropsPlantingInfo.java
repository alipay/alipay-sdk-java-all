package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物种植信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 14:14:34
 */
public class CropsPlantingInfo extends AlipayObject {

	private static final long serialVersionUID = 2278782272176778175L;

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
	 * 种植面积，单位亩
	 */
	@ApiField("planting_area")
	private String plantingArea;

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

	public String getPlantingArea() {
		return this.plantingArea;
	}
	public void setPlantingArea(String plantingArea) {
		this.plantingArea = plantingArea;
	}

}
