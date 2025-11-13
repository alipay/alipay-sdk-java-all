package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险权益下单有效性校验
 *
 * @author auto create
 * @since 1.0, 2025-04-09 16:30:23
 */
public class AlipayInsRightsorderPreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1529779357532313938L;

	/**
	 * 当前下单的实际原始商品id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 当前校验的权益订单id。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
