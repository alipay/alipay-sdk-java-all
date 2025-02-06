package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引导链接查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemMiniAppQueryUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 3218337863311443134L;

	/**
	 * 小程序链接
	 */
	@ApiField("mini_app_url")
	private String miniAppUrl;

	public String getMiniAppUrl() {
		return this.miniAppUrl;
	}
	public void setMiniAppUrl(String miniAppUrl) {
		this.miniAppUrl = miniAppUrl;
	}

}
