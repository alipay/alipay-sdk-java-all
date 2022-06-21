package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单查询接口
 *
 * @author auto create
 * @since 1.0, 2020-11-19 16:45:56
 */
public class KoubeiCateringOrderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4746937338672328589L;

	/**
	 * 订单ID
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
