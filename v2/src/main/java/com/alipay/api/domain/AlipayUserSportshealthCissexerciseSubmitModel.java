package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 体科所自测数据提交
 *
 * @author auto create
 * @since 1.0, 2023-12-18 16:43:15
 */
public class AlipayUserSportshealthCissexerciseSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6663352355159199284L;

	/**
	 * 进行自测时填写的年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 年龄组
	 */
	@ApiField("age_group")
	private String ageGroup;

	/**
	 * 自测日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 自测数据记录
	 */
	@ApiListField("exercise_data")
	@ApiField("ciss_exercise_report_record")
	private List<CissExerciseReportRecord> exerciseData;

	/**
	 * 身份证号码
	 */
	@ApiField("identification_number")
	private String identificationNumber;

	/**
	 * openid
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 性别 1:男 2:女
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 运动指导
	 */
	@ApiListField("sports_guidance")
	@ApiField("ciss_sports_guidance")
	private List<CissSportsGuidance> sportsGuidance;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getAgeGroup() {
		return this.ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public List<CissExerciseReportRecord> getExerciseData() {
		return this.exerciseData;
	}
	public void setExerciseData(List<CissExerciseReportRecord> exerciseData) {
		this.exerciseData = exerciseData;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<CissSportsGuidance> getSportsGuidance() {
		return this.sportsGuidance;
	}
	public void setSportsGuidance(List<CissSportsGuidance> sportsGuidance) {
		this.sportsGuidance = sportsGuidance;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
