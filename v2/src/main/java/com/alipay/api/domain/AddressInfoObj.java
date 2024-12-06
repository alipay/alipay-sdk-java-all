package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寄件/收件地址信息
 *
 * @author auto create
 * @since 1.0, 2024-04-22 11:08:38
 */
public class AddressInfoObj extends AlipayObject {

	private static final long serialVersionUID = 8414568967651637294L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区/县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 用户姓名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 门牌号
	 */
	@ApiField("house_number")
	private String houseNumber;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * poi地点名称
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

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

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
