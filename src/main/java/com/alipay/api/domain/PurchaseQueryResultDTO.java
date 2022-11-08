package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订购查询及报价结果
 *
 * @author auto create
 * @since 1.0, 2022-08-29 20:48:02
 */
public class PurchaseQueryResultDTO extends AlipayObject {

	private static final long serialVersionUID = 2796313256522417212L;

	/**
	 * 协议条款
	 */
	@ApiListField("agreement_list")
	@ApiField("ins_agreement_d_t_o")
	private List<InsAgreementDTO> agreementList;

	/**
	 * 开始生效时间，限时订购时有效
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 结束时间，限时订购时有效
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 保险公司id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 保险公司名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 保障方案列表
	 */
	@ApiListField("insure_plans")
	@ApiField("purchase_insure_plan_d_t_o")
	private List<PurchaseInsurePlanDTO> insurePlans;

	/**
	 * 已出单量,按量订购时有效
	 */
	@ApiField("issued_amount")
	private Long issuedAmount;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品编码，标识某一类产品
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品描述
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 产品介绍页url
	 */
	@ApiField("product_info_url")
	private String productInfoUrl;

	/**
	 * 对外产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 订购合约id
	 */
	@ApiField("purchase_contract_id")
	private String purchaseContractId;

	/**
	 * 订购主体id
userId 或 商品id
	 */
	@ApiField("related_subject_id")
	private String relatedSubjectId;

	/**
	 * 订购主体类型
PURCHASE_USER 订购人
ECOM_ITEM  商品
	 */
	@ApiField("related_subject_type")
	private String relatedSubjectType;

	/**
	 * 是否自动续订
	 */
	@ApiField("renew")
	private Boolean renew;

	/**
	 * 续订期限
自动续订时有效
	 */
	@ApiField("renew_period")
	private InsPeriodDTO renewPeriod;

	/**
	 * 是否展示暂不投保选项
	 */
	@ApiField("show_uninsured_option")
	private Boolean showUninsuredOption;

	/**
	 * 订购状态
生效  VALID
失效 INVALID
订购失败 FAIL
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订购数量，按量订购时有效
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public List<InsAgreementDTO> getAgreementList() {
		return this.agreementList;
	}
	public void setAgreementList(List<InsAgreementDTO> agreementList) {
		this.agreementList = agreementList;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public List<PurchaseInsurePlanDTO> getInsurePlans() {
		return this.insurePlans;
	}
	public void setInsurePlans(List<PurchaseInsurePlanDTO> insurePlans) {
		this.insurePlans = insurePlans;
	}

	public Long getIssuedAmount() {
		return this.issuedAmount;
	}
	public void setIssuedAmount(Long issuedAmount) {
		this.issuedAmount = issuedAmount;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductInfoUrl() {
		return this.productInfoUrl;
	}
	public void setProductInfoUrl(String productInfoUrl) {
		this.productInfoUrl = productInfoUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getPurchaseContractId() {
		return this.purchaseContractId;
	}
	public void setPurchaseContractId(String purchaseContractId) {
		this.purchaseContractId = purchaseContractId;
	}

	public String getRelatedSubjectId() {
		return this.relatedSubjectId;
	}
	public void setRelatedSubjectId(String relatedSubjectId) {
		this.relatedSubjectId = relatedSubjectId;
	}

	public String getRelatedSubjectType() {
		return this.relatedSubjectType;
	}
	public void setRelatedSubjectType(String relatedSubjectType) {
		this.relatedSubjectType = relatedSubjectType;
	}

	public Boolean getRenew() {
		return this.renew;
	}
	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public InsPeriodDTO getRenewPeriod() {
		return this.renewPeriod;
	}
	public void setRenewPeriod(InsPeriodDTO renewPeriod) {
		this.renewPeriod = renewPeriod;
	}

	public Boolean getShowUninsuredOption() {
		return this.showUninsuredOption;
	}
	public void setShowUninsuredOption(Boolean showUninsuredOption) {
		this.showUninsuredOption = showUninsuredOption;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
