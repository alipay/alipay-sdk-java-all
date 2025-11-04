package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-27 11:37:28
 */
public class QrcodeWhiteList extends AlipayObject {

	private static final long serialVersionUID = 8584583435245715137L;

	/**
	 * 小程序id或域名
	 */
	@ApiField("app_id_or_domain")
	private String appIdOrDomain;

	/**
	 * 类型，H5:H5, 小程序：MINI_APP
	 */
	@ApiField("type")
	private String type;

	public String getAppIdOrDomain() {
		return this.appIdOrDomain;
	}
	public void setAppIdOrDomain(String appIdOrDomain) {
		this.appIdOrDomain = appIdOrDomain;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
