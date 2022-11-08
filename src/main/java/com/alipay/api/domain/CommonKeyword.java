package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步参数
 *
 * @author auto create
 * @since 1.0, 2022-07-25 14:33:05
 */
public class CommonKeyword extends AlipayObject {

	private static final long serialVersionUID = 3379742425331347441L;

	/**
	 * 回传的值对应的参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 回传值对应的参数值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
