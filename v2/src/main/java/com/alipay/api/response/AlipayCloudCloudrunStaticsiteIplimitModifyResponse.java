package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IPLimit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.iplimit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:02:13
 */
public class AlipayCloudCloudrunStaticsiteIplimitModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7878756943794564992L;

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
