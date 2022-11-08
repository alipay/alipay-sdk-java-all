package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险开放平台推荐结果模型
 *
 * @author auto create
 * @since 1.0, 2022-08-30 21:10:45
 */
public class PurchaseRecommResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6632265139461136688L;

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
	 * 产品编码，标识某一类产品：yfx 运费险,shx 售后险
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

}
