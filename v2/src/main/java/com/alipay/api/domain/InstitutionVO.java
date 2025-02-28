package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构信息
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:13
 */
public class InstitutionVO extends AlipayObject {

	private static final long serialVersionUID = 3196293515559685493L;

	/**
	 * 机构编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 机构中文名
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
