package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除额度
 *
 * @author auto create
 * @since 1.0, 2025-01-13 14:09:38
 */
public class AlipayEbppInvoiceExpensecontrolQuotaDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5165349955219565448L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	/**
	 * 额度id
	 */
	@ApiField("quota_id")
	private String quotaId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getIssueBatchId() {
		return this.issueBatchId;
	}
	public void setIssueBatchId(String issueBatchId) {
		this.issueBatchId = issueBatchId;
	}

	public String getQuotaId() {
		return this.quotaId;
	}
	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

}
