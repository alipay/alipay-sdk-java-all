package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建自定义域名
 *
 * @author auto create
 * @since 1.0, 2023-08-31 12:14:21
 */
public class AlipayCloudCloudbaseHttpaccessDomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3512412423844568755L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

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

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
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
