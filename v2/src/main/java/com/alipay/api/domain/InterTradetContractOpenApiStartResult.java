package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联交易合约审批发起返回结果
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class InterTradetContractOpenApiStartResult extends AlipayObject {

	private static final long serialVersionUID = 8376627339663768651L;

	/**
	 * 合约审批地址
	 */
	@ApiListField("contract_workflow_urls")
	@ApiField("contract_workflow_url_result")
	private List<ContractWorkflowUrlResult> contractWorkflowUrls;

	public List<ContractWorkflowUrlResult> getContractWorkflowUrls() {
		return this.contractWorkflowUrls;
	}
	public void setContractWorkflowUrls(List<ContractWorkflowUrlResult> contractWorkflowUrls) {
		this.contractWorkflowUrls = contractWorkflowUrls;
	}

}
