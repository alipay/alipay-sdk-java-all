package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝标准用户学信网在校信息授权查询
 *
 * @author auto create
 * @since 1.0, 2021-04-12 15:12:34
 */
public class AlipayCommerceEducateXuexinIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3231462713332428648L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型， IDENTITY_CARD("IDENTITY_CARD", "1", "身份证")，PASSPORT("PASSPORT", "A", "护照")，目前只支持身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 教育层次
SPECIALTY("专科", "0"),
UNDERGRADUATE("本科", "1"),
POSTGRADUATE("研究生班", "2"),
MASTER("硕士研究生", "3"),
DOCTOR("博士研究生", "4"),
SECOND_DEGREE("第二学士学位", "5"),
HIGH_SCHOOL_TO_UNDERGRADUATE("高升本", "6"),
JUNIOR_COLLEGE_TO_UNDERGRADUATE("专升本", "7"),
SECOND_UNDERGRADUATE_COURSE("第二本科", "8"),
JUNIOR_COLLEGE_VOCATIONAL_COLLEGE("专科(高职)", "9"),
SECOND_SPECIALTY("第二专科", "10"),
GENERAL_CLASS_OF_NIGHT_UNIVERSITY("夜大电大函大普通班", "11"),
UNIVERSITY("大学", "12"),
OTHER("*", "13"),
	 */
	@ApiField("education_level")
	private String educationLevel;

	/**
	 * 入学日期
	 */
	@ApiField("enroll_date")
	private String enrollDate;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getEducationLevel() {
		return this.educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEnrollDate() {
		return this.enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
