package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.bill.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-16 18:16:51
 */
public class AlipayBossFncGfacceptanceBillReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4654374459888934326L;

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
