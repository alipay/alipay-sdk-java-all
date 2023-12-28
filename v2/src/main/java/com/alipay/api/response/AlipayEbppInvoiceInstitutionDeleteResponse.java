package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-22 15:35:54
 */
public class AlipayEbppInvoiceInstitutionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2217463993422432911L;

	/** 
	 * 删除结果是否成功
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
