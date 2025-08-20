package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性列表
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:57:37
 */
public class OpenAttributeDTO extends AlipayObject {

	private static final long serialVersionUID = 5868172855827743841L;

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
