package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.approve response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:33:22
 */
public class AlipayCommerceEcCreditApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4367878444254562175L;

	/** 
	 * 结果
成功: SUCCESS
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
