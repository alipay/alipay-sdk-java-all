package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:06:19
 */
public class AlipayEbppInvoiceInstitutionExpenseruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2377467737273553887L;

	/** 
	 * 编辑结果是否成功
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
