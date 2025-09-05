package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.merchantremaining.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:49:16
 */
public class AlipayMerchantPayforprivilegeMerchantremainingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1898843983332629926L;

	/** 
	 * 消费者未使用的权益金部分
	 */
	@ApiField("unused_benefit")
	private String unusedBenefit;

	/** 
	 * 消费者尚未使用的本金部分
	 */
	@ApiField("unused_principal")
	private String unusedPrincipal;

	/** 
	 * 消费者已使用的权益金部分
	 */
	@ApiField("used_benefit")
	private String usedBenefit;

	/** 
	 * 消费者已使用的本金部分
	 */
	@ApiField("used_principal")
	private String usedPrincipal;

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

	public void setUsedBenefit(String usedBenefit) {
		this.usedBenefit = usedBenefit;
	}
	public String getUsedBenefit( ) {
		return this.usedBenefit;
	}

	public void setUsedPrincipal(String usedPrincipal) {
		this.usedPrincipal = usedPrincipal;
	}
	public String getUsedPrincipal( ) {
		return this.usedPrincipal;
	}

}
