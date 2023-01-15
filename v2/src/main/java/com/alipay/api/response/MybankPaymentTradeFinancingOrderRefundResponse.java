package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.financing.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 15:07:02
 */
public class MybankPaymentTradeFinancingOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7687832943232165424L;

	/** 
	 * 处理结果状态
	 */
	@ApiField("biz_sts")
	private String bizSts;

	/** 
	 * 请求受理单号
	 */
	@ApiField("operate_no")
	private String operateNo;

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

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
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
