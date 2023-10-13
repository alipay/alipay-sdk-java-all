package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIDetailQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:06:54
 */
public class AlipayBossFncGfacceptanceDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182366772195842954L;

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
