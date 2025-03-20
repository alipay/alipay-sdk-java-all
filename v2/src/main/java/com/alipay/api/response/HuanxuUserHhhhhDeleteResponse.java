package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: huanxu.user.hhhhh.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class HuanxuUserHhhhhDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5654734544636891846L;

	/** 
	 * fsdfsdfsd
	 */
	@ApiField("aa")
	private String aa;

	/** 
	 * 应用名
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * asd
	 */
	@ApiField("name")
	private String name;

	public void setAa(String aa) {
		this.aa = aa;
	}
	public String getAa( ) {
		return this.aa;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
