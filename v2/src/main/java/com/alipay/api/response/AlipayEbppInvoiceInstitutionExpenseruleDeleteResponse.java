package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:41:12
 */
public class AlipayEbppInvoiceInstitutionExpenseruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2453938734753986836L;

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
