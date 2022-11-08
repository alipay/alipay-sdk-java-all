package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单投保保险方案
 *
 * @author auto create
 * @since 1.0, 2022-08-29 10:38:59
 */
public class InsurePlanDTO extends AlipayObject {

	private static final long serialVersionUID = 1389645634741162153L;

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
	 * 折扣前原保费，单位元，两位小数
	 */
	@ApiField("original_premium_yuan")
	private String originalPremiumYuan;

	/**
	 * 保费，单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保费费率
	 */
	@ApiField("premium_rate")
	private String premiumRate;

	/**
	 * 保费，单位元，两位小数
	 */
	@ApiField("premium_yuan")
	private String premiumYuan;

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
	 * 保额，单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 保额，单位元，两位小数
	 */
	@ApiField("sum_insured_yuan")
	private String sumInsuredYuan;

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

	public String getOriginalPremiumYuan() {
		return this.originalPremiumYuan;
	}
	public void setOriginalPremiumYuan(String originalPremiumYuan) {
		this.originalPremiumYuan = originalPremiumYuan;
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

	public String getPremiumYuan() {
		return this.premiumYuan;
	}
	public void setPremiumYuan(String premiumYuan) {
		this.premiumYuan = premiumYuan;
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

	public String getSumInsuredYuan() {
		return this.sumInsuredYuan;
	}
	public void setSumInsuredYuan(String sumInsuredYuan) {
		this.sumInsuredYuan = sumInsuredYuan;
	}

}
