package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭档案详情
 *
 * @author auto create
 * @since 1.0, 2020-07-28 09:51:48
 */
public class FamilyArchiveDetail extends AlipayObject {

	private static final long serialVersionUID = 6223654592858831594L;

	/**
	 * 家庭档案中用户填写的详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 家人档案ID
	 */
	@ApiField("archive_id")
	private String archiveId;

	/**
	 * 家庭档案中用户填写的区县名称
	 */
	@ApiField("area")
	private String area;

	/**
	 * 家庭档案中用户填写的生日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 家庭档案中用户填写的证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 家庭档案中用户填写的证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 家庭档案中用户填写的市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 脱敏的家人支付宝登录号
	 */
	@ApiField("desensitized_logon_id")
	private String desensitizedLogonId;

	/**
	 * 脱敏的家人真实姓名
	 */
	@ApiField("desensitized_real_name")
	private String desensitizedRealName;

	/**
	 * 家庭档案中用户填写的邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 家庭档案中用户填写的性别（F：女性；M：男性）
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 家庭档案中用户填写的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 家庭档案中用户填写的职业
	 */
	@ApiField("profession")
	private String profession;

	/**
	 * 家庭档案中用户填写的省份名称
	 */
	@ApiField("province")
	private String province;

	/**
	 * 家庭用户档案中填写的真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 家庭档案中用户填写的家庭角色名称
	 */
	@ApiField("role")
	private String role;

	/**
	 * 家庭档案中用户填写的邮政编码
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArchiveId() {
		return this.archiveId;
	}
	public void setArchiveId(String archiveId) {
		this.archiveId = archiveId;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
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

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDesensitizedLogonId() {
		return this.desensitizedLogonId;
	}
	public void setDesensitizedLogonId(String desensitizedLogonId) {
		this.desensitizedLogonId = desensitizedLogonId;
	}

	public String getDesensitizedRealName() {
		return this.desensitizedRealName;
	}
	public void setDesensitizedRealName(String desensitizedRealName) {
		this.desensitizedRealName = desensitizedRealName;
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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
