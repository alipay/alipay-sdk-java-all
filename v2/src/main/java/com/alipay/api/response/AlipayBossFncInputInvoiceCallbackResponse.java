package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.input.invoice.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 13:46:46
 */
public class AlipayBossFncInputInvoiceCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5821346941898497914L;

	/** 
	 * 请求结果
	 */
	@ApiField("result_set")
	private Boolean resultSet;

	public void setResultSet(Boolean resultSet) {
		this.resultSet = resultSet;
	}
	public Boolean getResultSet( ) {
		return this.resultSet;
	}

}
