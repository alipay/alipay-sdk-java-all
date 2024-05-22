package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay核身鉴权结果
 *
 * @author auto create
 * @since 1.0, 2020-04-05 10:05:40
 */
public class AuthenticationResult extends AlipayObject {

	private static final long serialVersionUID = 3363542569762368249L;

	/**
	 * 已加密的鉴权数据
	 */
	@ApiField("authentication_data")
	private String authenticationData;

	/**
	 * 鉴权类型，如：支付密码、数字签名
	 */
	@ApiField("authentication_mechanism")
	private String authenticationMechanism;

	public String getAuthenticationData() {
		return this.authenticationData;
	}
	public void setAuthenticationData(String authenticationData) {
		this.authenticationData = authenticationData;
	}

	public String getAuthenticationMechanism() {
		return this.authenticationMechanism;
	}
	public void setAuthenticationMechanism(String authenticationMechanism) {
		this.authenticationMechanism = authenticationMechanism;
	}

}
