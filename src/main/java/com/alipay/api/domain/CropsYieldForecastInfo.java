package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物产量预估信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 18:22:26
 */
public class CropsYieldForecastInfo extends AlipayObject {

	private static final long serialVersionUID = 5449681522636484719L;

	/**
	 * 数据实际日期，YYYYMMDD
	 */
	@ApiField("actual_date")
	private String actualDate;

	/**
	 * 数据实际年份，YYYY
	 */
	@ApiField("actual_year")
	private String actualYear;

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
	 * 亩产量，单位KG/亩
	 */
	@ApiField("per_unit_yield")
	private String perUnitYield;

	/**
	 * 总产量，单位KG
	 */
	@ApiField("total_yield")
	private String totalYield;

	public String getActualDate() {
		return this.actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}

	public String getActualYear() {
		return this.actualYear;
	}
	public void setActualYear(String actualYear) {
		this.actualYear = actualYear;
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

	public String getPerUnitYield() {
		return this.perUnitYield;
	}
	public void setPerUnitYield(String perUnitYield) {
		this.perUnitYield = perUnitYield;
	}

	public String getTotalYield() {
		return this.totalYield;
	}
	public void setTotalYield(String totalYield) {
		this.totalYield = totalYield;
	}

}
