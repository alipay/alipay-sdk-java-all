package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RAG中知识库文档信息
 *
 * @author auto create
 * @since 1.0, 2024-12-26 10:20:19
 */
public class DocumentInfo extends AlipayObject {

	private static final long serialVersionUID = 8426538691355544153L;

	/**
	 * RAG中所引用知识库文档的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * RAG中所引用知识库文档的url
	 */
	@ApiField("url")
	private String url;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
