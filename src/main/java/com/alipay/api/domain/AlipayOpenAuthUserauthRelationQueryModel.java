package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议授权关系查询
 *
 * @author auto create
 * @since 1.0, 2022-11-03 21:59:13
 */
public class AlipayOpenAuthUserauthRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4718621942764171524L;

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
