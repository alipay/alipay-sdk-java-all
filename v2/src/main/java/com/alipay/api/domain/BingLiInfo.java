package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病历信息
 *
 * @author auto create
 * @since 1.0, 2025-11-18 19:47:41
 */
public class BingLiInfo extends AlipayObject {

	private static final long serialVersionUID = 3514774324972317777L;

	/**
	 * 病历中患者年龄，如23岁、2个月、23天等
	 */
	@ApiField("age")
	private String age;

	/**
	 * 病历中患者出生日期
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 病历中疾病描述
	 */
	@ApiField("disease_detail")
	private String diseaseDetail;

	/**
	 * 病历中患者疾病
	 */
	@ApiField("disease_name")
	private String diseaseName;

	/**
	 * 病历中患者性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 病历中患者姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 病历图片类型
	 */
	@ApiField("report_type")
	private String reportType;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDiseaseDetail() {
		return this.diseaseDetail;
	}
	public void setDiseaseDetail(String diseaseDetail) {
		this.diseaseDetail = diseaseDetail;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
