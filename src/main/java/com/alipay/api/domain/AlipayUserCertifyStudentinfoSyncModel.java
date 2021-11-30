package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步学生认证数据
 *
 * @author auto create
 * @since 1.0, 2018-06-27 15:36:09
 */
public class AlipayUserCertifyStudentinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6297856392428219337L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 教育层次
	 */
	@ApiField("education_level")
	private String educationLevel;

	/**
	 * 入学日期
	 */
	@ApiField("entry_date")
	private String entryDate;

	/**
	 * 预期毕业日期
	 */
	@ApiField("graduation_date")
	private String graduationDate;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEducationLevel() {
		return this.educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEntryDate() {
		return this.entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getGraduationDate() {
		return this.graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
