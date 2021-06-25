package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学分银行用户培训经历数据模型
 *
 * @author auto create
 * @since 1.0, 2020-12-09 22:22:35
 */
public class CreditBankTraining extends AlipayObject {

	private static final long serialVersionUID = 5119135417229394683L;

	/**
	 * 获取时间，格式yyyy-mm-dd HH:mm:ss
	 */
	@ApiField("experience_time")
	private Date experienceTime;

	/**
	 * 是否有证，枚举1是2否
	 */
	@ApiField("have_project_certificate")
	private Long haveProjectCertificate;

	/**
	 * 办学机构
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 培训id
	 */
	@ApiField("training_outer_id")
	private String trainingOuterId;

	public Date getExperienceTime() {
		return this.experienceTime;
	}
	public void setExperienceTime(Date experienceTime) {
		this.experienceTime = experienceTime;
	}

	public Long getHaveProjectCertificate() {
		return this.haveProjectCertificate;
	}
	public void setHaveProjectCertificate(Long haveProjectCertificate) {
		this.haveProjectCertificate = haveProjectCertificate;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTrainingOuterId() {
		return this.trainingOuterId;
	}
	public void setTrainingOuterId(String trainingOuterId) {
		this.trainingOuterId = trainingOuterId;
	}

}
