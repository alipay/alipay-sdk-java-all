package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:42:24
 */
public class TaxRefundAddress extends AlipayObject {

	private static final long serialVersionUID = 4632419736964956152L;

	/**
	 * 地址1
	 */
	@ApiField("address_1")
	private String address1;

	/**
	 * 地址2
	 */
	@ApiField("address_2")
	private String address2;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 州或国家或省
	 */
	@ApiField("state")
	private String state;

	/**
	 * 邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddress1() {
		return this.address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
