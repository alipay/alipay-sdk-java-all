package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福带下载卡
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:42:49
 */
public class YpzAfuDownloadCardOne extends AlipayObject {

	private static final long serialVersionUID = 6593576784378252411L;

	/**
	 * 图片URL
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 跳转URL
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
