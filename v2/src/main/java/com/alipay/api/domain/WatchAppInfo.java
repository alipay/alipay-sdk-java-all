package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手表app信息
 *
 * @author auto create
 * @since 1.0, 2025-08-06 20:22:51
 */
public class WatchAppInfo extends AlipayObject {

	private static final long serialVersionUID = 2657197257391478953L;

	/**
	 * pocketMoney：手表零花钱
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 0:不显示，1:待关联，10:未开通，20:待激活，30:余额不足，40:去管理
	 */
	@ApiField("app_status_code")
	private String appStatusCode;

	/**
	 * 0:不显示，1:待关联，10:未开通，20:待激活，30:余额不足，40:去管理
	 */
	@ApiField("app_status_desc")
	private String appStatusDesc;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppStatusCode() {
		return this.appStatusCode;
	}
	public void setAppStatusCode(String appStatusCode) {
		this.appStatusCode = appStatusCode;
	}

	public String getAppStatusDesc() {
		return this.appStatusDesc;
	}
	public void setAppStatusDesc(String appStatusDesc) {
		this.appStatusDesc = appStatusDesc;
	}

}
