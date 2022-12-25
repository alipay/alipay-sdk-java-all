package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:40:33
 */
public class MybankPaymentTradeNormalpayOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7316331563564996278L;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 创建订单时的请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台是否可重试，失败时有值，true=可重试，false=不可重试
	 */
	@ApiField("retry")
	private Boolean retry;

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

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
