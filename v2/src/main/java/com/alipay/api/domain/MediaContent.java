package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-25 17:37:41
 */
public class MediaContent extends AlipayObject {

	private static final long serialVersionUID = 4575398399711893997L;

	/**
	 * 文件上传接口返回的fileId。文件上传接口文档：<a href="https://alipaytbox.yuque.com/sxs0ba/huntb8/xvp2i0tmc831paov">链接</a>。
	 */
	@ApiField("id")
	private String id;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 文件地址链接，可HTTP访问的链接。
	 */
	@ApiField("url")
	private String url;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

}
