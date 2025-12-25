package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubscribeStatusApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.subscribe.status.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 10:07:37
 */
public class AlipayAipaySubscribeStatusCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2746198589966923182L;

	/** 
	 * data为用户订单信息
	 */
	@ApiField("data")
	private SubscribeStatusApiResponse data;

	public void setData(SubscribeStatusApiResponse data) {
		this.data = data;
	}
	public SubscribeStatusApiResponse getData( ) {
		return this.data;
	}

}
