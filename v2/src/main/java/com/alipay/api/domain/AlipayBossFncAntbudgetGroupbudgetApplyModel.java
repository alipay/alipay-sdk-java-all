package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 集团预算申请
 *
 * @author auto create
 * @since 1.0, 2021-08-06 10:17:39
 */
public class AlipayBossFncAntbudgetGroupbudgetApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1173269614318349472L;

	/**
	 * 批次id，作为幂等id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 集团预算申请集合
	 */
	@ApiListField("group_budget_apply_request_list")
	@ApiField("gb_apply_request")
	private List<GbApplyRequest> groupBudgetApplyRequestList;

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

	public List<GbApplyRequest> getGroupBudgetApplyRequestList() {
		return this.groupBudgetApplyRequestList;
	}
	public void setGroupBudgetApplyRequestList(List<GbApplyRequest> groupBudgetApplyRequestList) {
		this.groupBudgetApplyRequestList = groupBudgetApplyRequestList;
	}

	public String getNs() {
		return this.ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}

}
