package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序信息
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:55
 */
public class EcoAppInfo extends AlipayObject {

	private static final long serialVersionUID = 4444266851266688481L;

	/**
	 * 小程序id
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

}
