package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChinaMobileOutContractRoot;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.jujibaovoucher.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 17:50:05
 */
public class AlipayMerchantJujibaovoucherVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5249124938133482447L;

	/** 
	 * 移动核销结果出参
	 */
	@ApiField("contract_root")
	private ChinaMobileOutContractRoot contractRoot;

	public void setContractRoot(ChinaMobileOutContractRoot contractRoot) {
		this.contractRoot = contractRoot;
	}
	public ChinaMobileOutContractRoot getContractRoot( ) {
		return this.contractRoot;
	}

}
