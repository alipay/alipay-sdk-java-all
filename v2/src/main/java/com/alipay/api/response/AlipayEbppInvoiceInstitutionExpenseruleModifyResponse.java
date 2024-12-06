package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 10:47:04
 */
public class AlipayEbppInvoiceInstitutionExpenseruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6488164588267379513L;

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
