package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.financing.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankPaymentTradeFinancingOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2722831998843759117L;

	/** 
	 * 处理结果状态
	 */
	@ApiField("biz_sts")
	private String bizSts;

	/** 
	 * 请求受理单号，网商创建订单成功后返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 请求受理时间
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setBizSts(String bizSts) {
		this.bizSts = bizSts;
	}
	public String getBizSts( ) {
		return this.bizSts;
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

}
