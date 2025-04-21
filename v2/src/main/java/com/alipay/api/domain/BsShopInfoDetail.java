package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提报门店信息对应模型
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:37
 */
public class BsShopInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 2826687969112688693L;

	/**
	 * 提报门店对应的详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 行政区域编码市级编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市级名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 行政区域编码区级编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区级名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 详细的门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 行政区域编码省级编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省级名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
