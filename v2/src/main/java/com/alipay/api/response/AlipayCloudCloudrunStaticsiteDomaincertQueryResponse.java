package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domaincert.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 11:26:43
 */
public class AlipayCloudCloudrunStaticsiteDomaincertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3134899684893535134L;

	/** 
	 * 证书，PEM格式
	 */
	@ApiField("certificate")
	private String certificate;

	/** 
	 * 是否开启https
	 */
	@ApiField("enable_https")
	private Boolean enableHttps;

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getCertificate( ) {
		return this.certificate;
	}

	public void setEnableHttps(Boolean enableHttps) {
		this.enableHttps = enableHttps;
	}
	public Boolean getEnableHttps( ) {
		return this.enableHttps;
	}

}
