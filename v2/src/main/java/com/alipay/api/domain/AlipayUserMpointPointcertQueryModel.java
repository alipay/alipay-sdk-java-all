package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户可领取积分查询
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:13:15
 */
public class AlipayUserMpointPointcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2685985218881713391L;

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
