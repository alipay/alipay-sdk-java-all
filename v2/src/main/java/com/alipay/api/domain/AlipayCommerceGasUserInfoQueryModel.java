package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下用户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-07-01 16:02:29
 */
public class AlipayCommerceGasUserInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1538876927261113476L;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid
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
