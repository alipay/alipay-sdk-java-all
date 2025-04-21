package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型sdk测试
 *
 * @author auto create
 * @since 1.0, 2025-02-12 16:22:24
 */
public class AlipayPcreditSdkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7282493878242259816L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
