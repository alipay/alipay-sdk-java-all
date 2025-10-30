package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全服务输出风险咨询订单信息
 *
 * @author auto create
 * @since 1.0, 2023-06-09 14:59:15
 */
public class RiskImagePlusQueryOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7759512493796974366L;

	/**
	 * 订单商品名称
	 */
	@ApiField("order_items_name")
	private String orderItemsName;

	/**
	 * 订单商品价格，单位：元
	 */
	@ApiField("order_items_price")
	private String orderItemsPrice;

	/**
	 * 订单商品数量
	 */
	@ApiField("order_items_quantity")
	private String orderItemsQuantity;

	public String getOrderItemsName() {
		return this.orderItemsName;
	}
	public void setOrderItemsName(String orderItemsName) {
		this.orderItemsName = orderItemsName;
	}

	public String getOrderItemsPrice() {
		return this.orderItemsPrice;
	}
	public void setOrderItemsPrice(String orderItemsPrice) {
		this.orderItemsPrice = orderItemsPrice;
	}

	public String getOrderItemsQuantity() {
		return this.orderItemsQuantity;
	}
	public void setOrderItemsQuantity(String orderItemsQuantity) {
		this.orderItemsQuantity = orderItemsQuantity;
	}

}
