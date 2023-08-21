package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StaticDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domain.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:11:59
 */
public class AlipayCloudCloudrunStaticsiteDomainAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1492766524814844347L;

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
