package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则id信息
 *
 * @author auto create
 * @since 1.0, 2022-08-17 17:59:19
 */
public class IssueRuleIdInfo extends AlipayObject {

	private static final long serialVersionUID = 7232222699471736265L;

	/**
	 * 发放规则id
	 */
	@ApiField("issue_rule_id")
	private String issueRuleId;

	/**
	 * 外部发放规则id
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	public String getIssueRuleId() {
		return this.issueRuleId;
	}
	public void setIssueRuleId(String issueRuleId) {
		this.issueRuleId = issueRuleId;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

}
