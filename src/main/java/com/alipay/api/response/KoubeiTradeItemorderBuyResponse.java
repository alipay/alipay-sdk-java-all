package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.buy response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-22 16:50:00
 */
public class KoubeiTradeItemorderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7534549835645456747L;

	/** 
	 * 收银单id，唤收银台时传入，该参数为请求级别参数，如果二次支付，需要重新获取
	 */
	@ApiField("cashier_order_id")
	private String cashierOrderId;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝交易号，唤收银台时入参
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setCashierOrderId(String cashierOrderId) {
		this.cashierOrderId = cashierOrderId;
	}
	public String getCashierOrderId( ) {
		return this.cashierOrderId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
