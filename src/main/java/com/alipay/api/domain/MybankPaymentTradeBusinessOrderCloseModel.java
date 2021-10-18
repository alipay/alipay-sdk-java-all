package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2021-09-02 17:32:16
 */
public class MybankPaymentTradeBusinessOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6849134864271895425L;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单创建的外部平台的单据号
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
