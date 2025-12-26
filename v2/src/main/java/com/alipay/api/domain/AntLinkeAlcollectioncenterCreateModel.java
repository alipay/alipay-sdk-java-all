package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建法催案件
 *
 * @author auto create
 * @since 1.0, 2024-04-15 16:14:52
 */
public class AntLinkeAlcollectioncenterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6351333495117653212L;

	/**
	 * 欠款信息
	 */
	@ApiField("al_collection_create_debt")
	private AlCollectionCreateDebtDTO alCollectionCreateDebt;

	/**
	 * 调用方appCode
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 工单信息
	 */
	@ApiField("base_info")
	private AlCollectionReceiveBaseInfoDTO baseInfo;

	/**
	 * 合同信息
	 */
	@ApiField("contract_info")
	private ContractInfoDTO contractInfo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 对方信息
	 */
	@ApiField("opposite_subject_dto")
	private OppositeSubjectDTO oppositeSubjectDto;

	/**
	 * 我方主体信息
	 */
	@ApiField("our_subject_info")
	private OurSubjectInfoDTO ourSubjectInfo;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public AlCollectionCreateDebtDTO getAlCollectionCreateDebt() {
		return this.alCollectionCreateDebt;
	}
	public void setAlCollectionCreateDebt(AlCollectionCreateDebtDTO alCollectionCreateDebt) {
		this.alCollectionCreateDebt = alCollectionCreateDebt;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public AlCollectionReceiveBaseInfoDTO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(AlCollectionReceiveBaseInfoDTO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public ContractInfoDTO getContractInfo() {
		return this.contractInfo;
	}
	public void setContractInfo(ContractInfoDTO contractInfo) {
		this.contractInfo = contractInfo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public OppositeSubjectDTO getOppositeSubjectDto() {
		return this.oppositeSubjectDto;
	}
	public void setOppositeSubjectDto(OppositeSubjectDTO oppositeSubjectDto) {
		this.oppositeSubjectDto = oppositeSubjectDto;
	}

	public OurSubjectInfoDTO getOurSubjectInfo() {
		return this.ourSubjectInfo;
	}
	public void setOurSubjectInfo(OurSubjectInfoDTO ourSubjectInfo) {
		this.ourSubjectInfo = ourSubjectInfo;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
