package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医保订单结算信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 21:11:15
 */
public class AlipayCommerceMedicalMisetorderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1782834487246188279L;

	/**
	 * 订单号
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
