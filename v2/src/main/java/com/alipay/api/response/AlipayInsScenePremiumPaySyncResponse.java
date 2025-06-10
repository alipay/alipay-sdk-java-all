package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenPolicyDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.premium.pay.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-20 11:21:59
 */
public class AlipayInsScenePremiumPaySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665142758546374775L;

	/** 
	 * 保单摘要
	 */
	@ApiField("policy_digest")
	private InsOpenPolicyDigestDTO policyDigest;

	public void setPolicyDigest(InsOpenPolicyDigestDTO policyDigest) {
		this.policyDigest = policyDigest;
	}
	public InsOpenPolicyDigestDTO getPolicyDigest( ) {
		return this.policyDigest;
	}

}
