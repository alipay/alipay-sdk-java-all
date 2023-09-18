package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:22:58
 */
public class KoubeiCateringOrderInfoCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8398753827647578548L;

	/** 
	 * 是否需要重试,true-需要重试 ,false-不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
