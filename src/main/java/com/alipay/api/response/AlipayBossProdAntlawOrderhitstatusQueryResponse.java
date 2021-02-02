package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlaw.orderhitstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-04 15:24:41
 */
public class AlipayBossProdAntlawOrderhitstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6422126356121387597L;

	/** 
	 * 是否存在有效的纸质用印, true表示存在, false表示不存在
	 */
	@ApiField("hit_result")
	private Boolean hitResult;

	public void setHitResult(Boolean hitResult) {
		this.hitResult = hitResult;
	}
	public Boolean getHitResult( ) {
		return this.hitResult;
	}

}
