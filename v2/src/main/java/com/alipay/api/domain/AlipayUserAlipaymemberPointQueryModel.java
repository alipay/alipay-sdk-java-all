package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户积分余额
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:13:53
 */
public class AlipayUserAlipaymemberPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1124884891499693555L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
