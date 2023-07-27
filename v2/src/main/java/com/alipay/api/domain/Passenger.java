package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人的属性
 *
 * @author auto create
 * @since 1.0, 2021-05-12 10:09:20
 */
public class Passenger extends AlipayObject {

	private static final long serialVersionUID = 8586956631769449356L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
