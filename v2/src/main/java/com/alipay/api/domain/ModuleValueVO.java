package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模块值
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:43
 */
public class ModuleValueVO extends AlipayObject {

	private static final long serialVersionUID = 5884377276147929536L;

	/**
	 * 模块属性值id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 模块属性值
	 */
	@ApiField("value")
	private String value;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
