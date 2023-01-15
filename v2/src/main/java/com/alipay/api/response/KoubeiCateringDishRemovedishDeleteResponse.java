package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.removedish.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:48:18
 */
public class KoubeiCateringDishRemovedishDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685873918753195836L;

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
