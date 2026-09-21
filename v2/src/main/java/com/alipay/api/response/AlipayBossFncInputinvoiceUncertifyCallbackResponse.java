package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.uncertify.callback response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-19 11:33:55
 */
public class AlipayBossFncInputinvoiceUncertifyCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4497721735517881993L;

	/** 
	 * 结果
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
