package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.bill.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-25 17:32:26
 */
public class AlipayBossFncGfacceptanceBillReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3672989886646183138L;

	/** 
	 * 业财受理结果
	 */
	@ApiField("result")
	private GFAOpenAPIAcceptanceResult result;

	public void setResult(GFAOpenAPIAcceptanceResult result) {
		this.result = result;
	}
	public GFAOpenAPIAcceptanceResult getResult( ) {
		return this.result;
	}

}
