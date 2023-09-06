package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:11:42
 */
public class AlipayEbppInvoiceInstitutionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8612542752714816178L;

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
