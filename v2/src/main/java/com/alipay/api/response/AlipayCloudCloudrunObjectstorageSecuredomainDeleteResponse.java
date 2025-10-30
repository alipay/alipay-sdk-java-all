package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.securedomain.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:01:37
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2745779189867868257L;

	/** 
	 * 安全域名
	 */
	@ApiField("secure_domain")
	private String secureDomain;

	public void setSecureDomain(String secureDomain) {
		this.secureDomain = secureDomain;
	}
	public String getSecureDomain( ) {
		return this.secureDomain;
	}

}
