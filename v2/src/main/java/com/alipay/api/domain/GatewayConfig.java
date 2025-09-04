package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网关配置
 *
 * @author auto create
 * @since 1.0, 2023-10-16 20:20:49
 */
public class GatewayConfig extends AlipayObject {

	private static final long serialVersionUID = 7795736641293179535L;

	/**
	 * 网关域名
	 */
	@ApiField("endpoint")
	private String endpoint;

	/**
	 * 网关名称
	 */
	@ApiField("name")
	private String name;

	public String getEndpoint() {
		return this.endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
