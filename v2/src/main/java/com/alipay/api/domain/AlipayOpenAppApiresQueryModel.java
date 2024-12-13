package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isp预发验证专用
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:26:48
 */
public class AlipayOpenAppApiresQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8282553943859139393L;

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
