package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看订单详情
 *
 * @author auto create
 * @since 1.0, 2024-08-29 15:36:40
 */
public class AlipayCommerceMedicalOrderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3876595835168183655L;

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
