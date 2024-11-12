package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洞察品牌
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:00:18
 */
public class InsightBrand extends AlipayObject {

	private static final long serialVersionUID = 4897246123117487866L;

	/**
	 * 品牌 CODE
	 */
	@ApiField("code")
	private String code;

	/**
	 * 品牌名称
	 */
	@ApiField("name")
	private String name;

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

}
