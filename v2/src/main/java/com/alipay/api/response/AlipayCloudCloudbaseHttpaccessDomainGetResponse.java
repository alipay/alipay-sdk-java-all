package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.domain.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:26
 */
public class AlipayCloudCloudbaseHttpaccessDomainGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3444182753419861647L;

	/** 
	 * 目标CNAME地址
	 */
	@ApiField("cname")
	private String cname;

	/** 
	 * 是否为强制HTTPS
	 */
	@ApiField("force_https")
	private Boolean forceHttps;

	/** 
	 * 是否有证书
	 */
	@ApiField("has_cert")
	private Boolean hasCert;

	/** 
	 * 域名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * -----BEGIN CERTIFICATE-----
MIICizCCAfQCCQCCV7Beh2T
......
Yavrq6iaDVj8s1YWg0DX5xI
-----END CERTIFICATE-----
	 */
	@ApiField("ssl_cert")
	private String sslCert;

	/** 
	 * -----BEGIN RSA PRIVATE KEY-----
MIICXgIBAAKBgQDn6yPnXiH
......
PpJ76GhptJ5sA7ZS6hAGX1w
-----END RSA PRIVATE KEY-----
	 */
	@ApiField("ssl_key")
	private String sslKey;

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname( ) {
		return this.cname;
	}

	public void setForceHttps(Boolean forceHttps) {
		this.forceHttps = forceHttps;
	}
	public Boolean getForceHttps( ) {
		return this.forceHttps;
	}

	public void setHasCert(Boolean hasCert) {
		this.hasCert = hasCert;
	}
	public Boolean getHasCert( ) {
		return this.hasCert;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setSslCert(String sslCert) {
		this.sslCert = sslCert;
	}
	public String getSslCert( ) {
		return this.sslCert;
	}

	public void setSslKey(String sslKey) {
		this.sslKey = sslKey;
	}
	public String getSslKey( ) {
		return this.sslKey;
	}

}
