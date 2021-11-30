package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付关闭订单
 *
 * @author auto create
 * @since 1.0, 2021-04-12 10:56:26
 */
public class MybankPaymentTradeNormalpayOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1445358942622473152L;

	/**
	 * 网商订单号
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
