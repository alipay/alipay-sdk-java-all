package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 22:32:24
 */
public class AlipayEbppIndustryRentOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6237996838763866686L;

	/** 
	 * 租房平台请求支付时的预创单编号
	 */
	@ApiField("biz_seq")
	private String bizSeq;

	/** 
	 * 当前租房支付单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 租房平台跳转支付宝做组合支付的跳转地址
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setBizSeq(String bizSeq) {
		this.bizSeq = bizSeq;
	}
	public String getBizSeq( ) {
		return this.bizSeq;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
