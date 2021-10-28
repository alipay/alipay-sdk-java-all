package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-25 18:00:31
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2667346855246224219L;

	/** 
	 * 新增的额度ID
	 */
	@ApiField("quota_id")
	private String quotaId;

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}
	public String getQuotaId( ) {
		return this.quotaId;
	}

}
