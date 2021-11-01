package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.business.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-03 10:07:02
 */
public class MybankPaymentTradeBusinessOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4691413432387168357L;

	/** 
	 * 网商银行创建的业务单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台判断是否需要重试，失败时有值，true=需要重试，false=不需要重试，是否重试可以由业务决定
	 */
	@ApiField("retry")
	private String retry;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

}
