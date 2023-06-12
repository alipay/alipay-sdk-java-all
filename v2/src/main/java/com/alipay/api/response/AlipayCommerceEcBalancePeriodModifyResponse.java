package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.period.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:16:52
 */
public class AlipayCommerceEcBalancePeriodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2153339288516364815L;

	/** 
	 * 修改结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
