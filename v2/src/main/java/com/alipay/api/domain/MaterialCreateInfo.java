package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材创建模型
 *
 * @author auto create
 * @since 1.0, 2025-09-09 10:41:05
 */
public class MaterialCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 8622936736675879312L;

	/**
	 * 素材内容（素材地址或素材KEY）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 素材类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
