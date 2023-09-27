package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.removedish.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:48:49
 */
public class KoubeiCateringDishRemovedishDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432844266698947695L;

	/** 
	 * 失败是否需要重试，true：需要重试；false：不需要重试。
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
