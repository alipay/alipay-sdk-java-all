package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目信息
 *
 * @author auto create
 * @since 1.0, 2021-03-09 16:35:18
 */
public class CateInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1816792818739347655L;

	/**
	 * 类目编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 类目
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
