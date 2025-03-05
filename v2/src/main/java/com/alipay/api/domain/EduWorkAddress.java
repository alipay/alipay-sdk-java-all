package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贴子发布接口中的工作地点
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:26
 */
public class EduWorkAddress extends AlipayObject {

	private static final long serialVersionUID = 5776597365671335316L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 北京市
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street_name")
	private String streetName;

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

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreetName() {
		return this.streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
