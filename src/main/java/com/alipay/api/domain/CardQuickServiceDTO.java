package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡快捷服务模型
 *
 * @author auto create
 * @since 1.0, 2022-10-21 11:13:43
 */
public class CardQuickServiceDTO extends AlipayObject {

	private static final long serialVersionUID = 2754895866427532357L;

	/**
	 * title：卡快捷服务名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * url：卡快捷服务跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
