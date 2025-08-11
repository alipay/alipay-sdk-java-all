package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识点基本信息
 *
 * @author auto create
 * @since 1.0, 2024-08-13 20:44:49
 */
public class BaseArticleInfo extends AlipayObject {

	private static final long serialVersionUID = 7276585232644764353L;

	/**
	 * 知识点id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 知识点标题
	 */
	@ApiField("title")
	private String title;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
