package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.byids.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 17:57:42
 */
public class AlipayBossFncInputinvoiceByidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1753338389338725154L;

	/** 
	 * 发票查询结果
	 */
	@ApiField("result_set")
	private InputInvoiceQueryResponse resultSet;

	public void setResultSet(InputInvoiceQueryResponse resultSet) {
		this.resultSet = resultSet;
	}
	public InputInvoiceQueryResponse getResultSet( ) {
		return this.resultSet;
	}

}
