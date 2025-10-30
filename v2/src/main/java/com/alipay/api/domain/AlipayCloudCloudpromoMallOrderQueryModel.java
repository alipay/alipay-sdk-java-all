package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单详情
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:14
 */
public class AlipayCloudCloudpromoMallOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7334922921856367773L;

	/**
	 * 订单id
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
