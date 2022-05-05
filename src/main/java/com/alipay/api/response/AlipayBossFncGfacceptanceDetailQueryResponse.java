package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIDetailQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-16 18:17:31
 */
public class AlipayBossFncGfacceptanceDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7679424162391849264L;

	/** 
	 * 业财受理详情查询结果
	 */
	@ApiField("result")
	private GFAOpenAPIDetailQueryResult result;

	public void setResult(GFAOpenAPIDetailQueryResult result) {
		this.result = result;
	}
	public GFAOpenAPIDetailQueryResult getResult( ) {
		return this.result;
	}

}
