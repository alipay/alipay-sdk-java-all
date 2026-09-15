package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 候选人基本信息
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class BasicInfo extends AlipayObject {

	private static final long serialVersionUID = 2832376822825237166L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 面试完成时间
	 */
	@ApiField("completed_time")
	private String completedTime;

	/**
	 * 完成方式
	 */
	@ApiField("completed_type")
	private String completedType;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 面试时长（秒）
	 */
	@ApiField("interview_duration")
	private String interviewDuration;

	/**
	 * 候选人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 岗位名称
	 */
	@ApiField("position_name")
	private String positionName;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getCompletedTime() {
		return this.completedTime;
	}
	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}

	public String getCompletedType() {
		return this.completedType;
	}
	public void setCompletedType(String completedType) {
		this.completedType = completedType;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getInterviewDuration() {
		return this.interviewDuration;
	}
	public void setInterviewDuration(String interviewDuration) {
		this.interviewDuration = interviewDuration;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPositionName() {
		return this.positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}
