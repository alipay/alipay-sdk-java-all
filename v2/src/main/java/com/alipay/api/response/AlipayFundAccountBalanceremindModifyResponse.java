package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.balanceremind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 16:02:05
 */
public class AlipayFundAccountBalanceremindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2242763833944972993L;

	/** 
	 * 计划版本
	 */
	@ApiField("plan_version")
	private String planVersion;

	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}
	public String getPlanVersion( ) {
		return this.planVersion;
	}

}
