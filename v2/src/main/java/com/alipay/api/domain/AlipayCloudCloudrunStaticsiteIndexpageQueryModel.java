package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询索引
 *
 * @author auto create
 * @since 1.0, 2023-10-09 11:30:36
 */
public class AlipayCloudCloudrunStaticsiteIndexpageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8371251558117434171L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

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

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
