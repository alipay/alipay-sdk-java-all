package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 15:17:33
 */
public class AlipayCommerceRentOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4861465977529871331L;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * orderType=BUYOUT时，使用trade_no拉起收银台支付
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
