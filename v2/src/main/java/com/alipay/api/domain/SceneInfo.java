package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据回流字段
 *
 * @author auto create
 * @since 1.0, 2022-11-15 11:00:51
 */
public class SceneInfo extends AlipayObject {

	private static final long serialVersionUID = 4326664913745737694L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 企业ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 企业名
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 是否雇主（企业）访问
	 */
	@ApiField("employer_visit")
	private String employerVisit;

	/**
	 * 所属类目（最终归属的行业）
	 */
	@ApiField("job_category")
	private String jobCategory;

	/**
	 * 岗位所属类目及ID
	 */
	@ApiField("job_category_id")
	private String jobCategoryId;

	/**
	 * 岗位ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发生时间的时间戳
	 */
	@ApiField("scene_time")
	private String sceneTime;

	/**
	 * 是否自己访问
	 */
	@ApiField("self_visit")
	private String selfVisit;

	/**
	 * 数据来源，当前分为 zmJobCenter（数据来自工作证招聘场的点击）和 ka(合作商户的数据)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 数据的类型，当前暂时为edu(培训) 和 job(招聘)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployerVisit() {
		return this.employerVisit;
	}
	public void setEmployerVisit(String employerVisit) {
		this.employerVisit = employerVisit;
	}

	public String getJobCategory() {
		return this.jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getJobCategoryId() {
		return this.jobCategoryId;
	}
	public void setJobCategoryId(String jobCategoryId) {
		this.jobCategoryId = jobCategoryId;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneTime() {
		return this.sceneTime;
	}
	public void setSceneTime(String sceneTime) {
		this.sceneTime = sceneTime;
	}

	public String getSelfVisit() {
		return this.selfVisit;
	}
	public void setSelfVisit(String selfVisit) {
		this.selfVisit = selfVisit;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
