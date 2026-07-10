package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-24 17:32:58
 */
public class AlipayMarketingBenefitaccountOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6533575877435125685L;

	/** 
	 * 业务订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
