package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款查询
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:54:55
 */
public class AlipayCommerceMedicalOrderRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3754776995381724736L;

	/**
	 * 订单编号
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
