package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用服务风控配置
 *
 * @author auto create
 * @since 1.0, 2024-10-23 14:56:52
 */
public class RiskApiConfig extends AlipayObject {

	private static final long serialVersionUID = 4336982636684139651L;

	/**
	 * 类目风控信息列表，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiListField("category_risks")
	@ApiField("category_risk_info_api_config")
	private List<CategoryRiskInfoApiConfig> categoryRisks;

	/**
	 * 押金类型，用于查询接口，创建和修改不用传入
	 */
	@ApiField("deposit_type")
	private String depositType;

	/**
	 * 多评估方案的唯一id，创建时不用传入，修改时可传入，传入时为修改此评估方案
	 */
	@ApiField("evaluation_id")
	private String evaluationId;

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

	public String getDepositType() {
		return this.depositType;
	}
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public String getEvaluationId() {
		return this.evaluationId;
	}
	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public QuotaGradientRuleApiConfig getQuotaGradientRule() {
		return this.quotaGradientRule;
	}
	public void setQuotaGradientRule(QuotaGradientRuleApiConfig quotaGradientRule) {
		this.quotaGradientRule = quotaGradientRule;
	}

}
