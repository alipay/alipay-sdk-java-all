package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权支付宝站内生活号信息
 *
 * @author auto create
 * @since 1.0, 2025-05-09 13:05:22
 */
public class AuthorizeLifeApp extends AlipayObject {

	private static final long serialVersionUID = 1257918194965632232L;

	/**
	 * 在支付宝平台注册的生活号应用对应的应用id
	 */
	@ApiField("life_app_id")
	private String lifeAppId;

	/**
	 * 支付宝平台创建的生活号应用名称，用于授权影视作品
	 */
	@ApiField("life_app_name")
	private String lifeAppName;

	public String getLifeAppId() {
		return this.lifeAppId;
	}
	public void setLifeAppId(String lifeAppId) {
		this.lifeAppId = lifeAppId;
	}

	public String getLifeAppName() {
		return this.lifeAppName;
	}
	public void setLifeAppName(String lifeAppName) {
		this.lifeAppName = lifeAppName;
	}

}
