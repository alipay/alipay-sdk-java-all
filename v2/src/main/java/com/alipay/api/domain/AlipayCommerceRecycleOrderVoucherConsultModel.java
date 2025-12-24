package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单券咨询接口
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:22:41
 */
public class AlipayCommerceRecycleOrderVoucherConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7814468464234367449L;

	/**
	 * 回收交易订单ID
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
