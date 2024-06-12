package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定向规则
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:58
 */
public class SearchProductOrientedRule extends AlipayObject {

	private static final long serialVersionUID = 1123289432896967874L;

	/**
	 * 客户端
	 */
	@ApiField("client_platform")
	private String clientPlatform;

	/**
	 * 结束版本
	 */
	@ApiField("end_version")
	private String endVersion;

	/**
	 * 开始版本
	 */
	@ApiField("start_version")
	private String startVersion;

	public String getClientPlatform() {
		return this.clientPlatform;
	}
	public void setClientPlatform(String clientPlatform) {
		this.clientPlatform = clientPlatform;
	}

	public String getEndVersion() {
		return this.endVersion;
	}
	public void setEndVersion(String endVersion) {
		this.endVersion = endVersion;
	}

	public String getStartVersion() {
		return this.startVersion;
	}
	public void setStartVersion(String startVersion) {
		this.startVersion = startVersion;
	}

}
