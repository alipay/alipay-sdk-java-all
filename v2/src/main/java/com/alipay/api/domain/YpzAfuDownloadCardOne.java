package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福带下载卡
 *
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:58
 */
public class YpzAfuDownloadCardOne extends AlipayObject {

	private static final long serialVersionUID = 1542284241516596676L;

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
