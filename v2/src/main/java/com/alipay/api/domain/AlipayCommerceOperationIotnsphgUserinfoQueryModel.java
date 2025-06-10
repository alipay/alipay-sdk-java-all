package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货柜行业查询用户信息接口
 *
 * @author auto create
 * @since 1.0, 2025-02-26 11:34:52
 */
public class AlipayCommerceOperationIotnsphgUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8365743945241962689L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
