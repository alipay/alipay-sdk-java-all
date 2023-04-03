package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ArInvoiceReceiptQueryOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoicreceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:26:22
 */
public class AlipayBossFncInvoicreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3461549655372437932L;

	/** 
	 * 开票单据返回对象
	 */
	@ApiField("result_set")
	private ArInvoiceReceiptQueryOpenApiDTO resultSet;

	public void setResultSet(ArInvoiceReceiptQueryOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public ArInvoiceReceiptQueryOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
