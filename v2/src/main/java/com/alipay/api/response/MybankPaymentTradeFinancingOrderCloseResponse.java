package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.financing.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class MybankPaymentTradeFinancingOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7857385617592376984L;

	/** 
	 * 外部业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 处理结果状态
	 */
	@ApiField("biz_sts")
	private String bizSts;

	/** 
	 * 网商订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 请求受理时间
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

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

}
