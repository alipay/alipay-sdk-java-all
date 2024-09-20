package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同详情，包括磋商信息
 *
 * @author auto create
 * @since 1.0, 2023-11-08 13:37:48
 */
public class OpenApiContractMatterDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1286194515424187227L;

	/**
	 * 合同申请人
	 */
	@ApiField("applicant")
	private OpenApiPersonSaDTO applicant;

	/**
	 * 合同申请通过时间
	 */
	@ApiField("apply_end_time")
	private Date applyEndTime;

	/**
	 * 合同申请时间
	 */
	@ApiField("apply_start_time")
	private Date applyStartTime;

	/**
	 * 合同状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 业务线
	 */
	@ApiField("business_line")
	private String businessLine;

	/**
	 * 合同描述
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 各阶段定稿意见
	 */
	@ApiListField("confirm_comment_list")
	@ApiField("open_api_comment_d_t_o")
	private List<OpenApiCommentDTO> confirmCommentList;

	/**
	 * 合同附件
	 */
	@ApiListField("contract_attach_list")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> contractAttachList;

	/**
	 * 合同号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 磋商协同人
	 */
	@ApiListField("contract_coordinator_list")
	@ApiField("open_api_contract_coordinator_d_t_o")
	private List<OpenApiContractCoordinatorDTO> contractCoordinatorList;

	/**
	 * 合同创建时间-业务时间
	 */
	@ApiField("contract_create_time")
	private Date contractCreateTime;

	/**
	 * 合同文件
	 */
	@ApiListField("contract_doc_list")
	@ApiField("open_api_contract_file_sa_d_t_o")
	private List<OpenApiContractFileSaDTO> contractDocList;

	/**
	 * 磋商合同文件list
	 */
	@ApiListField("contract_file_results")
	@ApiField("open_api_contract_file_d_t_o")
	private List<OpenApiContractFileDTO> contractFileResults;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 商业关系，我方（甲方）
	 */
	@ApiListField("contract_partner_a_dto_list")
	@ApiField("open_api_partner_sa_d_t_o")
	private List<OpenApiPartnerSaDTO> contractPartnerADtoList;

	/**
	 * 商业关系，对方（乙方）
	 */
	@ApiListField("contract_partner_b_dto_list")
	@ApiField("open_api_partner_sa_d_t_o")
	private List<OpenApiPartnerSaDTO> contractPartnerBDtoList;

	/**
	 * 纸质用印
	 */
	@ApiField("contract_sign_type")
	private String contractSignType;

	/**
	 * 合同模板ID
	 */
	@ApiField("contract_template_code")
	private String contractTemplateCode;

	/**
	 * 业法工作台合同详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 合同生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 合同失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 接口财务
	 */
	@ApiListField("finance_people")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> financePeople;

	/**
	 * 是否模板，只有受理之后的合同才会返回这个字段
	 */
	@ApiField("is_template")
	private Boolean isTemplate;

	/**
	 * 接口法务
	 */
	@ApiListField("legal_people")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> legalPeople;

	/**
	 * 磋商事项附件
	 */
	@ApiListField("matter_attachment_results")
	@ApiField("open_api_contract_file_d_t_o")
	private List<OpenApiContractFileDTO> matterAttachmentResults;

	/**
	 * 磋商code
	 */
	@ApiField("matter_code")
	private String matterCode;

	/**
	 * 磋商成员评论集合
	 */
	@ApiListField("matter_comment_list")
	@ApiField("open_api_matter_comment_d_t_o")
	private List<OpenApiMatterCommentDTO> matterCommentList;

	/**
	 * 合同份数
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 作废前原始业务状态
	 */
	@ApiField("origin_biz_status")
	private String originBizStatus;

	/**
	 * 合同负责人
	 */
	@ApiListField("owners")
	@ApiField("open_api_person_sa_d_t_o")
	private List<OpenApiPersonSaDTO> owners;

	/**
	 * 关联事项
	 */
	@ApiListField("relate_matter_list")
	@ApiField("open_api_relate_matter_d_t_o")
	private List<OpenApiRelateMatterDTO> relateMatterList;

	/**
	 * 页面展示的状态
	 */
	@ApiField("show_biz_status")
	private String showBizStatus;

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

	public OpenApiPersonSaDTO getApplicant() {
		return this.applicant;
	}
	public void setApplicant(OpenApiPersonSaDTO applicant) {
		this.applicant = applicant;
	}

	public Date getApplyEndTime() {
		return this.applyEndTime;
	}
	public void setApplyEndTime(Date applyEndTime) {
		this.applyEndTime = applyEndTime;
	}

	public Date getApplyStartTime() {
		return this.applyStartTime;
	}
	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessLine() {
		return this.businessLine;
	}
	public void setBusinessLine(String businessLine) {
		this.businessLine = businessLine;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<OpenApiCommentDTO> getConfirmCommentList() {
		return this.confirmCommentList;
	}
	public void setConfirmCommentList(List<OpenApiCommentDTO> confirmCommentList) {
		this.confirmCommentList = confirmCommentList;
	}

	public List<OpenApiContractFileSaDTO> getContractAttachList() {
		return this.contractAttachList;
	}
	public void setContractAttachList(List<OpenApiContractFileSaDTO> contractAttachList) {
		this.contractAttachList = contractAttachList;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public List<OpenApiContractCoordinatorDTO> getContractCoordinatorList() {
		return this.contractCoordinatorList;
	}
	public void setContractCoordinatorList(List<OpenApiContractCoordinatorDTO> contractCoordinatorList) {
		this.contractCoordinatorList = contractCoordinatorList;
	}

	public Date getContractCreateTime() {
		return this.contractCreateTime;
	}
	public void setContractCreateTime(Date contractCreateTime) {
		this.contractCreateTime = contractCreateTime;
	}

	public List<OpenApiContractFileSaDTO> getContractDocList() {
		return this.contractDocList;
	}
	public void setContractDocList(List<OpenApiContractFileSaDTO> contractDocList) {
		this.contractDocList = contractDocList;
	}

	public List<OpenApiContractFileDTO> getContractFileResults() {
		return this.contractFileResults;
	}
	public void setContractFileResults(List<OpenApiContractFileDTO> contractFileResults) {
		this.contractFileResults = contractFileResults;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public List<OpenApiPartnerSaDTO> getContractPartnerADtoList() {
		return this.contractPartnerADtoList;
	}
	public void setContractPartnerADtoList(List<OpenApiPartnerSaDTO> contractPartnerADtoList) {
		this.contractPartnerADtoList = contractPartnerADtoList;
	}

	public List<OpenApiPartnerSaDTO> getContractPartnerBDtoList() {
		return this.contractPartnerBDtoList;
	}
	public void setContractPartnerBDtoList(List<OpenApiPartnerSaDTO> contractPartnerBDtoList) {
		this.contractPartnerBDtoList = contractPartnerBDtoList;
	}

	public String getContractSignType() {
		return this.contractSignType;
	}
	public void setContractSignType(String contractSignType) {
		this.contractSignType = contractSignType;
	}

	public String getContractTemplateCode() {
		return this.contractTemplateCode;
	}
	public void setContractTemplateCode(String contractTemplateCode) {
		this.contractTemplateCode = contractTemplateCode;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public List<OpenApiPersonSaDTO> getFinancePeople() {
		return this.financePeople;
	}
	public void setFinancePeople(List<OpenApiPersonSaDTO> financePeople) {
		this.financePeople = financePeople;
	}

	public Boolean getIsTemplate() {
		return this.isTemplate;
	}
	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	public List<OpenApiPersonSaDTO> getLegalPeople() {
		return this.legalPeople;
	}
	public void setLegalPeople(List<OpenApiPersonSaDTO> legalPeople) {
		this.legalPeople = legalPeople;
	}

	public List<OpenApiContractFileDTO> getMatterAttachmentResults() {
		return this.matterAttachmentResults;
	}
	public void setMatterAttachmentResults(List<OpenApiContractFileDTO> matterAttachmentResults) {
		this.matterAttachmentResults = matterAttachmentResults;
	}

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	public List<OpenApiMatterCommentDTO> getMatterCommentList() {
		return this.matterCommentList;
	}
	public void setMatterCommentList(List<OpenApiMatterCommentDTO> matterCommentList) {
		this.matterCommentList = matterCommentList;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getOriginBizStatus() {
		return this.originBizStatus;
	}
	public void setOriginBizStatus(String originBizStatus) {
		this.originBizStatus = originBizStatus;
	}

	public List<OpenApiPersonSaDTO> getOwners() {
		return this.owners;
	}
	public void setOwners(List<OpenApiPersonSaDTO> owners) {
		this.owners = owners;
	}

	public List<OpenApiRelateMatterDTO> getRelateMatterList() {
		return this.relateMatterList;
	}
	public void setRelateMatterList(List<OpenApiRelateMatterDTO> relateMatterList) {
		this.relateMatterList = relateMatterList;
	}

	public String getShowBizStatus() {
		return this.showBizStatus;
	}
	public void setShowBizStatus(String showBizStatus) {
		this.showBizStatus = showBizStatus;
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

}
