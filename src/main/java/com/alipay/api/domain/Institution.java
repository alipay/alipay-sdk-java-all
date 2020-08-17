package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:54:30
 */
public class Institution extends AlipayObject {

	private static final long serialVersionUID = 7566228775453577677L;

	/**
	 * 人行联行号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 银行全称
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
