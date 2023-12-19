package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性列表
 *
 * @author auto create
 * @since 1.0, 2023-05-23 14:53:08
 */
public class OpenAttributeDTO extends AlipayObject {

	private static final long serialVersionUID = 4361513152366279131L;

	/**
	 * 属性名
	 */
	@ApiField("filed_name")
	private String filedName;

	/**
	 * 属性值
	 */
	@ApiField("filed_value")
	private String filedValue;

	public String getFiledName() {
		return this.filedName;
	}
	public void setFiledName(String filedName) {
		this.filedName = filedName;
	}

	public String getFiledValue() {
		return this.filedValue;
	}
	public void setFiledValue(String filedValue) {
		this.filedValue = filedValue;
	}

}
