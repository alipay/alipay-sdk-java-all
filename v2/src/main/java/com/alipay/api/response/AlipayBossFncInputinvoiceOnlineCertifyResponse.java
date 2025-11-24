package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.online.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 10:28:14
 */
public class AlipayBossFncInputinvoiceOnlineCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536215932117641351L;

	/** 
	 * 勾选结果
	 */
	@ApiField("result_set")
	private InputInvoiceResponse resultSet;

	public void setResultSet(InputInvoiceResponse resultSet) {
		this.resultSet = resultSet;
	}
	public InputInvoiceResponse getResultSet( ) {
		return this.resultSet;
	}

}
