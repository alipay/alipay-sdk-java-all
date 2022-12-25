package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceResponsePageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:51:43
 */
public class AlipayBossFncGfsettleprodInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4822816122395491567L;

	/** 
	 * 发票数据
	 */
	@ApiField("result_set")
	private InvoiceResponsePageDTO resultSet;

	public void setResultSet(InvoiceResponsePageDTO resultSet) {
		this.resultSet = resultSet;
	}
	public InvoiceResponsePageDTO getResultSet( ) {
		return this.resultSet;
	}

}
