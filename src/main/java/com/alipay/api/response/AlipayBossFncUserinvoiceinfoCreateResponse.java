package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.userinvoiceinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:58
 */
public class AlipayBossFncUserinvoiceinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825242897559914426L;

	/** 
	 * 开票资料id，唯一性ID
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
