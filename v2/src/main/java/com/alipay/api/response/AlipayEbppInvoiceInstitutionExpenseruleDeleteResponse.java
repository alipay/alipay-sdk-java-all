package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:21:46
 */
public class AlipayEbppInvoiceInstitutionExpenseruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7658646851187361587L;

	/** 
	 * 删除是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
