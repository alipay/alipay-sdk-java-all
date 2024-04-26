package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家地址
 *
 * @author auto create
 * @since 1.0, 2024-04-11 15:35:17
 */
public class AftersaleAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7738425555291751258L;

	/**
	 * 区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细地址
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 电话号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 联系人姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
