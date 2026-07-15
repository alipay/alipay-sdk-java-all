package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付订单结果查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 19:32:55
 */
public class AlipayTradeCommercialOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4327198971922861373L;

	/**
	 * 订单号，通过订单创建接口获取
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
