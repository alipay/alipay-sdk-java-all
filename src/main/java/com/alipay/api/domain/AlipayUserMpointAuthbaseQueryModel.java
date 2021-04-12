package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户等级和积分查询接口（不需要授权）
 *
 * @author auto create
 * @since 1.0, 2021-01-12 17:59:34
 */
public class AlipayUserMpointAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4221125248881437998L;

	/**
	 * 用户的支付宝账户ID
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
