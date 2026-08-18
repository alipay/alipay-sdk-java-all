package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学历认证结果
 *
 * @author auto create
 * @since 1.0, 2026-08-06 09:42:49
 */
public class EduOcrResult extends AlipayObject {

	private static final long serialVersionUID = 7865319354365584839L;

	/**
	 * 出生年月日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 证书编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 学历类别
	 */
	@ApiField("edu_category")
	private String eduCategory;

	/**
	 * 教育层次
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 入学日期
	 */
	@ApiField("enroll_date")
	private String enrollDate;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 毕（结）业状态
	 */
	@ApiField("graduate_conclusion")
	private String graduateConclusion;

	/**
	 * 毕（结）业日期
	 */
	@ApiField("graduate_date")
	private String graduateDate;

	/**
	 * 专业
	 */
	@ApiField("major")
	private String major;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校
	 */
	@ApiField("school")
	private String school;

	/**
	 * 学制，一般以“年”为单位
	 */
	@ApiField("study_duration")
	private String studyDuration;

	/**
	 * 培养方式
	 */
	@ApiField("training_mode")
	private String trainingMode;

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

	public String getEduCategory() {
		return this.eduCategory;
	}
	public void setEduCategory(String eduCategory) {
		this.eduCategory = eduCategory;
	}

	public String getEduLevel() {
		return this.eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getEnrollDate() {
		return this.enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGraduateConclusion() {
		return this.graduateConclusion;
	}
	public void setGraduateConclusion(String graduateConclusion) {
		this.graduateConclusion = graduateConclusion;
	}

	public String getGraduateDate() {
		return this.graduateDate;
	}
	public void setGraduateDate(String graduateDate) {
		this.graduateDate = graduateDate;
	}

	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudyDuration() {
		return this.studyDuration;
	}
	public void setStudyDuration(String studyDuration) {
		this.studyDuration = studyDuration;
	}

	public String getTrainingMode() {
		return this.trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}

}
