package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险投保前推荐结果
 *
 * @author auto create
 * @since 1.0, 2022-08-30 21:10:28
 */
public class InsureRecommResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3526571871619931185L;

	/**
	 * 协议条款
	 */
	@ApiListField("agreement_list")
	@ApiField("ins_agreement_d_t_o")
	private List<InsAgreementDTO> agreementList;

	/**
	 * 保险公司id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 保司图标
	 */
	@ApiField("inst_logo")
	private String instLogo;

	/**
	 * 保险公司名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 保司简称
	 */
	@ApiField("inst_short_name")
	private String instShortName;

	/**
	 * 保障方案列表
	 */
	@ApiListField("insure_plans")
	@ApiField("insure_plan_d_t_o")
	private List<InsurePlanDTO> insurePlans;

	/**
	 * 保费支付方类型:BUYER 买家 ，SELLER卖家
	 */
	@ApiField("premium_payer_type")
	private String premiumPayerType;

	/**
	 * 保险机构产品码
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 产品编码，标识某一类产品:SHX
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
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 推荐流水id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	/**
	 * 是否展示暂不投保选项
	 */
	@ApiField("show_uninsured_option")
	private Boolean showUninsuredOption;

	/**
	 * 保险标准产品码
	 */
	@ApiField("sp_no")
	private String spNo;

	public List<InsAgreementDTO> getAgreementList() {
		return this.agreementList;
	}
	public void setAgreementList(List<InsAgreementDTO> agreementList) {
		this.agreementList = agreementList;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstLogo() {
		return this.instLogo;
	}
	public void setInstLogo(String instLogo) {
		this.instLogo = instLogo;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstShortName() {
		return this.instShortName;
	}
	public void setInstShortName(String instShortName) {
		this.instShortName = instShortName;
	}

	public List<InsurePlanDTO> getInsurePlans() {
		return this.insurePlans;
	}
	public void setInsurePlans(List<InsurePlanDTO> insurePlans) {
		this.insurePlans = insurePlans;
	}

	public String getPremiumPayerType() {
		return this.premiumPayerType;
	}
	public void setPremiumPayerType(String premiumPayerType) {
		this.premiumPayerType = premiumPayerType;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
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

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

	public Boolean getShowUninsuredOption() {
		return this.showUninsuredOption;
	}
	public void setShowUninsuredOption(Boolean showUninsuredOption) {
		this.showUninsuredOption = showUninsuredOption;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

}
