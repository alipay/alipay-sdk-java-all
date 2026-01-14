package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请新增租房账号的请求中，账号所在地址信息
 *
 * @author auto create
 * @since 1.0, 2026-01-06 17:26:34
 */
public class IndrAddress extends AlipayObject {

	private static final long serialVersionUID = 2322423293527716654L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 地区二位编码
	 */
	@ApiField("region")
	private String region;

	/**
	 * 所在州
	 */
	@ApiField("state")
	private String state;

	/**
	 * 邮编
	 */
	@ApiField("zipcode")
	private String zipcode;

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

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
