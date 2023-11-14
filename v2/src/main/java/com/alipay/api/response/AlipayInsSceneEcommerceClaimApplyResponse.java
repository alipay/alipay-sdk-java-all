package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenClaimDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.claim.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 20:01:41
 */
public class AlipayInsSceneEcommerceClaimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5834356296744934542L;

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
