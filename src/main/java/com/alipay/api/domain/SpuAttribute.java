package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性对象
 *
 * @author auto create
 * @since 1.0, 2022-05-18 16:09:36
 */
public class SpuAttribute extends AlipayObject {

	private static final long serialVersionUID = 6262761733359986711L;

	/**
	 * 商品属性名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品属性值
	 */
	@ApiListField("value")
	@ApiField("string")
	private List<String> value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getValue() {
		return this.value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}
