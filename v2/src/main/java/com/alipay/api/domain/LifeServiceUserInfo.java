package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:41:46
 */
public class LifeServiceUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5373194787937546678L;

	/**
	 * 用于展示订单归属的手机号易于辨识
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
