package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-12 11:26:37
 */
public class AlipayBossFncOutputinvoiceApplyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421512689828574469L;

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
