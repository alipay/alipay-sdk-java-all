package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StaticDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domain.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 11:11:43
 */
public class AlipayCloudCloudrunStaticsiteDomainAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7328886824388495668L;

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
