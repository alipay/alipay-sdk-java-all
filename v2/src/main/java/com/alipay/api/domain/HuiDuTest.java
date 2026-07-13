package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2026-06-10 16:02:55
 */
public class HuiDuTest extends AlipayObject {

	private static final long serialVersionUID = 6735415453823192552L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
