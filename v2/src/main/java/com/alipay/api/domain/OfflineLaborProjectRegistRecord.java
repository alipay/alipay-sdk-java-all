package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:47:40
 */
public class OfflineLaborProjectRegistRecord extends AlipayObject {

	private static final long serialVersionUID = 6218656551925935525L;

	/**
	 * 用户支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 支付宝记录号
	 */
	@ApiField("alipay_register_id")
	private String alipayRegisterId;

	/**
	 * 用户出生年月份
	 */
	@ApiField("birth_date")
	private String birthDate;

	/**
	 * 用户实名认证状态
	 */
	@ApiField("certified")
	private Boolean certified;

	/**
	 * 人脸核验状态
	 */
	@ApiField("face_auth_status")
	private Boolean faceAuthStatus;

	/**
	 * 用户性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 健康证状态
	 */
	@ApiField("health_cert")
	private String healthCert;

	/**
	 * 用户身份证
	 */
	@ApiField("id_card_number")
	private String idCardNumber;

	/**
	 * 岗位名
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 用户userId 映射 openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部登记号 当前字段已废弃(字段名称调整,新增 out_register_id 字段替代)
	 */
	@ApiField("out_regist_id")
	@Deprecated
	private String outRegistId;

	/**
	 * 外部登记号
	 */
	@ApiField("out_register_id")
	private String outRegisterId;

	/**
	 * 外部登记号 当前字段已废弃(字段名称调整,新增 out_register_id 字段替代)
	 */
	@ApiField("out_register_no")
	@Deprecated
	private String outRegisterNo;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 项目名
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 用户报名登记时间
	 */
	@ApiField("register_time")
	private String registerTime;

	/**
	 * 社会风险信息
	 */
	@ApiField("social_risk_info")
	private Boolean socialRiskInfo;

	/**
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayRegisterId() {
		return this.alipayRegisterId;
	}
	public void setAlipayRegisterId(String alipayRegisterId) {
		this.alipayRegisterId = alipayRegisterId;
	}

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Boolean getCertified() {
		return this.certified;
	}
	public void setCertified(Boolean certified) {
		this.certified = certified;
	}

	public Boolean getFaceAuthStatus() {
		return this.faceAuthStatus;
	}
	public void setFaceAuthStatus(Boolean faceAuthStatus) {
		this.faceAuthStatus = faceAuthStatus;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHealthCert() {
		return this.healthCert;
	}
	public void setHealthCert(String healthCert) {
		this.healthCert = healthCert;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
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

	public String getOutRegistId() {
		return this.outRegistId;
	}
	public void setOutRegistId(String outRegistId) {
		this.outRegistId = outRegistId;
	}

	public String getOutRegisterId() {
		return this.outRegisterId;
	}
	public void setOutRegisterId(String outRegisterId) {
		this.outRegisterId = outRegisterId;
	}

	public String getOutRegisterNo() {
		return this.outRegisterNo;
	}
	public void setOutRegisterNo(String outRegisterNo) {
		this.outRegisterNo = outRegisterNo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public Boolean getSocialRiskInfo() {
		return this.socialRiskInfo;
	}
	public void setSocialRiskInfo(Boolean socialRiskInfo) {
		this.socialRiskInfo = socialRiskInfo;
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
