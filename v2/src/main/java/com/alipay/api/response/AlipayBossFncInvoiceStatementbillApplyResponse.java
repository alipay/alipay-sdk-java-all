package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.statementbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:13:06
 */
public class AlipayBossFncInvoiceStatementbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3445526439895379311L;

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
