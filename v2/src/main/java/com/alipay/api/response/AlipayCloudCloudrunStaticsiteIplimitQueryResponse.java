package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IPLimit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.iplimit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 10:06:46
 */
public class AlipayCloudCloudrunStaticsiteIplimitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2545933525849671139L;

	/** 
	 * IP黑白名单配置
	 */
	@ApiField("ip_limit")
	private IPLimit ipLimit;

	public void setIpLimit(IPLimit ipLimit) {
		this.ipLimit = ipLimit;
	}
	public IPLimit getIpLimit( ) {
		return this.ipLimit;
	}

}
