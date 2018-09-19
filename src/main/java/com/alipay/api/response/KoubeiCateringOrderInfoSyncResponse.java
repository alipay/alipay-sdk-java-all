package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-18 16:34:15
 */
public class KoubeiCateringOrderInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154176869632471289L;

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
