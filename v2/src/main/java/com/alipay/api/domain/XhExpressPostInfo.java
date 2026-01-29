package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寄件信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:01:01
 */
public class XhExpressPostInfo extends AlipayObject {

	private static final long serialVersionUID = 1559426311892579372L;

	/**
	 * 详细的邮寄地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地区国标码
	 */
	@ApiField("area")
	private String area;

	/**
	 * 地区国标码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省份名称
	 */
	@ApiField("province")
	private String province;

	/**
	 * 省份国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
