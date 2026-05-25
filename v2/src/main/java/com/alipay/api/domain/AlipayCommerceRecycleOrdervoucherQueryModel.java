package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单可用券列表查询
 *
 * @author auto create
 * @since 1.0, 2026-05-21 17:48:31
 */
public class AlipayCommerceRecycleOrdervoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5477993125828781857L;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
