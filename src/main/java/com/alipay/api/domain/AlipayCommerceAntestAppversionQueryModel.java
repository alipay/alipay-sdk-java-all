package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过appId查询小程序版本列表
 *
 * @author auto create
 * @since 1.0, 2020-04-23 20:00:35
 */
public class AlipayCommerceAntestAppversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3793984975218874713L;

	/**
	 * appId
	 */
	@ApiField("app_code")
	private String appCode;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

}
