package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.bill.accept response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-26 16:22:19
 */
public class AlipayBossFncGfacceptanceBillAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 6823138935145131456L;

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
