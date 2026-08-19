package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖用户确认
 *
 * @author auto create
 * @since 1.0, 2026-07-29 16:07:51
 */
public class AlipayCommerceResaleOrderUserConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4672873978236548181L;

	/**
	 * 确认方
	 */
	@ApiField("confirm_role")
	private String confirmRole;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getConfirmRole() {
		return this.confirmRole;
	}
	public void setConfirmRole(String confirmRole) {
		this.confirmRole = confirmRole;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
