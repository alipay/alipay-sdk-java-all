package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单完结
 *
 * @author auto create
 * @since 1.0, 2025-02-20 12:03:03
 */
public class AlipayOpenMiniOrderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 2362491655232762238L;

	/**
	 * 用户OpenID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
