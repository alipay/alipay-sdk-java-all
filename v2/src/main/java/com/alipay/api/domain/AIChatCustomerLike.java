package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户行为习惯
 *
 * @author auto create
 * @since 1.0, 2024-08-12 20:34:14
 */
public class AIChatCustomerLike extends AlipayObject {

	private static final long serialVersionUID = 1712929783798479867L;

	/**
	 * 输入方式
	 */
	@ApiField("input_method")
	private String inputMethod;

	public String getInputMethod() {
		return this.inputMethod;
	}
	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}

}
