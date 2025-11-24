package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.balanceremind.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:57:37
 */
public class AlipayFundAccountBalanceremindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5433561422621627969L;

	/** 
	 * 创建的计划在支付宝域内的id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 计划的版本号，每次修改会递增
	 */
	@ApiField("plan_version")
	private String planVersion;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}
	public String getPlanVersion( ) {
		return this.planVersion;
	}

}
