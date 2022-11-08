package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解语花鉴权类
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:18:46
 */
public class RcsmartCommonAppInfo extends AlipayObject {

	private static final long serialVersionUID = 8886335398734839318L;

	/**
	 * app_name为调用方系统名称(英文名称),与分配的app_token一起做调用系统合法性校验。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token为系统分配的密钥，与app_name一起做调用系统合法性校验。
	 */
	@ApiField("app_token")
	private String appToken;

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

}
