package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.authinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:07:10
 */
public class AlipayMarketingCardAuthinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5132965516841749526L;

	/** 
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 【证件号码】结合证件类型使用.
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 【证件类型】0:身份证 1:护照 2:军官证 3:士兵证 4:回乡证 5:临时身份证 6:户口簿 7:警官证 8:台胞证 9:营业执照10:其它证件 11:港澳居民来往内地通行证 12:台湾居民来往大陆通行证 13:台湾居民居住证 14:港澳居民居住证 15:港澳身份证 16:外国人永久居住证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 优先获取email登录名，如果不存在，则返回mobile登录名
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 性别。枚举值如下： F：女性； M：男性。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 支付宝会员等级
primary,普通; golden,黄金; platinum,铂金; diamond,钻石unknown,未知。
	 */
	@ApiField("member_grade")
	private String memberGrade;

	/** 
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 个人用户生日。
	 */
	@ApiField("person_birthday")
	private String personBirthday;

	/** 
	 * 生日。不包含具体年份，格式MMdd
	 */
	@ApiField("person_birthday_without_year")
	private String personBirthdayWithoutYear;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}
	public String getIsStudentCertified( ) {
		return this.isStudentCertified;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	public String getMemberGrade( ) {
		return this.memberGrade;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setPersonBirthday(String personBirthday) {
		this.personBirthday = personBirthday;
	}
	public String getPersonBirthday( ) {
		return this.personBirthday;
	}

	public void setPersonBirthdayWithoutYear(String personBirthdayWithoutYear) {
		this.personBirthdayWithoutYear = personBirthdayWithoutYear;
	}
	public String getPersonBirthdayWithoutYear( ) {
		return this.personBirthdayWithoutYear;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
