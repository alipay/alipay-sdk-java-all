package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ClaimResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.claimreport.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 19:52:48
 */
public class AlipayCommerceMedicalInsuranceClaimreportVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4278893693134287623L;

	/** 
	 * null
	 */
	@ApiListField("claim_result_list")
	@ApiField("claim_result")
	private List<ClaimResult> claimResultList;

	/** 
	 * 密钥，加密时使用
	 */
	@ApiField("secret_key")
	private String secretKey;

	public void setClaimResultList(List<ClaimResult> claimResultList) {
		this.claimResultList = claimResultList;
	}
	public List<ClaimResult> getClaimResultList( ) {
		return this.claimResultList;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getSecretKey( ) {
		return this.secretKey;
	}

}
