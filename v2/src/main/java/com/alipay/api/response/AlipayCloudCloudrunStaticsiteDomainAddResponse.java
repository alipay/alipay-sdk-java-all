package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StaticDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domain.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 10:42:03
 */
public class AlipayCloudCloudrunStaticsiteDomainAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8815665614717251191L;

	/** 
	 * 域名
	 */
	@ApiField("domain")
	private StaticDomain domain;

	public void setDomain(StaticDomain domain) {
		this.domain = domain;
	}
	public StaticDomain getDomain( ) {
		return this.domain;
	}

}
