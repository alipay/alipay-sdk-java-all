package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险开放平台保障方案
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:42:34
 */
public class PurchaseInsurePlanDTO extends AlipayObject {

	private static final long serialVersionUID = 2213814425534287113L;

	/**
	 * 是否当时选定的方案,查看或编辑订购时有效
	 */
	@ApiField("current_selected")
	private Boolean currentSelected;

	/**
	 * 保障期限
	 */
	@ApiField("ins_period")
	private InsPeriodDTO insPeriod;

	/**
	 * 保障方案名称
	 */
	@ApiField("insure_plan_name")
	private String insurePlanName;

	/**
	 * 折扣前原参考保费
	 */
	@ApiField("original_refer_premium")
	private Long originalReferPremium;

	/**
	 * 参考价格
	 */
	@ApiField("per_refer_premium")
	private Long perReferPremium;

	/**
	 * 参考保额
	 */
	@ApiField("per_refer_sum_insured")
	private Long perReferSumInsured;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 报价id
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 是否推荐
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 参考折扣率
	 */
	@ApiField("refer_discount_rate")
	private String referDiscountRate;

	/**
	 * 参考保费费率
	 */
	@ApiField("refer_premium_rate")
	private String referPremiumRate;

	public Boolean getCurrentSelected() {
		return this.currentSelected;
	}
	public void setCurrentSelected(Boolean currentSelected) {
		this.currentSelected = currentSelected;
	}

	public InsPeriodDTO getInsPeriod() {
		return this.insPeriod;
	}
	public void setInsPeriod(InsPeriodDTO insPeriod) {
		this.insPeriod = insPeriod;
	}

	public String getInsurePlanName() {
		return this.insurePlanName;
	}
	public void setInsurePlanName(String insurePlanName) {
		this.insurePlanName = insurePlanName;
	}

	public Long getOriginalReferPremium() {
		return this.originalReferPremium;
	}
	public void setOriginalReferPremium(Long originalReferPremium) {
		this.originalReferPremium = originalReferPremium;
	}

	public Long getPerReferPremium() {
		return this.perReferPremium;
	}
	public void setPerReferPremium(Long perReferPremium) {
		this.perReferPremium = perReferPremium;
	}

	public Long getPerReferSumInsured() {
		return this.perReferSumInsured;
	}
	public void setPerReferSumInsured(Long perReferSumInsured) {
		this.perReferSumInsured = perReferSumInsured;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public String getReferDiscountRate() {
		return this.referDiscountRate;
	}
	public void setReferDiscountRate(String referDiscountRate) {
		this.referDiscountRate = referDiscountRate;
	}

	public String getReferPremiumRate() {
		return this.referPremiumRate;
	}
	public void setReferPremiumRate(String referPremiumRate) {
		this.referPremiumRate = referPremiumRate;
	}

}
