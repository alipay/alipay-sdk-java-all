package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.securedomain.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 13:56:45
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5663829729927478864L;

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
