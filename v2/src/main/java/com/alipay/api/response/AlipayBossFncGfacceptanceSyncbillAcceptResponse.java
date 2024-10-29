package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.syncbill.accept response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-07 17:32:06
 */
public class AlipayBossFncGfacceptanceSyncbillAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 3596767425787532353L;

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
