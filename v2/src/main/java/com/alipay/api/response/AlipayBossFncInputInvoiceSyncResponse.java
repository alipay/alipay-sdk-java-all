package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SyncInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.input.invoice.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 13:46:46
 */
public class AlipayBossFncInputInvoiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8293543143536855476L;

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
