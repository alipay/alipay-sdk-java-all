package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsOpenClaimDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.claim.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 20:41:47
 */
public class AlipayInsSceneEcommerceClaimQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3525759525748394381L;

	/** 
	 * 理赔单摘要
	 */
	@ApiListField("claim_list")
	@ApiField("ins_open_claim_digest_d_t_o")
	private List<InsOpenClaimDigestDTO> claimList;

	public void setClaimList(List<InsOpenClaimDigestDTO> claimList) {
		this.claimList = claimList;
	}
	public List<InsOpenClaimDigestDTO> getClaimList( ) {
		return this.claimList;
	}

}
