package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 候选人信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:50
 */
public class OpenapiInterviewUserInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8896613737196742378L;

	/**
	 * 候选人教育经历文字描述，限制150字之内
	 */
	@ApiField("user_education_info")
	private String userEducationInfo;

	/**
	 * 候选人邮箱地址
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 候选人手机号
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 候选人姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 候选人工作经历文字描述，限制150字之内
	 */
	@ApiField("user_project_experience")
	private String userProjectExperience;

	/**
	 * 用户简历地址
	 */
	@ApiField("user_resume_url")
	private String userResumeUrl;

	public String getUserEducationInfo() {
		return this.userEducationInfo;
	}
	public void setUserEducationInfo(String userEducationInfo) {
		this.userEducationInfo = userEducationInfo;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserProjectExperience() {
		return this.userProjectExperience;
	}
	public void setUserProjectExperience(String userProjectExperience) {
		this.userProjectExperience = userProjectExperience;
	}

	public String getUserResumeUrl() {
		return this.userResumeUrl;
	}
	public void setUserResumeUrl(String userResumeUrl) {
		this.userResumeUrl = userResumeUrl;
	}

}
