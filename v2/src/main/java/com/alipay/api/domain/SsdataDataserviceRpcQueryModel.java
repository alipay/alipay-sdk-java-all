package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模式转换二期测试参数录入
 *
 * @author auto create
 * @since 1.0, 2024-11-27 18:57:20
 */
public class SsdataDataserviceRpcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3226437751117639382L;

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

	/**
	 * null
	 */
	@ApiListField("user")
	@ApiField("string")
	private List<String> user;

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

	public List<String> getUser() {
		return this.user;
	}
	public void setUser(List<String> user) {
		this.user = user;
	}

}
