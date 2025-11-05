package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同基本信息修改
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:50:37
 */
public class AlipayBossProdContractBasicModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5741735615585699276L;

	/**
	 * 新增的磋商附件文件
	 */
	@ApiListField("append_attach_files")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> appendAttachFiles;

	/**
	 * 新增的磋商合同文件列表
	 */
	@ApiListField("append_contract_files")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> appendContractFiles;

	/**
	 * 申请人
	 */
	@ApiField("applicant")
	private OpenApiPersonSaDTO applicant;

	/**
	 * 业务线
	 */
	@ApiField("business")
	private String business;

	/**
	 * 业务场景
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 合同号，H开头
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同背景描述
	 */
	@ApiField("contract_desc")
	private String contractDesc;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 财务
	 */
	@ApiListField("finance_people")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> financePeople;

	/**
	 * 法务
	 */
	@ApiListField("legal_people")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> legalPeople;

	/**
	 * 磋商人员列表
	 */
	@ApiListField("negotiators")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> negotiators;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 对方公司
	 */
	@ApiListField("opposite_parts")
	@ApiField("open_api_partner_sa_d_t_o")
	private List<OpenApiPartnerSaDTO> oppositeParts;

	/**
	 * 我方公司
	 */
	@ApiListField("our_parts")
	@ApiField("open_api_partner_sa_d_t_o")
	private List<OpenApiPartnerSaDTO> ourParts;

	/**
	 * 负责人
	 */
	@ApiListField("owners")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> owners;

	/**
	 * 源系统id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 更新信息的幂等键
	 */
	@ApiField("update_id")
	private String updateId;

	public List<OpenApiContractFileSaDTO> getAppendAttachFiles() {
		return this.appendAttachFiles;
	}
	public void setAppendAttachFiles(List<OpenApiContractFileSaDTO> appendAttachFiles) {
		this.appendAttachFiles = appendAttachFiles;
	}

	public List<OpenApiContractFileSaDTO> getAppendContractFiles() {
		return this.appendContractFiles;
	}
	public void setAppendContractFiles(List<OpenApiContractFileSaDTO> appendContractFiles) {
		this.appendContractFiles = appendContractFiles;
	}

	public OpenApiPersonSaDTO getApplicant() {
		return this.applicant;
	}
	public void setApplicant(OpenApiPersonSaDTO applicant) {
		this.applicant = applicant;
	}

	public String getBusiness() {
		return this.business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractDesc() {
		return this.contractDesc;
	}
	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public List<OpenApiPersonSaDTO> getFinancePeople() {
		return this.financePeople;
	}
	public void setFinancePeople(List<OpenApiPersonSaDTO> financePeople) {
		this.financePeople = financePeople;
	}

	public List<OpenApiPersonSaDTO> getLegalPeople() {
		return this.legalPeople;
	}
	public void setLegalPeople(List<OpenApiPersonSaDTO> legalPeople) {
		this.legalPeople = legalPeople;
	}

	public List<OpenApiPersonSaDTO> getNegotiators() {
		return this.negotiators;
	}
	public void setNegotiators(List<OpenApiPersonSaDTO> negotiators) {
		this.negotiators = negotiators;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<OpenApiPartnerSaDTO> getOppositeParts() {
		return this.oppositeParts;
	}
	public void setOppositeParts(List<OpenApiPartnerSaDTO> oppositeParts) {
		this.oppositeParts = oppositeParts;
	}

	public List<OpenApiPartnerSaDTO> getOurParts() {
		return this.ourParts;
	}
	public void setOurParts(List<OpenApiPartnerSaDTO> ourParts) {
		this.ourParts = ourParts;
	}

	public List<OpenApiPersonSaDTO> getOwners() {
		return this.owners;
	}
	public void setOwners(List<OpenApiPersonSaDTO> owners) {
		this.owners = owners;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getUpdateId() {
		return this.updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

}
