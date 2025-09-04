package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收地址黑名单
 *
 * @author auto create
 * @since 1.0, 2025-08-14 14:39:26
 */
public class RecyleBlackAddress extends AlipayObject {

	private static final long serialVersionUID = 6575329892396311355L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区县名称
	 */
	@ApiField("district")
	private String district;

	/**
	 * 省份名称
	 */
	@ApiField("province")
	private String province;

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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
