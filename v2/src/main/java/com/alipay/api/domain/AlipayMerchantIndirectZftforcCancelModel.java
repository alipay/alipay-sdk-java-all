package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通c2c进件撤销
 *
 * @author auto create
 * @since 1.0, 2026-06-23 10:38:55
 */
public class AlipayMerchantIndirectZftforcCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3648665571617963296L;

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
