package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试流程
 *
 * @author auto create
 * @since 1.0, 2019-04-17 13:06:59
 */
public class AlipayOpenAppTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6521745748646346955L;

	/**
	 * 11
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
