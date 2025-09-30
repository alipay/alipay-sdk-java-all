package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星河接收快递服务商快递员信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:30:49
 */
public class CarfinCourier extends AlipayObject {

	private static final long serialVersionUID = 2846818419352458334L;

	/**
	 * 快递员姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 快递员联系电话
	 */
	@ApiField("phone")
	private String phone;

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

}
