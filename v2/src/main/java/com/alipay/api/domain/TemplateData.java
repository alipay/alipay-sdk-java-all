package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板数据
 *
 * @author auto create
 * @since 1.0, 2024-12-04 14:42:56
 */
public class TemplateData extends AlipayObject {

	private static final long serialVersionUID = 3581375439663526997L;

	/**
	 * 卡片id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 卡片的标题
	 */
	@ApiField("title")
	private String title;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
