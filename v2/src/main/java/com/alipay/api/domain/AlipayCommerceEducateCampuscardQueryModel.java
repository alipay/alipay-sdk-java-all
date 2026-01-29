package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡查询
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:29:58
 */
public class AlipayCommerceEducateCampuscardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2274327392473512885L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户ID
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
