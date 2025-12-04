package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板填充项
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class FillContent extends AlipayObject {

	private static final long serialVersionUID = 2268486489496719148L;

	/**
	 * 模板组件自定义key
	 */
	@ApiField("struct_key")
	private String structKey;

	/**
	 * 模板值,该值长度取决于配置模板时该字段的限制
	 */
	@ApiField("value")
	private String value;

	public String getStructKey() {
		return this.structKey;
	}
	public void setStructKey(String structKey) {
		this.structKey = structKey;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
