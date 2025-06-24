package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款查询
 *
 * @author auto create
 * @since 1.0, 2025-03-13 14:23:38
 */
public class AlipayCommerceMedicalOrderRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2255742937644576478L;

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
