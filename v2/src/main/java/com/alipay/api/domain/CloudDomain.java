package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 域信息列表
 *
 * @author auto create
 * @since 1.0, 2023-08-22 11:20:54
 */
public class CloudDomain extends AlipayObject {

	private static final long serialVersionUID = 4369664444142143812L;

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
	 * 是否为自定义域名
	 */
	@ApiField("is_custom")
	private Boolean isCustom;

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

	public String getCname() {
		return this.cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public Boolean getForceHttps() {
		return this.forceHttps;
	}
	public void setForceHttps(Boolean forceHttps) {
		this.forceHttps = forceHttps;
	}

	public Boolean getHasCert() {
		return this.hasCert;
	}
	public void setHasCert(Boolean hasCert) {
		this.hasCert = hasCert;
	}

	public Boolean getIsCustom() {
		return this.isCustom;
	}
	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSslCert() {
		return this.sslCert;
	}
	public void setSslCert(String sslCert) {
		this.sslCert = sslCert;
	}

	public String getSslKey() {
		return this.sslKey;
	}
	public void setSslKey(String sslKey) {
		this.sslKey = sslKey;
	}

}
