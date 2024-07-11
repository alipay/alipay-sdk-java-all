package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用例执行场景单元数据
 *
 * @author auto create
 * @since 1.0, 2024-01-09 11:50:59
 */
public class SceneDataUnit extends AlipayObject {

	private static final long serialVersionUID = 5186412286629349956L;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 实际值：例如name是应用名   那么 value值就是对应的aone的应用英文名
	 */
	@ApiField("value")
	private String value;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

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
