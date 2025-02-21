package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 集团预算释放
 *
 * @author auto create
 * @since 1.0, 2021-08-06 10:17:49
 */
public class AlipayBossFncAntbudgetGroupbudgetRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1339571939686352935L;

	/**
	 * 批次id，作为幂等id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 集团预算释放集合
	 */
	@ApiListField("group_budget_release_request_list")
	@ApiField("gb_release_request")
	private List<GbReleaseRequest> groupBudgetReleaseRequestList;

	/**
	 * 命名空间 例如： 智科:ZK，业管:RESOURCE
	 */
	@ApiField("ns")
	private String ns;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public List<GbReleaseRequest> getGroupBudgetReleaseRequestList() {
		return this.groupBudgetReleaseRequestList;
	}
	public void setGroupBudgetReleaseRequestList(List<GbReleaseRequest> groupBudgetReleaseRequestList) {
		this.groupBudgetReleaseRequestList = groupBudgetReleaseRequestList;
	}

	public String getNs() {
		return this.ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}

}
