package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解绑安全域名
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:19:37
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7768512615369528914L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 安全域名
	 */
	@ApiField("secure_domain")
	private String secureDomain;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getSecureDomain() {
		return this.secureDomain;
	}
	public void setSecureDomain(String secureDomain) {
		this.secureDomain = secureDomain;
	}

}
