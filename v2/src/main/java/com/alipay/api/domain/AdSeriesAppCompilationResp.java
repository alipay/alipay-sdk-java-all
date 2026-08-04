package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:27:50
 */
public class AdSeriesAppCompilationResp extends AlipayObject {

	private static final long serialVersionUID = 1157928623444438655L;

	/**
	 * 短剧合集id
	 */
	@ApiField("compilation_id")
	private String compilationId;

	/**
	 * 封面链接
	 */
	@ApiField("cover_url")
	private String coverUrl;

	/**
	 * 前端悬停提示文案
	 */
	@ApiField("hover")
	private String hover;

	/**
	 * 可投状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getCompilationId() {
		return this.compilationId;
	}
	public void setCompilationId(String compilationId) {
		this.compilationId = compilationId;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getHover() {
		return this.hover;
	}
	public void setHover(String hover) {
		this.hover = hover;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
