package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceInfoOpenApiResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:42:05
 */
public class AlipayBossFncInvoiceInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2564288635543158586L;

	/** 
	 * 返回结果
	 */
	@ApiField("result_set")
	private InvoiceInfoOpenApiResponseDTO resultSet;

	public void setResultSet(InvoiceInfoOpenApiResponseDTO resultSet) {
		this.resultSet = resultSet;
	}
	public InvoiceInfoOpenApiResponseDTO getResultSet( ) {
		return this.resultSet;
	}

}
