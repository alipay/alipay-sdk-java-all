package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付订单查询
 *
 * @author auto create
 * @since 1.0, 2019-01-07 10:50:51
 */
public class MybankPaymentTradeNormalpayOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6493113896546593994L;

	/**
	 * 创建订单时返回的订单号
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
