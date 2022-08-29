package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单投保保险方案
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:42:50
 */
public class InsurePlanDTO extends AlipayObject {

	private static final long serialVersionUID = 5444468692922469794L;

	/**
	 * 折扣率
	 */
	@ApiField("discount_rate")
	private String discountRate;

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
	 * 折扣前原保费
	 */
	@ApiField("original_premium")
	private Long originalPremium;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保费费率
	 */
	@ApiField("premium_rate")
	private String premiumRate;

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
	 * 保额
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
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

	public Long getOriginalPremium() {
		return this.originalPremium;
	}
	public void setOriginalPremium(Long originalPremium) {
		this.originalPremium = originalPremium;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getPremiumRate() {
		return this.premiumRate;
	}
	public void setPremiumRate(String premiumRate) {
		this.premiumRate = premiumRate;
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

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
