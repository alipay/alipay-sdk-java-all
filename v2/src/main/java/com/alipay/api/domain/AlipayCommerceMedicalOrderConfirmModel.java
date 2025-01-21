package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家确认订单
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:56:40
 */
public class AlipayCommerceMedicalOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3547244927374898299L;

	/**
	 * 订单ID
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
