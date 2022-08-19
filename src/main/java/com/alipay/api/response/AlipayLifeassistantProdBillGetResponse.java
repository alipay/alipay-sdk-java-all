package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.lifeassistant.prod.bill.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:14
 */
public class AlipayLifeassistantProdBillGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8321218827292869842L;

	/** 
	 * 支付金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 流水号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付款项名称
	 */
	@ApiField("order_item")
	private String orderItem;

	/** 
	 * 支付时间，毫秒
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 付款类型
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 收款方名称|机构名称
	 */
	@ApiField("payee")
	private String payee;

	/** 
	 * 交易类型
S——担保交易
FP——即时到帐
COD——货到付款
	 */
	@ApiField("trade_type")
	private String tradeType;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public String getOrderItem( ) {
		return this.orderItem;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayType( ) {
		return this.payType;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPayee( ) {
		return this.payee;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType( ) {
		return this.tradeType;
	}

}
