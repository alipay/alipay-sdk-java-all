package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * getaddress
 *
 * @author auto create
 * @since 1.0, 2022-01-26 14:25:48
 */
public class AlipayTradeFastpayMyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3871788944262184265L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 测试描述
	 */
	@ApiField("number")
	private String number;

	/**
	 * 座机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
