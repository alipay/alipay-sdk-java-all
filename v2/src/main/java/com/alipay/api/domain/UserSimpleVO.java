package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:36:52
 */
public class UserSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 6316896248171633711L;

	/**
	 * 收货人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 收货人所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 收货人所在区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 收货人地址纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 收货人地址经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 收货人电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 收货人所在省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收货人姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
