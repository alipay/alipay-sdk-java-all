package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证信息匹配度查询条件
 *
 * @author auto create
 * @since 1.0, 2022-11-15 14:47:14
 */
public class JobworthAdapter extends AlipayObject {

	private static final long serialVersionUID = 2245463225218783272L;

	/**
	 * 两个数字 使用英文逗号隔开，-1代表没要求。eg:18,35表示18岁到35岁，-1,40表示40岁以下
	 */
	@ApiField("age")
	private String age;

	/**
	 * cityCode 要求使用的高德cityCode
	 */
	@ApiField("city")
	private String city;

	/**
	 * 学历，可以用以下字段IGHSCHOOL_AND_BELOW（高中及以下），POLYTECHNIC（中专），COLLEGE（大专），BACHELOR（本科），MASTER（硕士），DOCTOR_AND_ABOVE（博士及以上）
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 性别，男或者女， 要求这2个汉字二选一，如果没有要求，这个字段可以不填写
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 推荐次数
	 */
	@ApiField("recommend")
	private String recommend;

	/**
	 * 要求的技能证书
	 */
	@ApiField("skill_certificate")
	private String skillCertificate;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getEduLevel() {
		return this.eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRecommend() {
		return this.recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getSkillCertificate() {
		return this.skillCertificate;
	}
	public void setSkillCertificate(String skillCertificate) {
		this.skillCertificate = skillCertificate;
	}

}
