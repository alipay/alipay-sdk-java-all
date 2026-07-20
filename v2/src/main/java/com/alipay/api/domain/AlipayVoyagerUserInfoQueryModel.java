package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Voyager用户信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:47:44
 */
public class AlipayVoyagerUserInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4566547843212625297L;

	/**
	 * 通过Voyager提供的前端SDK获取的用户授权CODE
	 */
	@ApiField("auth_code")
	private String authCode;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
