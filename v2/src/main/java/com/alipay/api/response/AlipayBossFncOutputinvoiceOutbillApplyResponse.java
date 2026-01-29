package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.outbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-11 16:27:30
 */
public class AlipayBossFncOutputinvoiceOutbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2188542239595246777L;

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
