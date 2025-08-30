package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家确认订单
 *
 * @author auto create
 * @since 1.0, 2025-03-13 14:22:34
 */
public class AlipayCommerceMedicalOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8376177943828975664L;

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
