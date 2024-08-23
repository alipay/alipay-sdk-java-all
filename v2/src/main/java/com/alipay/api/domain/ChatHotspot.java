package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热点资讯
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:56:59
 */
public class ChatHotspot extends AlipayObject {

	private static final long serialVersionUID = 5673215828451311457L;

	/**
	 * 热点资讯的详细介绍
	 */
	@ApiField("content")
	private String content;

	/**
	 * 热点资讯图片链接
	 */
	@ApiField("image")
	private String image;

	/**
	 * 热点资讯标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 热点资讯链接
	 */
	@ApiField("url")
	private String url;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
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
