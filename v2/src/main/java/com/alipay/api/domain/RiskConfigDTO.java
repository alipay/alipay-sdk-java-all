package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用服务风控配置
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:44
 */
public class RiskConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 6324113394784996325L;

	/**
	 * 类目风控信息列表
	 */
	@ApiListField("category_risks")
	@ApiField("category_risk_d_t_o")
	private List<CategoryRiskDTO> categoryRisks;

	/**
	 * 全局分段限额配置
	 */
	@ApiField("quota_gradient_rule")
	private QuotaGradientRuleDTO quotaGradientRule;

	public List<CategoryRiskDTO> getCategoryRisks() {
		return this.categoryRisks;
	}
	public void setCategoryRisks(List<CategoryRiskDTO> categoryRisks) {
		this.categoryRisks = categoryRisks;
	}

	public QuotaGradientRuleDTO getQuotaGradientRule() {
		return this.quotaGradientRule;
	}
	public void setQuotaGradientRule(QuotaGradientRuleDTO quotaGradientRule) {
		this.quotaGradientRule = quotaGradientRule;
	}

}
