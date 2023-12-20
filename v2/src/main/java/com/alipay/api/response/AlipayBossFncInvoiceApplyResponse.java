package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:12:25
 */
public class AlipayBossFncInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2477424497233141725L;

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
