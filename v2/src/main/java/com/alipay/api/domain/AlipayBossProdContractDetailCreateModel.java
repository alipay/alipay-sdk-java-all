package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建合同
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:51:06
 */
public class AlipayBossProdContractDetailCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2461774311556519317L;

	/**
	 * 申请人信息
	 */
	@ApiField("applicant")
	private OpenApiPersonSaDTO applicant;

	/**
	 * 合同附件
	 */
	@ApiListField("attach_files")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> attachFiles;

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
	 * 合同描述
	 */
	@ApiField("contract_desc")
	private String contractDesc;

	/**
	 * 合同文件
	 */
	@ApiListField("contract_files")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> contractFiles;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 来源系统的详情链接，例：智科双百发起合同的项目详情链接。
	 */
	@ApiField("detail_url")
	private String detailUrl;

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
	 * 磋商人员信息
	 */
	@ApiListField("negotiators")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> negotiators;

	/**
	 * 对方主体列表
	 */
	@ApiListField("opposite_parts")
	@ApiField("open_api_partner_sa_d_t_o")
	private List<OpenApiPartnerSaDTO> oppositeParts;

	/**
	 * 我方主体名称
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
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 业务幂等键，由业务自行决定
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public OpenApiPersonSaDTO getApplicant() {
		return this.applicant;
	}
	public void setApplicant(OpenApiPersonSaDTO applicant) {
		this.applicant = applicant;
	}

	public List<OpenApiContractFileSaDTO> getAttachFiles() {
		return this.attachFiles;
	}
	public void setAttachFiles(List<OpenApiContractFileSaDTO> attachFiles) {
		this.attachFiles = attachFiles;
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

	public String getContractDesc() {
		return this.contractDesc;
	}
	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	public List<OpenApiContractFileSaDTO> getContractFiles() {
		return this.contractFiles;
	}
	public void setContractFiles(List<OpenApiContractFileSaDTO> contractFiles) {
		this.contractFiles = contractFiles;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
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

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
