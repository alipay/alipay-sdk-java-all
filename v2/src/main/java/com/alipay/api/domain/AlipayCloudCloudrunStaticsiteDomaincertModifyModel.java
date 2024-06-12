package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新自定义域名证书
 *
 * @author auto create
 * @since 1.0, 2024-06-04 10:41:17
 */
public class AlipayCloudCloudrunStaticsiteDomaincertModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1118633867158652335L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 私钥，PEM格式
	 */
	@ApiField("cert_private_key")
	private String certPrivateKey;

	/**
	 * 证书，PEM格式
	 */
	@ApiField("certificate")
	private String certificate;

	/**
	 * 域名。输入你要更新证书的自定义域名。
	 */
	@ApiField("domain_name")
	private String domainName;

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

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
