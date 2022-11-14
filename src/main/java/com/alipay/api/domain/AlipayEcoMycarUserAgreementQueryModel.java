package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权状态API
 *
 * @author auto create
 * @since 1.0, 2022-10-12 15:55:49
 */
public class AlipayEcoMycarUserAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8522683556323549771L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
