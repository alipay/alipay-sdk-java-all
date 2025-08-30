package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息模板
 *
 * @author auto create
 * @since 1.0, 2022-10-31 17:44:10
 */
public class TextTemplateData extends AlipayObject {

	private static final long serialVersionUID = 4195965686594192195L;

	/**
	 * 文本消息的文字
	 */
	@ApiField("m")
	private String m;

	public String getM() {
		return this.m;
	}
	public void setM(String m) {
		this.m = m;
	}

}
