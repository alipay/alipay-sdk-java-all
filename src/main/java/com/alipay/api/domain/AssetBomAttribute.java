package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料bom扩展属性
 *
 * @author auto create
 * @since 1.0, 2022-02-23 15:44:53
 */
public class AssetBomAttribute extends AlipayObject {

	private static final long serialVersionUID = 6231747485314491343L;

	/**
	 * 属性编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 属性值
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
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
