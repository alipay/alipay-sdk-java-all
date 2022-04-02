package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.memberremaining.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:56:35
 */
public class AlipayMerchantPayforprivilegeMemberremainingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6633968947168423448L;

	/** 
	 * 余额中未使用的权益金部分
	 */
	@ApiField("unused_benefit")
	private String unusedBenefit;

	/** 
	 * 余额中未使用的本金部分
	 */
	@ApiField("unused_principal")
	private String unusedPrincipal;

	public void setUnusedBenefit(String unusedBenefit) {
		this.unusedBenefit = unusedBenefit;
	}
	public String getUnusedBenefit( ) {
		return this.unusedBenefit;
	}

	public void setUnusedPrincipal(String unusedPrincipal) {
		this.unusedPrincipal = unusedPrincipal;
	}
	public String getUnusedPrincipal( ) {
		return this.unusedPrincipal;
	}

}
