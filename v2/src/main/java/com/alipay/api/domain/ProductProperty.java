package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:38
 */
public class ProductProperty extends AlipayObject {

	private static final long serialVersionUID = 3812599453351412557L;

	/**
	 * 属性名
	 */
	@ApiField("text")
	private String text;

	/**
	 * 属性值
	 */
	@ApiListField("values")
	@ApiField("string")
	private List<String> values;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public List<String> getValues() {
		return this.values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}

}
