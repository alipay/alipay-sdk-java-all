package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.fulfillmentorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 11:27:19
 */
public class ZhimaCreditPayafteruseFulfillmentorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1642417898939467271L;

	/** 
	 * 是否履约
	 */
	@ApiField("fulfillment")
	private Boolean fulfillment;

	/** 
	 * 履约单状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/** 
	 * 履约单是否逾期过。已经逾期过的订单，还款后该值依旧是true。
	 */
	@ApiField("overdue")
	private Boolean overdue;

	public void setFulfillment(Boolean fulfillment) {
		this.fulfillment = fulfillment;
	}
	public Boolean getFulfillment( ) {
		return this.fulfillment;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}
	public String getFulfillmentStatus( ) {
		return this.fulfillmentStatus;
	}

	public void setOverdue(Boolean overdue) {
		this.overdue = overdue;
	}
	public Boolean getOverdue( ) {
		return this.overdue;
	}

}
