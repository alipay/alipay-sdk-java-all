package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.floworder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 13:57:42
 */
public class AlipayCommerceAcommunicationDistributionFloworderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8455943989321821721L;

	/** 
	 * 支付宝订单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 权益到账的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}
	public String getInstOrderId( ) {
		return this.instOrderId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
