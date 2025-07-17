package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名提示文案和跳转链接
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:43:15
 */
public class TipsAndUrl extends AlipayObject {

	private static final long serialVersionUID = 7898645642472657222L;

	/**
	 * 跳转链接的提示语
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
