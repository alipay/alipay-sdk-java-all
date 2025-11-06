package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubscribeInitiateApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.subscribe.package.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 10:12:38
 */
public class AlipayAipaySubscribePackageInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1318385776218718187L;

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
