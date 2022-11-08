package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商场景开放平台报价信息模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:42:42
 */
public class InsQuoteDTO extends AlipayObject {

	private static final long serialVersionUID = 1291683698983275871L;

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
	 * 保司id
	 */
	@ApiField("inst_id")
	private String instId;

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
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

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
	 * 报价id
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 推荐流水ids
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

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

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
