package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 干系人信息
 *
 * @author auto create
 * @since 1.0, 2025-06-05 11:14:56
 */
public class RelatedPerson extends AlipayObject {

	private static final long serialVersionUID = 5183295297239836164L;

	/**
	 * 投保人年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 投保人生日
YYYY-MM-DD
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 投保人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 投保人证件类型，枚举值
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 投保人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 投保人性别，枚举值
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 有无社保
	 */
	@ApiField("join_social_security")
	private String joinSocialSecurity;

	/**
	 * 投保人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 干系人类型，枚举值
	 */
	@ApiField("person_type")
	private String personType;

	/**
	 * 投保人联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 与投保人关系，枚举值
	 */
	@ApiField("relation_to_holder")
	private String relationToHolder;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoinSocialSecurity() {
		return this.joinSocialSecurity;
	}
	public void setJoinSocialSecurity(String joinSocialSecurity) {
		this.joinSocialSecurity = joinSocialSecurity;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPersonType() {
		return this.personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationToHolder() {
		return this.relationToHolder;
	}
	public void setRelationToHolder(String relationToHolder) {
		this.relationToHolder = relationToHolder;
	}

}
