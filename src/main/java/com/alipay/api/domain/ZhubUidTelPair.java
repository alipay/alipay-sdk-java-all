package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * zoloz应用查询到的支付宝用户号和手机号信息
 *
 * @author auto create
 * @since 1.0, 2018-07-20 00:30:44
 */
public class ZhubUidTelPair extends AlipayObject {

	private static final long serialVersionUID = 5352389678468433261L;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
