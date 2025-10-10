package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudResumeCertificateInfo;
import com.alipay.api.domain.CloudResumeEducationExperience;
import com.alipay.api.domain.CloudResumeHeadPic;
import com.alipay.api.domain.CloudResumePositionIntention;
import com.alipay.api.domain.CloudResumeSkillInfo;
import com.alipay.api.domain.CloudResumeWorkExperience;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.cloudresume.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-29 11:41:56
 */
public class ZhimaCustomerJobworthCloudresumeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1646244813781159824L;

	/** 
	 * 出生日期
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 证书名称
	 */
	@ApiListField("certificates")
	@ApiField("cloud_resume_certificate_info")
	private List<CloudResumeCertificateInfo> certificates;

	/** 
	 * 教育经历
	 */
	@ApiListField("education_experiences")
	@ApiField("cloud_resume_education_experience")
	private List<CloudResumeEducationExperience> educationExperiences;

	/** 
	 * 用户在芝麻工作证填写的邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 用户的求职状态
	 */
	@ApiField("intention_status")
	private String intentionStatus;

	/** 
	 * 用户在芝麻工作证填写的自我介绍
	 */
	@ApiField("person_desc")
	private String personDesc;

	/** 
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 智能简历头像
	 */
	@ApiField("pic_url")
	private CloudResumeHeadPic picUrl;

	/** 
	 * 求职期望
	 */
	@ApiListField("position_intentions")
	@ApiField("cloud_resume_position_intention")
	private List<CloudResumePositionIntention> positionIntentions;

	/** 
	 * 职业身份
	 */
	@ApiField("position_type")
	private String positionType;

	/** 
	 * 常驻地址
	 */
	@ApiField("residential_area")
	private String residentialArea;

	/** 
	 * 技能信息
	 */
	@ApiListField("skills")
	@ApiField("cloud_resume_skill_info")
	private List<CloudResumeSkillInfo> skills;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 工作经历
	 */
	@ApiListField("work_experiences")
	@ApiField("cloud_resume_work_experience")
	private List<CloudResumeWorkExperience> workExperiences;

	/** 
	 * 工作开始日期（时间戳）
	 */
	@ApiField("work_start_date")
	private Long workStartDate;

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setCertificates(List<CloudResumeCertificateInfo> certificates) {
		this.certificates = certificates;
	}
	public List<CloudResumeCertificateInfo> getCertificates( ) {
		return this.certificates;
	}

	public void setEducationExperiences(List<CloudResumeEducationExperience> educationExperiences) {
		this.educationExperiences = educationExperiences;
	}
	public List<CloudResumeEducationExperience> getEducationExperiences( ) {
		return this.educationExperiences;
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

	public void setIntentionStatus(String intentionStatus) {
		this.intentionStatus = intentionStatus;
	}
	public String getIntentionStatus( ) {
		return this.intentionStatus;
	}

	public void setPersonDesc(String personDesc) {
		this.personDesc = personDesc;
	}
	public String getPersonDesc( ) {
		return this.personDesc;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setPicUrl(CloudResumeHeadPic picUrl) {
		this.picUrl = picUrl;
	}
	public CloudResumeHeadPic getPicUrl( ) {
		return this.picUrl;
	}

	public void setPositionIntentions(List<CloudResumePositionIntention> positionIntentions) {
		this.positionIntentions = positionIntentions;
	}
	public List<CloudResumePositionIntention> getPositionIntentions( ) {
		return this.positionIntentions;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	public String getPositionType( ) {
		return this.positionType;
	}

	public void setResidentialArea(String residentialArea) {
		this.residentialArea = residentialArea;
	}
	public String getResidentialArea( ) {
		return this.residentialArea;
	}

	public void setSkills(List<CloudResumeSkillInfo> skills) {
		this.skills = skills;
	}
	public List<CloudResumeSkillInfo> getSkills( ) {
		return this.skills;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

	public void setWorkExperiences(List<CloudResumeWorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}
	public List<CloudResumeWorkExperience> getWorkExperiences( ) {
		return this.workExperiences;
	}

	public void setWorkStartDate(Long workStartDate) {
		this.workStartDate = workStartDate;
	}
	public Long getWorkStartDate( ) {
		return this.workStartDate;
	}

}
