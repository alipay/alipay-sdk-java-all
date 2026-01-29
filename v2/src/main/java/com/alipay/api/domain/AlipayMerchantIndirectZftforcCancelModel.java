package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通c2c进件撤销
 *
 * @author auto create
 * @since 1.0, 2026-01-23 11:42:43
 */
public class AlipayMerchantIndirectZftforcCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3552911118567392198L;

	/**
	 * 直付通c2c申请单
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
