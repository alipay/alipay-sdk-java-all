package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行交易订单查询
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:04:40
 */
public class MybankPaymentTradeBusinessOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6726754833199691895L;

	/**
	 * 网商交易订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 下单的外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
