package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduCheckInRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-18 17:17:30
 */
public class AlipayCommerceEducateCheckinRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1384395284474326885L;

	/** 
	 * 签到规则详情
	 */
	@ApiField("rule_info")
	private EduCheckInRule ruleInfo;

	public void setRuleInfo(EduCheckInRule ruleInfo) {
		this.ruleInfo = ruleInfo;
	}
	public EduCheckInRule getRuleInfo( ) {
		return this.ruleInfo;
	}

}
