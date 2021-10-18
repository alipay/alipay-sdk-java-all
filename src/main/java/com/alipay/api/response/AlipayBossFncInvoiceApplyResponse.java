package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-11 11:26:00
 */
public class AlipayBossFncInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6454936772252897957L;

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
