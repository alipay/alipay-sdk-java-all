package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.aggregation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:05:09
 */
public class AlipayEbppInvoiceExpensecontrolAggregationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4866557413199932756L;

	/** 
	 * 费控聚合关系ID
	 */
	@ApiField("aggregation_id")
	private String aggregationId;

	public void setAggregationId(String aggregationId) {
		this.aggregationId = aggregationId;
	}
	public String getAggregationId( ) {
		return this.aggregationId;
	}

}
