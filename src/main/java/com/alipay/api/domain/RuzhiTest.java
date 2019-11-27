package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 如之定义的入参数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class RuzhiTest extends AlipayObject {

	private static final long serialVersionUID = 4395876915924718664L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 朋友的名字
	 */
	@ApiListField("friend_names")
	@ApiField("string")
	private List<String> friendNames;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 体重，单位是千克
	 */
	@ApiField("weight")
	private Long weight;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public List<String> getFriendNames() {
		return this.friendNames;
	}
	public void setFriendNames(List<String> friendNames) {
		this.friendNames = friendNames;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
