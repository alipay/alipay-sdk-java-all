package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenPurchaseContractInfoDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.runningcontract.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 14:17:26
 */
public class AlipayInsSceneCommonRunningcontractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7122562324632544119L;

	/** 
	 * 订购合约摘要
	 */
	@ApiField("contract_digest")
	private InsOpenPurchaseContractInfoDigestDTO contractDigest;

	public void setContractDigest(InsOpenPurchaseContractInfoDigestDTO contractDigest) {
		this.contractDigest = contractDigest;
	}
	public InsOpenPurchaseContractInfoDigestDTO getContractDigest( ) {
		return this.contractDigest;
	}

}
