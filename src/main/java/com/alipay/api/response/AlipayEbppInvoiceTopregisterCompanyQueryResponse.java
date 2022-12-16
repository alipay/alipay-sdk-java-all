package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceCompanyQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.topregister.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:28:26
 */
public class AlipayEbppInvoiceTopregisterCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1153116877819186698L;

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
