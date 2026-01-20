package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取AQ问答H5授权令牌
 *
 * @author auto create
 * @since 1.0, 2025-11-05 18:07:41
 */
public class AlipayCommerceMedicalAqTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4786561292363626397L;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 未过期不需要传
刷新令牌，上次换取访问令牌时得到
	 */
	@ApiField("refresh_token")
	private String refreshToken;

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

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
