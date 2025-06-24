package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApUserInvoiceInfoOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.userinvoiceinfo.ou.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:59
 */
public class AlipayBossFncUserinvoiceinfoOuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1546517333628488134L;

	/** 
	 * 开票资料
	 */
	@ApiField("result_set")
	private ApUserInvoiceInfoOpenApiResponse resultSet;

	public void setResultSet(ApUserInvoiceInfoOpenApiResponse resultSet) {
		this.resultSet = resultSet;
	}
	public ApUserInvoiceInfoOpenApiResponse getResultSet( ) {
		return this.resultSet;
	}

}
