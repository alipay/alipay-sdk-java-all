package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险协议条款
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:36:28
 */
public class InsAgreementDTO extends AlipayObject {

	private static final long serialVersionUID = 1331287348612567487L;

	/**
	 * 条款内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 条款名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 条款类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 条款链接
	 */
	@ApiField("url")
	private String url;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
