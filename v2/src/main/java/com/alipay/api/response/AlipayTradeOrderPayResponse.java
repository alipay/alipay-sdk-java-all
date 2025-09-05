package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 20:21:24
 */
public class AlipayTradeOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174692314883538325L;

	/** 
	 * 异步支付模式。订单使用异步支付模式时才有值。
目前有五种值： ASYNC_DELAY_PAY(异步延时付款); ASYNC_REALTIME_PAY(异步准实时付款); SYNC_DIRECT_PAY(同步直接扣款); NORMAL_ASYNC_PAY(纯异步付款); QUOTA_OCCUPYIED_ASYNC_PAY(异步支付并且预占了先享后付额度);
	 */
	@ApiField("async_payment_mode")
	private String asyncPaymentMode;

	/** 
	 * 实际履约金额，单位（元）。仅履约场景才会返回
	 */
	@ApiField("fulfillment_amount")
	private String fulfillmentAmount;

	/** 
	 * 交易支付时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 商户请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 订单总金额。元为单元，精确到2位小数。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAsyncPaymentMode(String asyncPaymentMode) {
		this.asyncPaymentMode = asyncPaymentMode;
	}
	public String getAsyncPaymentMode( ) {
		return this.asyncPaymentMode;
	}

	public void setFulfillmentAmount(String fulfillmentAmount) {
		this.fulfillmentAmount = fulfillmentAmount;
	}
	public String getFulfillmentAmount( ) {
		return this.fulfillmentAmount;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
