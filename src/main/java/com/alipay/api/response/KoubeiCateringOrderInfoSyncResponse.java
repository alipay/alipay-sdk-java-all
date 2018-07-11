package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-29 18:15:00
 */
public class KoubeiCateringOrderInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2829864151677488821L;

	/** 
	 * 是否需要重试，true-需要，false-不需要
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
