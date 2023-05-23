package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.period.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 14:47:03
 */
public class AlipayCommerceEcBalancePeriodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7598514177886465544L;

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
