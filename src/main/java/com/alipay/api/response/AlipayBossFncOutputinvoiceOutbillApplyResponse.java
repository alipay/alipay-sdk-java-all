package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.outbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-02 20:40:35
 */
public class AlipayBossFncOutputinvoiceOutbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5799133923663779751L;

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
