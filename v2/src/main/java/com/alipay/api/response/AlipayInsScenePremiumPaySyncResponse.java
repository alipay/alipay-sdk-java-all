package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenPolicyDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.premium.pay.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:05:48
 */
public class AlipayInsScenePremiumPaySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2774226619849592923L;

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
