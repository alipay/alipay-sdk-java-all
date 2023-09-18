package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否开通森林
 *
 * @author auto create
 * @since 1.0, 2022-10-12 20:19:10
 */
public class AlipayUserCharityForestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6243584718162836589L;

	/**
	 * 用户的支付宝账户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户的支付宝账户ID
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
