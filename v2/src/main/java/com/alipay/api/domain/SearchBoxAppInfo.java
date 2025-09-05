package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达应用信息
 *
 * @author auto create
 * @since 1.0, 2023-07-24 16:33:39
 */
public class SearchBoxAppInfo extends AlipayObject {

	private static final long serialVersionUID = 1658957517189811899L;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用类型，TINY_APP-小程序/PUBLIC_APP-生活号
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 应用ID
	 */
	@ApiField("relate_appid")
	private String relateAppid;

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

	public String getRelateAppid() {
		return this.relateAppid;
	}
	public void setRelateAppid(String relateAppid) {
		this.relateAppid = relateAppid;
	}

}
