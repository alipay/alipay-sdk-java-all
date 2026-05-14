package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果数据
 *
 * @author auto create
 * @since 1.0, 2026-05-08 16:24:31
 */
public class UserQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 2346595781127363319L;

	/**
	 * 支付宝登录账户的手机号,非患者手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
