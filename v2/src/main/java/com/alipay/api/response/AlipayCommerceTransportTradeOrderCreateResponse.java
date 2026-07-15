package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trade.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 13:37:56
 */
public class AlipayCommerceTransportTradeOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3823421417361599651L;

	/** 
	 * 异步代扣描述情况
	 */
	@ApiField("async_pay_description")
	private String asyncPayDescription;

	/** 
	 * 代扣订单平台创建订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 是否异步代扣
	 */
	@ApiField("is_async_pay")
	private String isAsyncPay;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 代扣订单交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAsyncPayDescription(String asyncPayDescription) {
		this.asyncPayDescription = asyncPayDescription;
	}
	public String getAsyncPayDescription( ) {
		return this.asyncPayDescription;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setIsAsyncPay(String isAsyncPay) {
		this.isAsyncPay = isAsyncPay;
	}
	public String getIsAsyncPay( ) {
		return this.isAsyncPay;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}
	public String getOutNo( ) {
		return this.outNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
