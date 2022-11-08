package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IssueQuotaCheckInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.issuebatch.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-13 10:07:18
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816135549343768585L;

	/** 
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	/** 
	 * 校验失败的数据
	 */
	@ApiListField("issue_quota_check_failed_list")
	@ApiField("issue_quota_check_info")
	private List<IssueQuotaCheckInfo> issueQuotaCheckFailedList;

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

}
