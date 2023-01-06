package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:00:44
 */
public class AlipayBossFncInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7146837827692833842L;

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
