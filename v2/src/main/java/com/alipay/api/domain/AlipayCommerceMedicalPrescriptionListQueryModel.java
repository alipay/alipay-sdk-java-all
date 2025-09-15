package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方单详情列表查询
 *
 * @author auto create
 * @since 1.0, 2025-07-17 15:33:53
 */
public class AlipayCommerceMedicalPrescriptionListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1699766776877143785L;

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
