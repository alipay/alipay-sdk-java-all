package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台用户发票抬头列表获取
 *
 * @author auto create
 * @since 1.0, 2024-05-09 11:26:56
 */
public class AlipayEbppInvoiceTitleListGetModel extends AlipayObject {

	private static final long serialVersionUID = 4589189337519222535L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id
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
