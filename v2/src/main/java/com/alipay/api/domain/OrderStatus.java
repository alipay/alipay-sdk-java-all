package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态信息
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class OrderStatus extends AlipayObject {

	private static final long serialVersionUID = 7442367445725633776L;

	/**
	 * 订单状态信息
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单状态描述
	 */
	@ApiField("order_desc")
	private String orderDesc;

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderDesc() {
		return this.orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

}
