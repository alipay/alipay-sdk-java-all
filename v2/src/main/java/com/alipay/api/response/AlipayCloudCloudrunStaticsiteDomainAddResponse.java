package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StaticDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domain.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 13:56:45
 */
public class AlipayCloudCloudrunStaticsiteDomainAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8141599577843489877L;

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
