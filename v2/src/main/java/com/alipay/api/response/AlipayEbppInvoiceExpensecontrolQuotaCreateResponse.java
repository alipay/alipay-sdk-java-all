package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-11 17:07:23
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2292738213786432335L;

	/** 
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	/** 
	 * 创建的额度ID
	 */
	@ApiField("quota_id")
	private String quotaId;

	public void setIssueBatchId(String issueBatchId) {
		this.issueBatchId = issueBatchId;
	}
	public String getIssueBatchId( ) {
		return this.issueBatchId;
	}

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}
	public String getQuotaId( ) {
		return this.quotaId;
	}

}
