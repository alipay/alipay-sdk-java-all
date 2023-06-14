package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceCompanyQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.topregister.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:05:45
 */
public class AlipayEbppInvoiceTopregisterCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2891534657256696122L;

	/** 
	 * 企业税务信息查询输出
	 */
	@ApiField("result")
	private InvoiceCompanyQueryResult result;

	public void setResult(InvoiceCompanyQueryResult result) {
		this.result = result;
	}
	public InvoiceCompanyQueryResult getResult( ) {
		return this.result;
	}

}
