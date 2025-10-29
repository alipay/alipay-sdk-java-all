package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MemberArchiveOpenApiInfoDTO
 *
 * @author auto create
 * @since 1.0, 2025-08-30 19:03:05
 */
public class MemberArchiveOpenApiInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6353416662127667377L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 档案编号
	 */
	@ApiField("archive_no")
	private String archiveNo;

	/**
	 * 头像链接
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 脱敏身份证号
	 */
	@ApiField("desensitization_id_number")
	private String desensitizationIdNumber;

	/**
	 * 脱敏手机号
	 */
	@ApiField("desensitization_phone")
	private String desensitizationPhone;

	/**
	 * 脱敏姓名
	 */
	@ApiField("desensitization_username")
	private String desensitizationUsername;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 枚举值：
10-大陆身份证，12-港澳台身份证，20-护照；
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 枚举值：
SELF:SELF
SPOUSE:SPOUSE
PARENT:PARENT
CHILDREN:CHILDREN
FRIEND:FRIEND
OTHER:OTHER
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getArchiveNo() {
		return this.archiveNo;
	}
	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDesensitizationIdNumber() {
		return this.desensitizationIdNumber;
	}
	public void setDesensitizationIdNumber(String desensitizationIdNumber) {
		this.desensitizationIdNumber = desensitizationIdNumber;
	}

	public String getDesensitizationPhone() {
		return this.desensitizationPhone;
	}
	public void setDesensitizationPhone(String desensitizationPhone) {
		this.desensitizationPhone = desensitizationPhone;
	}

	public String getDesensitizationUsername() {
		return this.desensitizationUsername;
	}
	public void setDesensitizationUsername(String desensitizationUsername) {
		this.desensitizationUsername = desensitizationUsername;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
