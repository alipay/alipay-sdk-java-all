package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加安全域名
 *
 * @author auto create
 * @since 1.0, 2023-10-25 15:40:10
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainAddModel extends AlipayObject {

	private static final long serialVersionUID = 1125294537597375689L;

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
