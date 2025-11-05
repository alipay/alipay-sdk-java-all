package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摘要组
 *
 * @author auto create
 * @since 1.0, 2025-09-23 16:47:53
 */
public class SearchDocAbstractBO extends AlipayObject {

	private static final long serialVersionUID = 7625546994957798626L;

	/**
	 * 离线摘要
	 */
	@ApiField("abstract_offline")
	private String abstractOffline;

	/**
	 * 在线摘要
	 */
	@ApiField("abstract_online")
	private String abstractOnline;

	/**
	 * 摘要
	 */
	@ApiField("snippet")
	private String snippet;

	public String getAbstractOffline() {
		return this.abstractOffline;
	}
	public void setAbstractOffline(String abstractOffline) {
		this.abstractOffline = abstractOffline;
	}

	public String getAbstractOnline() {
		return this.abstractOnline;
	}
	public void setAbstractOnline(String abstractOnline) {
		this.abstractOnline = abstractOnline;
	}

	public String getSnippet() {
		return this.snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

}
