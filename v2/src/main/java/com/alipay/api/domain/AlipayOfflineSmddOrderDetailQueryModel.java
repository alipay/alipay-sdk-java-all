package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:40
 */
public class AlipayOfflineSmddOrderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3377673777752474658L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
