package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 朝瑰测试
 *
 * @author auto create
 * @since 1.0, 2017-06-03 16:43:00
 */
public class AlipayOpenAuthZhaoguiTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8471663775746969425L;

	/**
	 * zhaoguitest
	 */
	@ApiField("input")
	private String input;

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

}
