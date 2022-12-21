package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.virtualcategory.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:45:50
 */
public class KoubeiCateringDishVirtualcategoryDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8418232917259564987L;

	/** 
	 * 是否重试，true：需要重试；false：不需要重试
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
