package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收藏链接列表
 *
 * @author auto create
 * @since 1.0, 2025-09-04 14:16:21
 */
public class UrlInfoList extends AlipayObject {

	private static final long serialVersionUID = 8334488259875893742L;

	/**
	 * 是否为AI
	 */
	@ApiField("ai")
	private Boolean ai;

	/**
	 * 收藏类型
	 */
	@ApiField("collect_type")
	private String collectType;

	/**
	 * 藏品图片
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 藏品副标题
	 */
	@ApiField("subtitle")
	private String subtitle;

	/**
	 * 藏品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 原始链接
	 */
	@ApiField("url")
	private String url;

	public Boolean getAi() {
		return this.ai;
	}
	public void setAi(Boolean ai) {
		this.ai = ai;
	}

	public String getCollectType() {
		return this.collectType;
	}
	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSubtitle() {
		return this.subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

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
