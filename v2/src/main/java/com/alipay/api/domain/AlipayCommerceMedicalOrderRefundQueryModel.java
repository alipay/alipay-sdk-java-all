package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款查询
 *
 * @author auto create
 * @since 1.0, 2026-09-09 16:43:19
 */
public class AlipayCommerceMedicalOrderRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2257991486833545815L;

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
