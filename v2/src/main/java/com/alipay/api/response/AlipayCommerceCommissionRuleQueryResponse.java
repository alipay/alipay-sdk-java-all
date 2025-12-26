package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommissionRuleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.commission.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 14:37:46
 */
public class AlipayCommerceCommissionRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3295715127124872137L;

	/** 
	 * 生效中的抽佣规则
	 */
	@ApiField("active_rule")
	private CommissionRuleDTO activeRule;

	/** 
	 * 待生效的抽佣规则
	 */
	@ApiField("init_rule")
	private CommissionRuleDTO initRule;

	public void setActiveRule(CommissionRuleDTO activeRule) {
		this.activeRule = activeRule;
	}
	public CommissionRuleDTO getActiveRule( ) {
		return this.activeRule;
	}

	public void setInitRule(CommissionRuleDTO initRule) {
		this.initRule = initRule;
	}
	public CommissionRuleDTO getInitRule( ) {
		return this.initRule;
	}

}
