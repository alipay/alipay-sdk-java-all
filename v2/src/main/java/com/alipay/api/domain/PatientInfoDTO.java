package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 患者信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class PatientInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4434376918733714955L;

	/**
	 * 年纪
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 患者ID
	 */
	@ApiField("id")
	private String id;

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

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
