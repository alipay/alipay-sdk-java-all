package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链接信息数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class NewsfeedMediaLinkInfo extends AlipayObject {

	private static final long serialVersionUID = 2268838296525913192L;

	/**
	 * 资源ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 资源的来源
	 */
	@ApiField("content_source")
	private String contentSource;

	/**
	 * 资源类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 链接的缩略图
	 */
	@ApiField("thumb")
	private String thumb;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * linkurl
	 */
	@ApiField("url")
	private String url;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getContentSource() {
		return this.contentSource;
	}
	public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

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
