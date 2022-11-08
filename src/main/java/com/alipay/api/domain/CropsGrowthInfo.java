package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物生长情况信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 18:18:46
 */
public class CropsGrowthInfo extends AlipayObject {

	private static final long serialVersionUID = 6339513135968344652L;

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
	 * 长势一般面积，单位亩
	 */
	@ApiField("general_area")
	private String generalArea;

	/**
	 * 长势强弱，值域1～5
	 */
	@ApiField("strength")
	private Long strength;

	/**
	 * 长势较强面积，单位亩
	 */
	@ApiField("stronger_area")
	private String strongerArea;

	/**
	 * 长势极强面积，单位亩
	 */
	@ApiField("strongest_area")
	private String strongestArea;

	/**
	 * 长势预警值，值域-1～0
	 */
	@ApiField("warn")
	private String warn;

	/**
	 * 长势较弱面积，单位亩
	 */
	@ApiField("weaker_area")
	private String weakerArea;

	/**
	 * 长势极弱面积，单位亩
	 */
	@ApiField("weakest_area")
	private String weakestArea;

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

	public String getGeneralArea() {
		return this.generalArea;
	}
	public void setGeneralArea(String generalArea) {
		this.generalArea = generalArea;
	}

	public Long getStrength() {
		return this.strength;
	}
	public void setStrength(Long strength) {
		this.strength = strength;
	}

	public String getStrongerArea() {
		return this.strongerArea;
	}
	public void setStrongerArea(String strongerArea) {
		this.strongerArea = strongerArea;
	}

	public String getStrongestArea() {
		return this.strongestArea;
	}
	public void setStrongestArea(String strongestArea) {
		this.strongestArea = strongestArea;
	}

	public String getWarn() {
		return this.warn;
	}
	public void setWarn(String warn) {
		this.warn = warn;
	}

	public String getWeakerArea() {
		return this.weakerArea;
	}
	public void setWeakerArea(String weakerArea) {
		this.weakerArea = weakerArea;
	}

	public String getWeakestArea() {
		return this.weakestArea;
	}
	public void setWeakestArea(String weakestArea) {
		this.weakestArea = weakestArea;
	}

}
