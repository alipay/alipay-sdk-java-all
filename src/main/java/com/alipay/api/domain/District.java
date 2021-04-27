package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行政地区
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:49:59
 */
public class District extends AlipayObject {

	private static final long serialVersionUID = 6257513548598115621L;

	/**
	 * 行政地区编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 行政地区名称
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
