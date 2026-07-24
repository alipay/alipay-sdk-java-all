package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就诊人信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 11:22:50
 */
public class FulfillmentBizPatientInfo extends AlipayObject {

	private static final long serialVersionUID = 7243398339468465215L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 性别：1:男  0:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 证件号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 患者id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
