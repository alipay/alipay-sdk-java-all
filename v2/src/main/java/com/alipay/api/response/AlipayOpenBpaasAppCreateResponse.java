package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.bpaas.app.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:06:26
 */
public class AlipayOpenBpaasAppCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1398951888264932278L;

	/** 
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 应用平台类型：ANDROID、RTOS、LINUX、WINDOWS
	 */
	@ApiField("app_platform")
	private String appPlatform;

	/** 
	 * 应用类型
	 */
	@ApiField("app_type")
	private String appType;

	/** 
	 * bpaas应用ID
	 */
	@ApiField("bpaas_app_id")
	private String bpaasAppId;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppPlatform(String appPlatform) {
		this.appPlatform = appPlatform;
	}
	public String getAppPlatform( ) {
		return this.appPlatform;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getAppType( ) {
		return this.appType;
	}

	public void setBpaasAppId(String bpaasAppId) {
		this.bpaasAppId = bpaasAppId;
	}
	public String getBpaasAppId( ) {
		return this.bpaasAppId;
	}

}
