package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于表示会话结果的标签
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentTagInfo extends AlipayObject {

	private static final long serialVersionUID = 6386851766688513893L;

	/**
	 * 标签类型，枚举值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 指定标签类型对应的具体标签值
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
