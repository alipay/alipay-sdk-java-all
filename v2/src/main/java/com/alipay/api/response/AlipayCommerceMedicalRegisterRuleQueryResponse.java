package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RuleCheckResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 11:52:50
 */
public class AlipayCommerceMedicalRegisterRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7595556378336956456L;

	/** 
	 * true：命中规则
false：未命中规则
	 */
	@ApiField("hit")
	private Boolean hit;

	/** 
	 * null
	 */
	@ApiListField("rule_check_res_list")
	@ApiField("rule_check_result")
	private List<RuleCheckResult> ruleCheckResList;

	public void setHit(Boolean hit) {
		this.hit = hit;
	}
	public Boolean getHit( ) {
		return this.hit;
	}

	public void setRuleCheckResList(List<RuleCheckResult> ruleCheckResList) {
		this.ruleCheckResList = ruleCheckResList;
	}
	public List<RuleCheckResult> getRuleCheckResList( ) {
		return this.ruleCheckResList;
	}

}
