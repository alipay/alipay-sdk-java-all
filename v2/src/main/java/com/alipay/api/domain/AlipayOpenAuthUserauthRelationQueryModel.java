package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议授权关系查询
 *
 * @author auto create
 * @since 1.0, 2023-02-01 17:27:15
 */
public class AlipayOpenAuthUserauthRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6115127272357567712L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
