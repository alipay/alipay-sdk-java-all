package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.policy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:05:24
 */
public class AlipayInsUnderwritePolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6718578817249482255L;

	/** 
	 * 保单
	 */
	@ApiField("policy")
	private InsPolicy policy;

	public void setPolicy(InsPolicy policy) {
		this.policy = policy;
	}
	public InsPolicy getPolicy( ) {
		return this.policy;
	}

}
