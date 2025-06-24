package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SyncInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.input.invoice.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 11:07:22
 */
public class AlipayBossFncInputInvoiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5692255734185532233L;

	/** 
	 * 结果
	 */
	@ApiField("result_set")
	private SyncInvoiceResponse resultSet;

	public void setResultSet(SyncInvoiceResponse resultSet) {
		this.resultSet = resultSet;
	}
	public SyncInvoiceResponse getResultSet( ) {
		return this.resultSet;
	}

}
