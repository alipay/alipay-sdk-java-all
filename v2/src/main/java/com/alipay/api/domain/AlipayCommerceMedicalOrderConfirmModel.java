package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家确认订单
 *
 * @author auto create
 * @since 1.0, 2024-09-20 11:39:45
 */
public class AlipayCommerceMedicalOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2745742224376194328L;

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
