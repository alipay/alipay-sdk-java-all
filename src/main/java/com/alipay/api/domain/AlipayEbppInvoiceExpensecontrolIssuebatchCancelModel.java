package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作废额度发放
 *
 * @author auto create
 * @since 1.0, 2022-07-16 13:33:19
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8114948521736188192L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getIssueBatchId() {
		return this.issueBatchId;
	}
	public void setIssueBatchId(String issueBatchId) {
		this.issueBatchId = issueBatchId;
	}

}
