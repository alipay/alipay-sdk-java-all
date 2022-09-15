package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用服务风控配置
 *
 * @author auto create
 * @since 1.0, 2019-11-15 09:39:40
 */
public class RiskConfig extends AlipayObject {

	private static final long serialVersionUID = 2652934735621252669L;

	/**
	 * 类目风控信息列表，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiListField("category_risks")
	@ApiField("category_risk_info")
	private List<CategoryRiskInfo> categoryRisks;

	/**
	 * 全局分段限额配置
	 */
	@ApiField("quota_gradient_rule")
	private QuotaGradientRule quotaGradientRule;

	public List<CategoryRiskInfo> getCategoryRisks() {
		return this.categoryRisks;
	}
	public void setCategoryRisks(List<CategoryRiskInfo> categoryRisks) {
		this.categoryRisks = categoryRisks;
	}

	public QuotaGradientRule getQuotaGradientRule() {
		return this.quotaGradientRule;
	}
	public void setQuotaGradientRule(QuotaGradientRule quotaGradientRule) {
		this.quotaGradientRule = quotaGradientRule;
	}

}
