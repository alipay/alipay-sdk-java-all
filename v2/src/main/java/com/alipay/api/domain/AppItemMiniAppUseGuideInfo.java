package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序核销详情
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemMiniAppUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 5313655851647641861L;

	/**
	 * 跳转指定小程序页面路径
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
