package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交评论链接信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CommentLinkInfo extends AlipayObject {

	private static final long serialVersionUID = 4845357878274868711L;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 缩略图（支持http、https、alipays、djangoId）
	 */
	@ApiField("thumb")
	private String thumb;

	/**
	 * 链接的标题信息
	 */
	@ApiField("title")
	private String title;

	/**
	 * 链接url，支持http、https、alipays
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getThumb() {
		return this.thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
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
