package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlaw.orderhitstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:15:21
 */
public class AlipayBossProdAntlawOrderhitstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6457463388159499868L;

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
