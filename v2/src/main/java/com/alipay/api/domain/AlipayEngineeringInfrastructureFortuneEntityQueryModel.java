package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财富标的代码及基本信息提取接口
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:45
 */
public class AlipayEngineeringInfrastructureFortuneEntityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7683628548411284796L;

	/**
	 * 自然语言文本
	 */
	@ApiField("text")
	private String text;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
