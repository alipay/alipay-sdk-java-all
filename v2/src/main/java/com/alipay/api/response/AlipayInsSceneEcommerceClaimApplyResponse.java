package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenClaimDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.claim.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 19:57:04
 */
public class AlipayInsSceneEcommerceClaimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8775688452329783394L;

	/** 
	 * 理赔单摘要
	 */
	@ApiField("claim_digest")
	private InsOpenClaimDigestDTO claimDigest;

	public void setClaimDigest(InsOpenClaimDigestDTO claimDigest) {
		this.claimDigest = claimDigest;
	}
	public InsOpenClaimDigestDTO getClaimDigest( ) {
		return this.claimDigest;
	}

}
