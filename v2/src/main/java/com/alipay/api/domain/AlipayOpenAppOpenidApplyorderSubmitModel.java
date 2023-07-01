package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenID转换工单提交审核
 *
 * @author auto create
 * @since 1.0, 2023-04-24 14:46:39
 */
public class AlipayOpenAppOpenidApplyorderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4424638143983354135L;

	/**
	 * 工单唯一标识
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
