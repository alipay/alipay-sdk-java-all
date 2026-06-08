package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单可用券列表查询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 13:33:57
 */
public class AlipayCommerceRecycleOrdervoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4784475914426315688L;

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
