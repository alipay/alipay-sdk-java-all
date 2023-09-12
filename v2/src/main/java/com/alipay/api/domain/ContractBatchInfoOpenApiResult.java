package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询接口返回的合约审批信息
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:05
 */
public class ContractBatchInfoOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 4257328987316236181L;

	/**
	 * 批次审批状态（处理中：PROCESSING；已拒绝：REFUSE；已撤销：CANCEL； 已通过：PASS）
	 */
	@ApiField("approval_status")
	private String approvalStatus;

	/**
	 * 合约信息列表
	 */
	@ApiListField("contract_infos")
	@ApiField("contract_info_v_o")
	private List<ContractInfoVO> contractInfos;

	public String getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public List<ContractInfoVO> getContractInfos() {
		return this.contractInfos;
	}
	public void setContractInfos(List<ContractInfoVO> contractInfos) {
		this.contractInfos = contractInfos;
	}

}
