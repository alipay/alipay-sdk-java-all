package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约号和合约审批地址
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class ContractWorkflowUrlResult extends AlipayObject {

	private static final long serialVersionUID = 1898387825796487195L;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 审批地址
	 */
	@ApiField("workflow_url")
	private String workflowUrl;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getWorkflowUrl() {
		return this.workflowUrl;
	}
	public void setWorkflowUrl(String workflowUrl) {
		this.workflowUrl = workflowUrl;
	}

}
