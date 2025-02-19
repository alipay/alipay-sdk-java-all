package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.payafteruse.task.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-19 16:27:25
 */
public class ZhimaCreditPePayafteruseTaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1686764453374792553L;

	/** 
	 * 更新是否被幂等处理
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

}
