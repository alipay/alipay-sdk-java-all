package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方的订单退款明细：包括服务号和单个服务的退款金额
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:03
 */
public class OrderRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 8125392542239485925L;

	/**
	 * 服务订单的退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 服务订单号，当商家退款时，可能包含多个服务订单
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

}
