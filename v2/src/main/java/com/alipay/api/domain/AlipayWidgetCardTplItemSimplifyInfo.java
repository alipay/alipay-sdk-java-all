package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小组件卡片模板ITEM精简信息（无子列表）
 *
 * @author auto create
 * @since 1.0, 2024-04-26 16:20:27
 */
public class AlipayWidgetCardTplItemSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3865273443783896836L;

	/**
	 * 补全的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 2:平台补全 1:业务补全 0:无需补全
	 */
	@ApiField("content_fill_mode")
	private String contentFillMode;

	/**
	 * 动态key，同卡片模板下唯一
	 */
	@ApiField("key")
	private String key;

	/**
	 * 基础类型：图片、文字、图标、按钮、列表、链接、背景等
	 */
	@ApiField("type")
	private String type;

	/**
	 * 补全的跳转链接
	 */
	@ApiField("url")
	private String url;

	/**
	 * 2:平台补全 1:业务补全 0:无需补全
	 */
	@ApiField("url_fill_mode")
	private String urlFillMode;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentFillMode() {
		return this.contentFillMode;
	}
	public void setContentFillMode(String contentFillMode) {
		this.contentFillMode = contentFillMode;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlFillMode() {
		return this.urlFillMode;
	}
	public void setUrlFillMode(String urlFillMode) {
		this.urlFillMode = urlFillMode;
	}

}
