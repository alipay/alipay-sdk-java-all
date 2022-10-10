package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.employeequota.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 15:35:56
 */
public class AlipayEbppInvoiceExpensecontrolEmployeequotaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136799877595514592L;

	/** 
	 * 新增的余额ID
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
