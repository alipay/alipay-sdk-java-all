package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaControlRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:41:43
 */
public class AlipayCloudCloudbaseQuotacontrolRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2382218417438765428L;

	/** 
	 * 额度防控规则列表
	 */
	@ApiListField("rules")
	@ApiField("quota_control_rule")
	private List<QuotaControlRule> rules;

	public void setRules(List<QuotaControlRule> rules) {
		this.rules = rules;
	}
	public List<QuotaControlRule> getRules( ) {
		return this.rules;
	}

}
