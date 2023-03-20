package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群来源应用
 *
 * @author auto create
 * @since 1.0, 2023-02-28 17:17:33
 */
public class CrowdAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 7221956224163651661L;

	/**
	 * 应用注册的appName
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用注册的token
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 业务身份，统计使用
	 */
	@ApiField("biz_code")
	private String bizCode;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

}
