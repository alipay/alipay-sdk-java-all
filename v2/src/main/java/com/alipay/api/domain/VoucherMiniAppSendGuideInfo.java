package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发放引导
 *
 * @author auto create
 * @since 1.0, 2023-10-26 20:36:05
 */
public class VoucherMiniAppSendGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 8527776293887994187L;

	/**
	 * 小程序发券链接
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
