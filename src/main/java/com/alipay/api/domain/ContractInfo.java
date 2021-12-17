package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开启蚂蚁关联交易合约审批接口，合约信息入参
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:15
 */
public class ContractInfo extends AlipayObject {

	private static final long serialVersionUID = 3396362967367553262L;

	/**
	 * 合同金额（元）
	 */
	@ApiField("contract_amount")
	private String contractAmount;

	/**
	 * 合同文件信息列表
	 */
	@ApiListField("contract_file_infos")
	@ApiField("contract_file_info")
	private List<ContractFileInfo> contractFileInfos;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合同号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 币种（如：CNY）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 合同对手方公司名称列表
	 */
	@ApiListField("parse_participant_infos")
	@ApiField("string")
	private List<String> parseParticipantInfos;

	/**
	 * 合同本方公司名称列表
	 */
	@ApiListField("self_participant_infos")
	@ApiField("string")
	private List<String> selfParticipantInfos;

	public String getContractAmount() {
		return this.contractAmount;
	}
	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public List<ContractFileInfo> getContractFileInfos() {
		return this.contractFileInfos;
	}
	public void setContractFileInfos(List<ContractFileInfo> contractFileInfos) {
		this.contractFileInfos = contractFileInfos;
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

	public List<String> getParseParticipantInfos() {
		return this.parseParticipantInfos;
	}
	public void setParseParticipantInfos(List<String> parseParticipantInfos) {
		this.parseParticipantInfos = parseParticipantInfos;
	}

	public List<String> getSelfParticipantInfos() {
		return this.selfParticipantInfos;
	}
	public void setSelfParticipantInfos(List<String> selfParticipantInfos) {
		this.selfParticipantInfos = selfParticipantInfos;
	}

}
