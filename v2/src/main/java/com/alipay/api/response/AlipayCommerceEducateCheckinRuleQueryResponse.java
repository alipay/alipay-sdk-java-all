package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduCheckInRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 14:17:57
 */
public class AlipayCommerceEducateCheckinRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1738998773565195845L;

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
