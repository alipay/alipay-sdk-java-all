package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互跳白名单vo
 *
 * @author auto create
 * @since 1.0, 2022-07-27 12:22:06
 */
public class MiniAppRelationItemVo extends AlipayObject {

	private static final long serialVersionUID = 5886382164772744717L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
