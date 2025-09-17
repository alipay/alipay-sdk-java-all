package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一步完成签约
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:20
 */
public class AlipayBossProdContractOnestepsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6421995595158237697L;

	/**
	 * 合同金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 金额类型（ESTIMATE：预估；NONE：无金额；DEFINE：固定）
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * 倒签流水号
	 */
	@ApiField("ante_dated_voucher_id")
	private String anteDatedVoucherId;

	/**
	 * 申请人
	 */
	@ApiField("apply_people")
	private ContractPeople applyPeople;

	/**
	 * 审批示例唯一值
	 */
	@ApiField("approve_instant_id")
	private String approveInstantId;

	/**
	 * 自动续约周期单位（只有当InEffectType = AUTO_RENEW时需要；取值：YEAR:年；MONTH:月；DAY:日）
	 */
	@ApiField("auto_renew_period")
	private String autoRenewPeriod;

	/**
	 * 请求id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 业务线
	 */
	@ApiField("business_line")
	private String businessLine;

	/**
	 * 背景描述
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 合同附件文件(允许多个)
	 */
	@ApiListField("contract_attaches")
	@ApiField("contract_attach")
	private List<ContractAttach> contractAttaches;

	/**
	 * 合同中心生成的合同编号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同正文文件(只能有一个)
	 */
	@ApiField("contract_doc")
	private ContractAttach contractDoc;

	/**
	 * 合同有效时长
	 */
	@ApiField("contract_duration")
	private String contractDuration;

	/**
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 签约方式（PHY_SEAL：实体章）
	 */
	@ApiField("contract_sign_type")
	private String contractSignType;

	/**
	 * 合同币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 实体章我方先用印的交件方式（PRINT：用印法务直接打印（无需交件)；DELIVERY：使用对方纸质版本用印（需现场交件））
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 合同有效时长单位(YEAR:年；MONTH:月；DAY:日)
	 */
	@ApiField("duration_unit")
	private String durationUnit;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 合同生效方式（AFTER_SEAL：盖章后生效；FIX_DATE：约定开始时间）
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 扩展信息【详见扩展字段】
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 五级合同类型
	 */
	@ApiField("fifth_contract_type")
	private String fifthContractType;

	/**
	 * 一级合同类型：置业固定值-non_standard
	 */
	@ApiField("first_contract_type")
	private String firstContractType;

	/**
	 * 四级合同类型
	 */
	@ApiField("fourth_contract_type")
	private String fourthContractType;

	/**
	 * 实体章交还类型。纸质用印必填（INTERNAL_SEVEN_DAYS：国内7天；INTERNATIONAL_FOURTEEN_DAYS：国外14天）
	 */
	@ApiField("give_back_type")
	private String giveBackType;

	/**
	 * 负责人
	 */
	@ApiListField("in_charge_people")
	@ApiField("contract_people")
	private List<ContractPeople> inChargePeople;

	/**
	 * 合同失效方式（FIX_DATE：约定终止时间；EFFECT_FOREVER：长期有效；TERMINATE_BY_PERFORMANCE_END：履行完结终止；AUTO_RENEW：自动续约）
	 */
	@ApiField("in_effect_type")
	private String inEffectType;

	/**
	 * 开票方（PURCHASE：采购方开票；SALE：销售方开票；NONE：不开票）
	 */
	@ApiField("invoice_target")
	private String invoiceTarget;

	/**
	 * 发票类型（NONE：无票；SPECIAL_TICKET：专票；GENERAL_TICKET：普票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 法务，可以多个
	 */
	@ApiListField("legal_people")
	@ApiField("contract_people")
	private List<ContractPeople> legalPeople;

	/**
	 * 合同份数
	 */
	@ApiField("number")
	private String number;

	/**
	 * 合同我方公司
	 */
	@ApiListField("part_a")
	@ApiField("partner")
	private List<Partner> partA;

	/**
	 * 合同对方公司
	 */
	@ApiListField("part_b")
	@ApiField("partner")
	private List<Partner> partB;

	/**
	 * 付款方（PARTA：我方；PARTB：对方）
	 */
	@ApiField("payer")
	private String payer;

	/**
	 * 如果signType = SignType.PHY_SEAL时候填写
实体章类型（CONTRACT_SEAL：合同章；PUB_SEAL：公章）
	 */
	@ApiField("phy_seal_type")
	private String phySealType;

	/**
	 * 实体章用印备注
	 */
	@ApiField("remarks_on_printing")
	private String remarksOnPrinting;

	/**
	 * 如果signType = SignType.P
phySealTypeHY_SEAL时候填写
用印顺序（FROM_PARTA：我方先用印；FROM_PARTB：对方先用印）
	 */
	@ApiField("seal_order")
	private String sealOrder;

	/**
	 * 二级合同类型
	 */
	@ApiField("second_contract_type")
	private String secondContractType;

	/**
	 * 签约参数
	 */
	@ApiListField("sign_params")
	@ApiField("seal_display_request")
	private List<SealDisplayRequest> signParams;

	/**
	 * 六级合同类型
	 */
	@ApiField("sixth_contract_type")
	private String sixthContractType;

	/**
	 * 当前系统的名称
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 税率,0-100
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 三级合同类型
	 */
	@ApiField("third_contract_type")
	private String thirdContractType;

	/**
	 * 签约类型(CONTRACT：合同；FILE：文件)
	 */
	@ApiField("type")
	private String type;

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

	public String getAnteDatedVoucherId() {
		return this.anteDatedVoucherId;
	}
	public void setAnteDatedVoucherId(String anteDatedVoucherId) {
		this.anteDatedVoucherId = anteDatedVoucherId;
	}

	public ContractPeople getApplyPeople() {
		return this.applyPeople;
	}
	public void setApplyPeople(ContractPeople applyPeople) {
		this.applyPeople = applyPeople;
	}

	public String getApproveInstantId() {
		return this.approveInstantId;
	}
	public void setApproveInstantId(String approveInstantId) {
		this.approveInstantId = approveInstantId;
	}

	public String getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}
	public void setAutoRenewPeriod(String autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
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

	public List<ContractAttach> getContractAttaches() {
		return this.contractAttaches;
	}
	public void setContractAttaches(List<ContractAttach> contractAttaches) {
		this.contractAttaches = contractAttaches;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public ContractAttach getContractDoc() {
		return this.contractDoc;
	}
	public void setContractDoc(ContractAttach contractDoc) {
		this.contractDoc = contractDoc;
	}

	public String getContractDuration() {
		return this.contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractSignType() {
		return this.contractSignType;
	}
	public void setContractSignType(String contractSignType) {
		this.contractSignType = contractSignType;
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

	public String getDurationUnit() {
		return this.durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFifthContractType() {
		return this.fifthContractType;
	}
	public void setFifthContractType(String fifthContractType) {
		this.fifthContractType = fifthContractType;
	}

	public String getFirstContractType() {
		return this.firstContractType;
	}
	public void setFirstContractType(String firstContractType) {
		this.firstContractType = firstContractType;
	}

	public String getFourthContractType() {
		return this.fourthContractType;
	}
	public void setFourthContractType(String fourthContractType) {
		this.fourthContractType = fourthContractType;
	}

	public String getGiveBackType() {
		return this.giveBackType;
	}
	public void setGiveBackType(String giveBackType) {
		this.giveBackType = giveBackType;
	}

	public List<ContractPeople> getInChargePeople() {
		return this.inChargePeople;
	}
	public void setInChargePeople(List<ContractPeople> inChargePeople) {
		this.inChargePeople = inChargePeople;
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

	public List<ContractPeople> getLegalPeople() {
		return this.legalPeople;
	}
	public void setLegalPeople(List<ContractPeople> legalPeople) {
		this.legalPeople = legalPeople;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public List<Partner> getPartA() {
		return this.partA;
	}
	public void setPartA(List<Partner> partA) {
		this.partA = partA;
	}

	public List<Partner> getPartB() {
		return this.partB;
	}
	public void setPartB(List<Partner> partB) {
		this.partB = partB;
	}

	public String getPayer() {
		return this.payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPhySealType() {
		return this.phySealType;
	}
	public void setPhySealType(String phySealType) {
		this.phySealType = phySealType;
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

	public List<SealDisplayRequest> getSignParams() {
		return this.signParams;
	}
	public void setSignParams(List<SealDisplayRequest> signParams) {
		this.signParams = signParams;
	}

	public String getSixthContractType() {
		return this.sixthContractType;
	}
	public void setSixthContractType(String sixthContractType) {
		this.sixthContractType = sixthContractType;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getThirdContractType() {
		return this.thirdContractType;
	}
	public void setThirdContractType(String thirdContractType) {
		this.thirdContractType = thirdContractType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
