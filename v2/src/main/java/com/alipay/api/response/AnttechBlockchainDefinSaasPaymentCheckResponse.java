package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.payment.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:55:10
 */
public class AnttechBlockchainDefinSaasPaymentCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4253371259666574587L;

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
