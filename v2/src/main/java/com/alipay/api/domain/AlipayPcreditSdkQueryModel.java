package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型sdk测试
 *
 * @author auto create
 * @since 1.0, 2024-11-28 15:07:19
 */
public class AlipayPcreditSdkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7219143417365169876L;

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
