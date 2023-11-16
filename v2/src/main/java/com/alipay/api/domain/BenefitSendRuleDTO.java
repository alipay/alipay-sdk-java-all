package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券发放规则
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:34:23
 */
public class BenefitSendRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 6149331481166554938L;

	/**
	 * 预算
	 */
	@ApiField("budget")
	private BenefitBudgetDTO budget;

	/**
	 * 领取规则限制
	 */
	@ApiListField("collect_limit_rules")
	@ApiField("collect_limit_rule_d_t_o")
	private List<CollectLimitRuleDTO> collectLimitRules;

	public BenefitBudgetDTO getBudget() {
		return this.budget;
	}
	public void setBudget(BenefitBudgetDTO budget) {
		this.budget = budget;
	}

	public List<CollectLimitRuleDTO> getCollectLimitRules() {
		return this.collectLimitRules;
	}
	public void setCollectLimitRules(List<CollectLimitRuleDTO> collectLimitRules) {
		this.collectLimitRules = collectLimitRules;
	}

}
