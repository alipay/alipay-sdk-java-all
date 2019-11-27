package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户拉新咨询接口
 *
 * @author auto create
 * @since 1.0, 2019-08-29 09:38:20
 */
public class AlipayPcreditHuabeiAuthHbcrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2287267125762186454L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 1:拉新
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
