package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.outbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:21
 */
public class AlipayBossFncOutputinvoiceOutbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5423414469528528171L;

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
