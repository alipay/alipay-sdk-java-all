package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProfileRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sn.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-28 19:15:52
 */
public class AlipayCommerceIotSnRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3662215633231337694L;

	/** 
	 * profile规则列表
	 */
	@ApiListField("rule_list")
	@ApiField("profile_rule_info")
	private List<ProfileRuleInfo> ruleList;

	public void setRuleList(List<ProfileRuleInfo> ruleList) {
		this.ruleList = ruleList;
	}
	public List<ProfileRuleInfo> getRuleList( ) {
		return this.ruleList;
	}

}
