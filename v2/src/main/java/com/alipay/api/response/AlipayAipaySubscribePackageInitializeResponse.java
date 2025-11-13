package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubscribeInitiateApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.subscribe.package.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-11 14:37:43
 */
public class AlipayAipaySubscribePackageInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2223915116483212526L;

	/** 
	 * 订阅初始化返回数据
	 */
	@ApiField("data")
	private SubscribeInitiateApiResponse data;

	public void setData(SubscribeInitiateApiResponse data) {
		this.data = data;
	}
	public SubscribeInitiateApiResponse getData( ) {
		return this.data;
	}

}
