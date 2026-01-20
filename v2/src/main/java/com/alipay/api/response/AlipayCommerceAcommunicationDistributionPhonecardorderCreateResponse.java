package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.phonecardorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:37:37
 */
public class AlipayCommerceAcommunicationDistributionPhonecardorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7761457995324524877L;

	/** 
	 * 支付宝侧订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 合作方创单传入的订单ID
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
