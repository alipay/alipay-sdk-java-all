package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.withdraw.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 15:17:03
 */
public class AlipayCommerceEcCreditWithdrawDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7563884186983434297L;

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
