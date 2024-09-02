package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.byids.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-29 20:56:45
 */
public class AlipayBossFncInputinvoiceByidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6142283562239953433L;

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
