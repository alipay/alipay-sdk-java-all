package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceRegisterResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.inputinvoice.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 15:39:37
 */
public class AlipayBossFncInputinvoiceRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8379296886691284326L;

	/** 
	 * 返回结果
	 */
	@ApiField("result_set")
	private InputInvoiceRegisterResponse resultSet;

	public void setResultSet(InputInvoiceRegisterResponse resultSet) {
		this.resultSet = resultSet;
	}
	public InputInvoiceRegisterResponse getResultSet( ) {
		return this.resultSet;
	}

}
