package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApUserInvoiceInfoOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.userinvoiceinfo.ou.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:51:30
 */
public class AlipayBossFncUserinvoiceinfoOuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1293222737979791659L;

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
