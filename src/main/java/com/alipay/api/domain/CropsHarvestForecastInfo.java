package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物收获预测信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 18:20:05
 */
public class CropsHarvestForecastInfo extends AlipayObject {

	private static final long serialVersionUID = 7514655815213482471L;

	/**
	 * 数据生产日期，YYYYMMDD
	 */
	@ApiField("actual_date")
	private String actualDate;

	/**
	 * 附加信息
	 */
	@ApiField("addition_info")
	private String additionInfo;

	/**
	 * 数据生产时间，YYYYMMDD
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 作物编码
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 作物预估收割时间，YYYYMMDD
	 */
	@ApiField("estimate_harvest_time")
	private String estimateHarvestTime;

	/**
	 * 是否到收割时间
	 */
	@ApiField("is_harvest_time")
	private Boolean isHarvestTime;

	/**
	 * 成熟度，值域0～1
	 */
	@ApiField("maturity")
	private String maturity;

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

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public String getEstimateHarvestTime() {
		return this.estimateHarvestTime;
	}
	public void setEstimateHarvestTime(String estimateHarvestTime) {
		this.estimateHarvestTime = estimateHarvestTime;
	}

	public Boolean getIsHarvestTime() {
		return this.isHarvestTime;
	}
	public void setIsHarvestTime(Boolean isHarvestTime) {
		this.isHarvestTime = isHarvestTime;
	}

	public String getMaturity() {
		return this.maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

}
