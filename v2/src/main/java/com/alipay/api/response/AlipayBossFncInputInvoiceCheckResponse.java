package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceCheckResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.input.invoice.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-26 14:56:58
 */
public class AlipayBossFncInputInvoiceCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 7865432842241866919L;

	/** 
	 * 发票验真返回
	 */
	@ApiField("result_set")
	private InputInvoiceCheckResponse resultSet;

	public void setResultSet(InputInvoiceCheckResponse resultSet) {
		this.resultSet = resultSet;
	}
	public InputInvoiceCheckResponse getResultSet( ) {
		return this.resultSet;
	}

}
