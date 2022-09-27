package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:06:16
 */
public class KoubeiMallScanpurchaseTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5842435385667974133L;

	/** 
	 * 支付宝收银单号
	 */
	@ApiField("cashier_id")
	private String cashierId;

	/** 
	 * 口碑商圈订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}
	public String getCashierId( ) {
		return this.cashierId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
