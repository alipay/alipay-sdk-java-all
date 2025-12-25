package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期购履约计划查询
 *
 * @author auto create
 * @since 1.0, 2023-12-29 14:21:22
 */
public class AlipayCommerceRegulargoDeliveryplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7198928146438489717L;

	/**
	 * 买家支付宝用户ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

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

}
