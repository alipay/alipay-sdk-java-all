package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发放引导
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class VoucherMiniAppSendGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 5761552878824656323L;

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
