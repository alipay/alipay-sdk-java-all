package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.payment.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:50:32
 */
public class AnttechBlockchainDefinSaasPaymentCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5134836422265258295L;

	/** 
	 * 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
