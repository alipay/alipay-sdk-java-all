package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险预下单枯扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-03-25 16:39:59
 */
public class InsOpenPreOrderBizData extends AlipayObject {

	private static final long serialVersionUID = 4328693814152121686L;

	/**
	 * 外部的业务订单
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
