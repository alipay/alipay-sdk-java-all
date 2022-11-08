package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发测试-普通用户录入接口文档链路
 *
 * @author auto create
 * @since 1.0, 2022-06-23 14:23:01
 */
public class AlipaySecurityBayuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7195757237521282224L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
