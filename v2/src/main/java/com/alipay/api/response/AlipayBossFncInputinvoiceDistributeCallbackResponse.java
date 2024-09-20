package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.distribute.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-30 16:41:43
 */
public class AlipayBossFncInputinvoiceDistributeCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 6114896265444448796L;

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
