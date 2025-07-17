package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.broadband.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-29 14:16:15
 */
public class AlipayCommerceAcommunicationDistributionBroadbandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1126366129964463917L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 合作方订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}
	public String getInstOrderId( ) {
		return this.instOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
