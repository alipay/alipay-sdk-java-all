package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权状态API
 *
 * @author auto create
 * @since 1.0, 2021-10-25 13:09:33
 */
public class AlipayEcoMycarUserAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2345469826263748225L;

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
