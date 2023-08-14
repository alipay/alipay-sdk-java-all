package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceResponsePageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:17:01
 */
public class AlipayBossFncGfsettleprodInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2342786957199474897L;

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
