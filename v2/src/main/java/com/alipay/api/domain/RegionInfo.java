package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域信息，包含省市区三级
 *
 * @author auto create
 * @since 1.0, 2023-07-21 10:47:11
 */
public class RegionInfo extends AlipayObject {

	private static final long serialVersionUID = 4157345819898153948L;

	/**
	 * 地址所属区代码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 地址所属区名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 地址所属市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 地址所属市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 地址所属省份代码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 地址所属省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
