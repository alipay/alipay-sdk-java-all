package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序客户端版本号信息
 *
 * @author auto create
 * @since 1.0, 2019-03-27 21:26:56
 */
public class MiniAppClientVersionInfo extends AlipayObject {

	private static final long serialVersionUID = 4473737881894344816L;

	/**
	 * 最大客户端版本号信息
	 */
	@ApiField("max_client_version")
	private String maxClientVersion;

	/**
	 * 最小客户端版本号
	 */
	@ApiField("min_client_version")
	private String minClientVersion;

	public String getMaxClientVersion() {
		return this.maxClientVersion;
	}
	public void setMaxClientVersion(String maxClientVersion) {
		this.maxClientVersion = maxClientVersion;
	}

	public String getMinClientVersion() {
		return this.minClientVersion;
	}
	public void setMinClientVersion(String minClientVersion) {
		this.minClientVersion = minClientVersion;
	}

}
