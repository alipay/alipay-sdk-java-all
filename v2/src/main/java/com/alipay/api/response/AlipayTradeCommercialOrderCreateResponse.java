package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.commercial.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-13 16:51:48
 */
public class AlipayTradeCommercialOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432988727855331589L;

	/** 
	 * 本次支付的收银台地址，可用于302跳转
	 */
	@ApiField("checkout_url")
	private String checkoutUrl;

	/** 
	 * 本次支付的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 本次订单的状态
	 */
	@ApiField("status")
	private String status;

	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	public String getCheckoutUrl( ) {
		return this.checkoutUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
