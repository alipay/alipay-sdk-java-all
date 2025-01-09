package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IssueQuotaCheckInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 20:07:23
 */
public class AlipayEbppInvoiceExpensecontrolQuotaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8555656819555163253L;

	/** 
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	/** 
	 * 额度发放明细检查错误列表，可根据报错信息修改发放明细列表
	 */
	@ApiListField("issue_quota_check_failed_list")
	@ApiField("issue_quota_check_info")
	private List<IssueQuotaCheckInfo> issueQuotaCheckFailedList;

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

	public void setIssueQuotaCheckFailedList(List<IssueQuotaCheckInfo> issueQuotaCheckFailedList) {
		this.issueQuotaCheckFailedList = issueQuotaCheckFailedList;
	}
	public List<IssueQuotaCheckInfo> getIssueQuotaCheckFailedList( ) {
		return this.issueQuotaCheckFailedList;
	}

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}
	public String getQuotaId( ) {
		return this.quotaId;
	}

}
