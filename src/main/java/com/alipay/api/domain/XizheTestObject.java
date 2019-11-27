package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * XizheTestObject
 *
 * @author auto create
 * @since 1.0, 2019-05-09 16:55:27
 */
public class XizheTestObject extends AlipayObject {

	private static final long serialVersionUID = 2828612614447232289L;

	/**
	 * test
	 */
	@ApiListField("name")
	@ApiField("string")
	private List<String> name;

	public List<String> getName() {
		return this.name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}

}
