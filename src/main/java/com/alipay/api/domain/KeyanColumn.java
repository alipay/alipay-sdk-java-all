package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字段
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:07:02
 */
public class KeyanColumn extends AlipayObject {

	private static final long serialVersionUID = 1349925192352728244L;

	/**
	 * 密码
	 */
	@ApiField("password")
	private String password;

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
