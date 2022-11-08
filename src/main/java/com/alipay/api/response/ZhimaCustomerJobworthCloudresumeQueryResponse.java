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
 * @since 1.0, 2022-11-04 18:12:35
 */
public class ZhimaCustomerJobworthCloudresumeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5641757323577435626L;

	/** 
	 * 出身日期
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
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

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
	 * 工作开始日期
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

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
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
