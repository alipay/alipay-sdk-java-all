package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对话审核结果
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class DialogueAuditResult extends AlipayObject {

	private static final long serialVersionUID = 8512934693248971927L;

	/**
	 * 解语花内部对审核工单的唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 规则匹配信息
	 */
	@ApiListField("rule_hit_results")
	@ApiField("rule_hit_result")
	private List<RuleHitResult> ruleHitResults;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleHitResult> getRuleHitResults() {
		return this.ruleHitResults;
	}
	public void setRuleHitResults(List<RuleHitResult> ruleHitResults) {
		this.ruleHitResults = ruleHitResults;
	}

}
