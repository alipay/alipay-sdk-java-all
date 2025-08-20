package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改自定义域名
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:44:32
 */
public class AlipayCloudCloudbaseGatewayDomainModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3414223624194623558L;

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
	 * 是否强制HTTPS
	 */
	@ApiField("force_https")
	private Boolean forceHttps;

	/**
	 * 域名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 证书文本
	 */
	@ApiField("ssl_cert")
	private String sslCert;

	/**
	 * 私钥文本
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

	public Boolean getForceHttps() {
		return this.forceHttps;
	}
	public void setForceHttps(Boolean forceHttps) {
		this.forceHttps = forceHttps;
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
