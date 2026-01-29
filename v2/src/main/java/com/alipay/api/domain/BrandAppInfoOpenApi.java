package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌应用信息
 *
 * @author auto create
 * @since 1.0, 2025-12-08 10:10:35
 */
public class BrandAppInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 3354828285442614621L;

	/**
	 * 应用appid，可以在open.alipay.com上查询
	 */
	@ApiField("app_id_b")
	private String appIdB;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用类型
TINYAPP：小程序
LIFEAPP：生活号
	 */
	@ApiField("app_type")
	private String appType;

	public String getAppIdB() {
		return this.appIdB;
	}
	public void setAppIdB(String appIdB) {
		this.appIdB = appIdB;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

}
