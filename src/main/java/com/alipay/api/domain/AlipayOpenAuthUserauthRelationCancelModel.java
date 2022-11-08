package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除协议授权关系
 *
 * @author auto create
 * @since 1.0, 2022-11-03 21:59:13
 */
public class AlipayOpenAuthUserauthRelationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1718545132629727768L;

	/**
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户支付宝uid
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
