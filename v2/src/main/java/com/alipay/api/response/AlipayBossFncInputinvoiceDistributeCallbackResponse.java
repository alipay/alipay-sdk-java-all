package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.distribute.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 17:57:09
 */
public class AlipayBossFncInputinvoiceDistributeCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 2671782862295928961L;

	/** 
	 * 回调结果
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
