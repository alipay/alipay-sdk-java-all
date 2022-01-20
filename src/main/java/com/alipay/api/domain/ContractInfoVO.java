package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询接口返回的合约审批详情
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:05
 */
public class ContractInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8243758721222344926L;

	/**
	 * 审批列表
	 */
	@ApiListField("approval_infos")
	@ApiField("contract_approval_info_v_o")
	private List<ContractApprovalInfoVO> approvalInfos;

	/**
	 * 合约金额（元）
	 */
	@ApiField("contract_amount")
	private String contractAmount;

	/**
	 * 合约名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 币种（如：CNY）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 统计口径
	 */
	@ApiField("stats_type")
	private String statsType;

	public List<ContractApprovalInfoVO> getApprovalInfos() {
		return this.approvalInfos;
	}
	public void setApprovalInfos(List<ContractApprovalInfoVO> approvalInfos) {
		this.approvalInfos = approvalInfos;
	}

	public String getContractAmount() {
		return this.contractAmount;
	}
	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatsType() {
		return this.statsType;
	}
	public void setStatsType(String statsType) {
		this.statsType = statsType;
	}

}
