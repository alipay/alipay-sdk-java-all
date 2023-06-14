package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流地址
 *
 * @author auto create
 * @since 1.0, 2023-03-28 10:44:21
 */
public class LogisticsContactAddressDTO extends AlipayObject {

	private static final long serialVersionUID = 5464267443817499149L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 地址编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

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

}
