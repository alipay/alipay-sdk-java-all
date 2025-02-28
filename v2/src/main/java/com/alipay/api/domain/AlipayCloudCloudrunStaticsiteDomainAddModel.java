package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加自定义域名
 *
 * @author auto create
 * @since 1.0, 2024-06-04 10:40:50
 */
public class AlipayCloudCloudrunStaticsiteDomainAddModel extends AlipayObject {

	private static final long serialVersionUID = 3244587846749189971L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 私钥，pem格式。
	 */
	@ApiField("cert_private_key")
	private String certPrivateKey;

	/**
	 * 证书，pem格式
	 */
	@ApiField("certificate")
	private String certificate;

	/**
	 * 域名。输入你的自定义域名。
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * 是否开启https
	 */
	@ApiField("enable_https")
	private Boolean enableHttps;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getCertPrivateKey() {
		return this.certPrivateKey;
	}
	public void setCertPrivateKey(String certPrivateKey) {
		this.certPrivateKey = certPrivateKey;
	}

	public String getCertificate() {
		return this.certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public Boolean getEnableHttps() {
		return this.enableHttps;
	}
	public void setEnableHttps(Boolean enableHttps) {
		this.enableHttps = enableHttps;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
