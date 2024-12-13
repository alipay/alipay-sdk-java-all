package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看订单详情
 *
 * @author auto create
 * @since 1.0, 2024-12-09 14:45:52
 */
public class AlipayCommerceMedicalOrderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8464786421646986491L;

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
