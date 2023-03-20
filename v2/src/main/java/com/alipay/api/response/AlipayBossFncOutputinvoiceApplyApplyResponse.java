package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-17 14:59:26
 */
public class AlipayBossFncOutputinvoiceApplyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6386345515952626316L;

	/** 
	 * 开票申请ID，唯一
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
