package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.distribution.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:26:43
 */
public class AnttechBlockchainFinanceDistributionRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6523549984425116445L;

	/** 
	 * 收益分配规则Id
	 */
	@ApiField("distribution_rule_id")
	private String distributionRuleId;

	/** 
	 * 规则状态:
ACTIVE - 规则生效;
INACTIVE - 规则未生效
	 */
	@ApiField("status")
	private String status;

	public void setDistributionRuleId(String distributionRuleId) {
		this.distributionRuleId = distributionRuleId;
	}
	public String getDistributionRuleId( ) {
		return this.distributionRuleId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
