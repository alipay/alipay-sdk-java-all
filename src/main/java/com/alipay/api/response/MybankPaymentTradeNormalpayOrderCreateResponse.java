package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-13 20:30:19
 */
public class MybankPaymentTradeNormalpayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792755586181591546L;

	/** 
	 * 场景端依赖该URL，拉起网商收银台，需和支付渠道的http前缀结合
	 */
	@ApiField("cashier_url")
	private String cashierUrl;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 请求受理时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台判断是否可重试，失败时有值，true=可重试，false=不可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setCashierUrl(String cashierUrl) {
		this.cashierUrl = cashierUrl;
	}
	public String getCashierUrl( ) {
		return this.cashierUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setRequestAcceptTime(String requestAcceptTime) {
		this.requestAcceptTime = requestAcceptTime;
	}
	public String getRequestAcceptTime( ) {
		return this.requestAcceptTime;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
