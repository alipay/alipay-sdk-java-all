package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业地址
 *
 * @author auto create
 * @since 1.0, 2023-08-30 17:56:00
 */
public class OperationAddress extends AlipayObject {

	private static final long serialVersionUID = 6438772851792927958L;

	/**
	 * 营业地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国籍
	 */
	@ApiField("region")
	private String region;

	/**
	 * 省份
	 */
	@ApiField("state")
	private String state;

	/**
	 * 邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;

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

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
