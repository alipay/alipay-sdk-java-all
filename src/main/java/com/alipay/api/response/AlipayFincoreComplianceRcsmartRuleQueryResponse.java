package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RuleQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcsmart.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-28 10:39:30
 */
public class AlipayFincoreComplianceRcsmartRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3114793362889625899L;

	/** 
	 * 规则查询结果
	 */
	@ApiField("data")
	private RuleQueryResult data;

	public void setData(RuleQueryResult data) {
		this.data = data;
	}
	public RuleQueryResult getData( ) {
		return this.data;
	}

}
