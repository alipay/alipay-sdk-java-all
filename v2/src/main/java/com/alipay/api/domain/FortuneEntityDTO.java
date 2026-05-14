package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实体详细信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:45
 */
public class FortuneEntityDTO extends AlipayObject {

	private static final long serialVersionUID = 2665829774814569218L;

	/**
	 * 详细信息内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 信息类型
	 */
	@ApiField("type")
	private String type;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
