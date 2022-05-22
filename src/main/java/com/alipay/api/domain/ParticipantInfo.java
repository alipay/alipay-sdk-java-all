package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参赛者信息
 *
 * @author auto create
 * @since 1.0, 2021-03-09 10:34:23
 */
public class ParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 7269847932563488677L;

	/**
	 * 参赛者常用地址
	 */
	@ApiField("contact_address")
	private String contactAddress;

	/**
	 * 参赛者当前学校
	 */
	@ApiField("current_school")
	private String currentSchool;

	/**
	 * 参赛者邮箱
	 */
	@ApiField("e_mail")
	private String eMail;

	/**
	 * 证件号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 证件类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 参赛者名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参赛者照片链接
	 */
	@ApiField("photo")
	private String photo;

	/**
	 * 参赛者性别
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 参赛者联系方式
	 */
	@ApiField("tel_number")
	private String telNumber;

	public String getContactAddress() {
		return this.contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getCurrentSchool() {
		return this.currentSchool;
	}
	public void setCurrentSchool(String currentSchool) {
		this.currentSchool = currentSchool;
	}

	public String geteMail() {
		return this.eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return this.photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
