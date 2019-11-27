package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教师信息修改
 *
 * @author auto create
 * @since 1.0, 2018-11-12 15:33:14
 */
public class AlipayCommerceEducateStaffDetailModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7642814297222899957L;

	/**
	 * 证件号码。调用方根据证件号码更新教职工信息。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,默认为1:
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
	 * 性别（F：女性；M：男性）教工性别， GB/T 2261 性别，0未知，1男，2女，9未说明的性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 机构编码，学籍认证机构编码，可以是官方教育厅、局，也可以是一个学校、教育集团等。
	 */
	@ApiField("institute_code")
	private String instituteCode;

	/**
	 * 职业：10 教师、20 教师兼行政、30 行政 40 教辅 60 工勤 70 校办企业 80 其他工作
	 */
	@ApiField("profession")
	private String profession;

	/**
	 * 学校标识码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 教职工姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 教工编号
	 */
	@ApiField("staff_no")
	private String staffNo;

	/**
	 * 国标规定个人标识码，可为空
	 */
	@ApiField("staff_stdcode")
	private String staffStdcode;

	/**
	 * 在职状态：01 退休 02 离休 03 死亡 04 返聘 05 调出 06 辞职 07 离职 08 开除 09 下落不明 11 在职 12 延聘 13 待退休 14 长病假 15 因公出国 16 停薪留职 17 待岗 99 其他
	 */
	@ApiField("status")
	private String status;

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

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInstituteCode() {
		return this.instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNo() {
		return this.staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffStdcode() {
		return this.staffStdcode;
	}
	public void setStaffStdcode(String staffStdcode) {
		this.staffStdcode = staffStdcode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
