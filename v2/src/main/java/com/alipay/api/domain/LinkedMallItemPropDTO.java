package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道商商品属性，键为属性名，值为属性集合
 *
 * @author auto create
 * @since 1.0, 2024-06-07 13:59:54
 */
public class LinkedMallItemPropDTO extends AlipayObject {

	private static final long serialVersionUID = 4363687289766724918L;

	/**
	 * 商品属性名
	 */
	@ApiField("text")
	private String text;

	/**
	 * 商品属性值
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
