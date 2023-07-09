package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.statementbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:46:08
 */
public class AlipayBossFncInvoiceStatementbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6137346338511994795L;

	/** 
	 * 开票申请ID，唯一性ID
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
