package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用服务风控配置
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:02
 */
public class RiskApiConfig extends AlipayObject {

	private static final long serialVersionUID = 7456835256611957485L;

	/**
	 * 类目风控信息列表，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiListField("category_risks")
	@ApiField("category_risk_info_api_config")
	private List<CategoryRiskInfoApiConfig> categoryRisks;

	/**
	 * 全局分段限额配置
	 */
	@ApiField("quota_gradient_rule")
	private QuotaGradientRuleApiConfig quotaGradientRule;

	public List<CategoryRiskInfoApiConfig> getCategoryRisks() {
		return this.categoryRisks;
	}
	public void setCategoryRisks(List<CategoryRiskInfoApiConfig> categoryRisks) {
		this.categoryRisks = categoryRisks;
	}

	public QuotaGradientRuleApiConfig getQuotaGradientRule() {
		return this.quotaGradientRule;
	}
	public void setQuotaGradientRule(QuotaGradientRuleApiConfig quotaGradientRule) {
		this.quotaGradientRule = quotaGradientRule;
	}

}
