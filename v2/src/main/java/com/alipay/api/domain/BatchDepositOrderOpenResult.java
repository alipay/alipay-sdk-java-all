package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次单订单信息
 *
 * @author auto create
 * @since 1.0, 2026-07-29 09:51:12
 */
public class BatchDepositOrderOpenResult extends AlipayObject {

	private static final long serialVersionUID = 6211471512593827685L;

	/**
	 * 订单金额(单位：元)
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 自然人名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
