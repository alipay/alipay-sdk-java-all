package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SPI复杂数据结构
 *
 * @author auto create
 * @since 1.0, 2019-10-29 14:04:59
 */
public class SpiInputObject extends AlipayObject {

	private static final long serialVersionUID = 8592281649639585177L;

	/**
	 * test
	 */
	@ApiField("age")
	private String age;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
