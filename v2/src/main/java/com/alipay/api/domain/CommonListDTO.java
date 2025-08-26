package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 值/标签对
 *
 * @author auto create
 * @since 1.0, 2024-08-14 18:14:55
 */
public class CommonListDTO extends AlipayObject {

	private static final long serialVersionUID = 3446917982739171771L;

	/**
	 * 中文描述
	 */
	@ApiField("label")
	private String label;

	/**
	 * 值的编码。非可度量参数。不是错误码。
	 */
	@ApiField("value")
	private String value;

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
