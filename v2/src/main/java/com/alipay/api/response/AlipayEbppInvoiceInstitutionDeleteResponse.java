package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 15:31:48
 */
public class AlipayEbppInvoiceInstitutionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5722379615252944678L;

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
