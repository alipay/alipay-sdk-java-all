package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.withdraw.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 21:07:04
 */
public class AlipayCommerceEcCreditWithdrawDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3646479572267592315L;

	/** 
	 * 成功: SUCCESS
失败: FAIL
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
