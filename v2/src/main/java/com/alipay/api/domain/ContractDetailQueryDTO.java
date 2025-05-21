package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合同详情
 *
 * @author auto create
 * @since 1.0, 2022-12-21 18:41:08
 */
public class ContractDetailQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 6256596889479677462L;

	/**
	 * 合同金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 金额类型
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * 合同申请通过时间
	 */
	@ApiField("apply_end_time")
	private String applyEndTime;

	/**
	 * 申请人员信息
	 */
	@ApiField("apply_people")
	private OpenApiPeopleDTO applyPeople;

	/**
	 * 合同申请时间
	 */
	@ApiField("apply_start_time")
	private String applyStartTime;

	/**
	 * 审批操作记录信息
	 */
	@ApiListField("approve_node_info_list")
	@ApiField("approve_node_page_group_d_t_o")
	private List<ApproveNodePageGroupDTO> approveNodeInfoList;

	/**
	 * 自动续约周期
	 */
	@ApiField("auto_renew_period")
	private Long autoRenewPeriod;

	/**
	 * 自动续约周期单位
	 */
	@ApiField("auto_renew_period_unit")
	private String autoRenewPeriodUnit;

	/**
	 * 业务状态
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
	 * 区块链签约时用印顺序
	 */
	@ApiField("chain_sign_order")
	private String chainSignOrder;

	/**
	 * 合同描述
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 合同附件
	 */
	@ApiListField("contract_attach_list")
	@ApiField("contract_open_api_attach_d_t_o")
	private List<ContractOpenApiAttachDTO> contractAttachList;

	/**
	 * 合同编号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同创建时间-业务时间
	 */
	@ApiField("contract_create_time")
	private Date contractCreateTime;

	/**
	 * 合同正本
	 */
	@ApiField("contract_doc")
	private ContractOpenApiAttachDTO contractDoc;

	/**
	 * 合同有效时长
	 */
	@ApiField("contract_duration")
	private String contractDuration;

	/**
	 * 合同有效时长单位
	 */
	@ApiField("contract_duration_unit")
	private String contractDurationUnit;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 商业关系，我方（甲方）
	 */
	@ApiListField("contract_partner_a_list")
	@ApiField("open_api_partner_d_t_o")
	private List<OpenApiPartnerDTO> contractPartnerAList;

	/**
	 * 商业关系，对方（乙方）
	 */
	@ApiListField("contract_partner_b_list")
	@ApiField("open_api_partner_d_t_o")
	private List<OpenApiPartnerDTO> contractPartnerBList;

	/**
	 * 签约类型
	 */
	@ApiField("contract_sign_type")
	private String contractSignType;

	/**
	 * 合同模板ID
	 */
	@ApiField("contract_tempalte_code")
	private String contractTempalteCode;

	/**
	 * 区块链签约参与人
	 */
	@ApiField("corp_entity_list")
	private String corpEntityList;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 我方先用印交件方式
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 合同生效时间
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 生效方式
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 合同失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 一级合同类型
	 */
	@ApiField("first_contract_type")
	private String firstContractType;

	/**
	 * 合同交还类型，纸质用印必填
	 */
	@ApiField("give_back_type")
	private String giveBackType;

	/**
	 * 上次更新时间
	 */
	@ApiField("gm_mofified")
	private Date gmMofified;

	/**
	 * 创建时间-系统
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 合同负责人员信息
	 */
	@ApiListField("in_charge_people_list")
	@ApiField("open_api_people_d_t_o")
	private List<OpenApiPeopleDTO> inChargePeopleList;

	/**
	 * 合同失效方式
	 */
	@ApiField("in_effect_type")
	private String inEffectType;

	/**
	 * 开票方
	 */
	@ApiField("invoice_target")
	private String invoiceTarget;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 是否是模板合同
	 */
	@ApiField("is_template")
	private Boolean isTemplate;

	/**
	 * 法务人员信息
	 */
	@ApiListField("legal_peoples")
	@ApiField("open_api_people_d_t_o")
	private List<OpenApiPeopleDTO> legalPeoples;

	/**
	 * 磋商code
	 */
	@ApiField("matter_code")
	private String matterCode;

	/**
	 * OpenApiMatterMemberDTO
	 */
	@ApiListField("matter_member_list")
	@ApiField("open_api_matter_member_d_t_o")
	private List<OpenApiMatterMemberDTO> matterMemberList;

	/**
	 * 合同份数
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 对方关联公司列表
	 */
	@ApiListField("other_relate_company_list")
	@ApiField("open_api_partner_d_t_o")
	private List<OpenApiPartnerDTO> otherRelateCompanyList;

	/**
	 * 我方关联公司列表
	 */
	@ApiListField("our_relate_company_list")
	@ApiField("open_api_partner_d_t_o")
	private List<OpenApiPartnerDTO> ourRelateCompanyList;

	/**
	 * 付款方
	 */
	@ApiField("payer")
	private String payer;

	/**
	 * 支付条款
	 */
	@ApiListField("payment_terms_list")
	@ApiField("open_api_payment_terms_d_t_o")
	private List<OpenApiPaymentTermsDTO> paymentTermsList;

	/**
	 * 实体章用印备注
	 */
	@ApiField("remarks_on_printing")
	private String remarksOnPrinting;

	/**
	 * 纸质用印时的用印顺序
	 */
	@ApiField("seal_order")
	private String sealOrder;

	/**
	 * 二级合同类型
	 */
	@ApiField("second_contract_type")
	private String secondContractType;

	/**
	 * 页面展示的状态
	 */
	@ApiField("show_biz_status")
	private String showBizStatus;

	/**
	 * 签约实例ID
	 */
	@ApiField("sign_instant_id")
	private String signInstantId;

	/**
	 * 来源系统ID
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户信息
	 */
	@ApiField("tanant")
	private String tanant;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountType() {
		return this.amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getApplyEndTime() {
		return this.applyEndTime;
	}
	public void setApplyEndTime(String applyEndTime) {
		this.applyEndTime = applyEndTime;
	}

	public OpenApiPeopleDTO getApplyPeople() {
		return this.applyPeople;
	}
	public void setApplyPeople(OpenApiPeopleDTO applyPeople) {
		this.applyPeople = applyPeople;
	}

	public String getApplyStartTime() {
		return this.applyStartTime;
	}
	public void setApplyStartTime(String applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public List<ApproveNodePageGroupDTO> getApproveNodeInfoList() {
		return this.approveNodeInfoList;
	}
	public void setApproveNodeInfoList(List<ApproveNodePageGroupDTO> approveNodeInfoList) {
		this.approveNodeInfoList = approveNodeInfoList;
	}

	public Long getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}
	public void setAutoRenewPeriod(Long autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
	}

	public String getAutoRenewPeriodUnit() {
		return this.autoRenewPeriodUnit;
	}
	public void setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
		this.autoRenewPeriodUnit = autoRenewPeriodUnit;
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

	public String getChainSignOrder() {
		return this.chainSignOrder;
	}
	public void setChainSignOrder(String chainSignOrder) {
		this.chainSignOrder = chainSignOrder;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<ContractOpenApiAttachDTO> getContractAttachList() {
		return this.contractAttachList;
	}
	public void setContractAttachList(List<ContractOpenApiAttachDTO> contractAttachList) {
		this.contractAttachList = contractAttachList;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public Date getContractCreateTime() {
		return this.contractCreateTime;
	}
	public void setContractCreateTime(Date contractCreateTime) {
		this.contractCreateTime = contractCreateTime;
	}

	public ContractOpenApiAttachDTO getContractDoc() {
		return this.contractDoc;
	}
	public void setContractDoc(ContractOpenApiAttachDTO contractDoc) {
		this.contractDoc = contractDoc;
	}

	public String getContractDuration() {
		return this.contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	public String getContractDurationUnit() {
		return this.contractDurationUnit;
	}
	public void setContractDurationUnit(String contractDurationUnit) {
		this.contractDurationUnit = contractDurationUnit;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public List<OpenApiPartnerDTO> getContractPartnerAList() {
		return this.contractPartnerAList;
	}
	public void setContractPartnerAList(List<OpenApiPartnerDTO> contractPartnerAList) {
		this.contractPartnerAList = contractPartnerAList;
	}

	public List<OpenApiPartnerDTO> getContractPartnerBList() {
		return this.contractPartnerBList;
	}
	public void setContractPartnerBList(List<OpenApiPartnerDTO> contractPartnerBList) {
		this.contractPartnerBList = contractPartnerBList;
	}

	public String getContractSignType() {
		return this.contractSignType;
	}
	public void setContractSignType(String contractSignType) {
		this.contractSignType = contractSignType;
	}

	public String getContractTempalteCode() {
		return this.contractTempalteCode;
	}
	public void setContractTempalteCode(String contractTempalteCode) {
		this.contractTempalteCode = contractTempalteCode;
	}

	public String getCorpEntityList() {
		return this.corpEntityList;
	}
	public void setCorpEntityList(String corpEntityList) {
		this.corpEntityList = corpEntityList;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getFirstContractType() {
		return this.firstContractType;
	}
	public void setFirstContractType(String firstContractType) {
		this.firstContractType = firstContractType;
	}

	public String getGiveBackType() {
		return this.giveBackType;
	}
	public void setGiveBackType(String giveBackType) {
		this.giveBackType = giveBackType;
	}

	public Date getGmMofified() {
		return this.gmMofified;
	}
	public void setGmMofified(Date gmMofified) {
		this.gmMofified = gmMofified;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<OpenApiPeopleDTO> getInChargePeopleList() {
		return this.inChargePeopleList;
	}
	public void setInChargePeopleList(List<OpenApiPeopleDTO> inChargePeopleList) {
		this.inChargePeopleList = inChargePeopleList;
	}

	public String getInEffectType() {
		return this.inEffectType;
	}
	public void setInEffectType(String inEffectType) {
		this.inEffectType = inEffectType;
	}

	public String getInvoiceTarget() {
		return this.invoiceTarget;
	}
	public void setInvoiceTarget(String invoiceTarget) {
		this.invoiceTarget = invoiceTarget;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Boolean getIsTemplate() {
		return this.isTemplate;
	}
	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	public List<OpenApiPeopleDTO> getLegalPeoples() {
		return this.legalPeoples;
	}
	public void setLegalPeoples(List<OpenApiPeopleDTO> legalPeoples) {
		this.legalPeoples = legalPeoples;
	}

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	public List<OpenApiMatterMemberDTO> getMatterMemberList() {
		return this.matterMemberList;
	}
	public void setMatterMemberList(List<OpenApiMatterMemberDTO> matterMemberList) {
		this.matterMemberList = matterMemberList;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public List<OpenApiPartnerDTO> getOtherRelateCompanyList() {
		return this.otherRelateCompanyList;
	}
	public void setOtherRelateCompanyList(List<OpenApiPartnerDTO> otherRelateCompanyList) {
		this.otherRelateCompanyList = otherRelateCompanyList;
	}

	public List<OpenApiPartnerDTO> getOurRelateCompanyList() {
		return this.ourRelateCompanyList;
	}
	public void setOurRelateCompanyList(List<OpenApiPartnerDTO> ourRelateCompanyList) {
		this.ourRelateCompanyList = ourRelateCompanyList;
	}

	public String getPayer() {
		return this.payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}

	public List<OpenApiPaymentTermsDTO> getPaymentTermsList() {
		return this.paymentTermsList;
	}
	public void setPaymentTermsList(List<OpenApiPaymentTermsDTO> paymentTermsList) {
		this.paymentTermsList = paymentTermsList;
	}

	public String getRemarksOnPrinting() {
		return this.remarksOnPrinting;
	}
	public void setRemarksOnPrinting(String remarksOnPrinting) {
		this.remarksOnPrinting = remarksOnPrinting;
	}

	public String getSealOrder() {
		return this.sealOrder;
	}
	public void setSealOrder(String sealOrder) {
		this.sealOrder = sealOrder;
	}

	public String getSecondContractType() {
		return this.secondContractType;
	}
	public void setSecondContractType(String secondContractType) {
		this.secondContractType = secondContractType;
	}

	public String getShowBizStatus() {
		return this.showBizStatus;
	}
	public void setShowBizStatus(String showBizStatus) {
		this.showBizStatus = showBizStatus;
	}

	public String getSignInstantId() {
		return this.signInstantId;
	}
	public void setSignInstantId(String signInstantId) {
		this.signInstantId = signInstantId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTanant() {
		return this.tanant;
	}
	public void setTanant(String tanant) {
		this.tanant = tanant;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

}
