package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学生信息修改
 *
 * @author auto create
 * @since 1.0, 2019-08-14 14:02:12
 */
public class AlipayCommerceEducateStudentDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1435213518835999494L;

	/**
	 * 证件号码。本接口调用时cert_no参数必须存在。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，默认为1:
1 居民身份证
2 军官证
3 士兵证
4 文职干部证
5 部队离退休证
6 香港特区护照/身份证明
7 澳门特区护照/身份证明
8 台湾居民来往大陆通行证
9 境外永久居住证
A 护照
B 户口薄
Z 其他
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 修改后学生联系电话
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 修改后学生学籍号。G、J开头，都是全国正式学籍号码。L开头的，是临时的
	 */
	@ApiField("enroll_no")
	private String enrollNo;

	/**
	 * 性别; GB/T 2261 性别，0未知，1男，2女，9未说明的性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 修改后监护人信息。孩子的家长信息，最多一次输入20个家长。如果输入的家长信息不存在，则该学生增加家长信息
	 */
	@ApiListField("guardians")
	@ApiField("guardian")
	private List<Guardian> guardians;

	/**
	 * 机构编码，教育机构编码，可以是教育厅、教育局，也可以是一个学校或教育集团。
	 */
	@ApiField("institute_code")
	private String instituteCode;

	/**
	 * 学生更新前学籍号。调用方根据改字段进行更新
	 */
	@ApiField("original_enrollno")
	private String originalEnrollno;

	/**
	 * 修改后学生姓名
	 */
	@ApiField("student_name")
	private String studentName;

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

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getEnrollNo() {
		return this.enrollNo;
	}
	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Guardian> getGuardians() {
		return this.guardians;
	}
	public void setGuardians(List<Guardian> guardians) {
		this.guardians = guardians;
	}

	public String getInstituteCode() {
		return this.instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getOriginalEnrollno() {
		return this.originalEnrollno;
	}
	public void setOriginalEnrollno(String originalEnrollno) {
		this.originalEnrollno = originalEnrollno;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
