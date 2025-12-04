package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云开发自定义域名
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:44:43
 */
public class CloudGateway extends AlipayObject {

	private static final long serialVersionUID = 6785159597834244286L;

	/**
	 * 目标CNAME地址
	 */
	@ApiField("cname")
	private String cname;

	/**
	 * 备案状态
- CONNECTED：已备案已接入
- UNCONNECT：已备案未接入
	 */
	@ApiField("connect_status")
	private String connectStatus;

	/**
	 * 是否为自定义域名
	 */
	@ApiField("custom")
	private Boolean custom;

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
	 * 自定义网关域名
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

	public String getCname() {
		return this.cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getConnectStatus() {
		return this.connectStatus;
	}
	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}

	public Boolean getCustom() {
		return this.custom;
	}
	public void setCustom(Boolean custom) {
		this.custom = custom;
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
