package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁健康用户医生签约状态数据同步
 *
 * @author auto create
 * @since 1.0, 2026-01-05 10:12:42
 */
public class AlipayCommerceMedicalUserHomedoctorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5195778443577646375L;

	/**
	 * 蚂蚁健康用户的openId
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 签约医生的身份证号
	 */
	@ApiField("doctor_cert_no")
	private String doctorCertNo;

	/**
	 * 医生身份证号加密值
	 */
	@ApiField("doctor_cert_no_encrypt")
	private String doctorCertNoEncrypt;

	/**
	 * 签约医生团队
	 */
	@ApiField("doctor_group")
	private String doctorGroup;

	/**
	 * 医生的唯一ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 签约医生机构
	 */
	@ApiField("doctor_organization")
	private String doctorOrganization;

	/**
	 * 签约医生机构id
	 */
	@ApiField("doctor_organization_id")
	private String doctorOrganizationId;

	/**
	 * 签约医生的真实姓名
	 */
	@ApiField("doctor_real_name")
	private String doctorRealName;

	/**
	 * 医生真实姓名的加密值
	 */
	@ApiField("doctor_real_name_encrypt")
	private String doctorRealNameEncrypt;

	/**
	 * 加密类型
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 签约的唯一流水号
	 */
	@ApiField("sign_biz_id")
	private String signBizId;

	/**
	 * 签约对象类型，由支付宝分配给服务商
	 */
	@ApiField("sign_biz_type")
	private String signBizType;

	/**
	 * 用户签约结束日期
	 */
	@ApiField("sign_end_date")
	private Date signEndDate;

	/**
	 * 用户签约开始日期
	 */
	@ApiField("sign_start_date")
	private Date signStartDate;

	/**
	 * 签约来源，拉起签约页面时URL上会自动带上参数appSource，签约状态通知支付宝时需要使用签约页面URL上的appSource字段
	 */
	@ApiField("source")
	private String source;

	/**
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户身份证号
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 用户的身份证号加密值
	 */
	@ApiField("user_cert_no_encrypt")
	private String userCertNoEncrypt;

	/**
	 * 用户真实姓名
	 */
	@ApiField("user_real_name")
	private String userRealName;

	/**
	 * 用户真实姓名的加密值
	 */
	@ApiField("user_real_name_encrypt")
	private String userRealNameEncrypt;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getDoctorCertNo() {
		return this.doctorCertNo;
	}
	public void setDoctorCertNo(String doctorCertNo) {
		this.doctorCertNo = doctorCertNo;
	}

	public String getDoctorCertNoEncrypt() {
		return this.doctorCertNoEncrypt;
	}
	public void setDoctorCertNoEncrypt(String doctorCertNoEncrypt) {
		this.doctorCertNoEncrypt = doctorCertNoEncrypt;
	}

	public String getDoctorGroup() {
		return this.doctorGroup;
	}
	public void setDoctorGroup(String doctorGroup) {
		this.doctorGroup = doctorGroup;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorOrganization() {
		return this.doctorOrganization;
	}
	public void setDoctorOrganization(String doctorOrganization) {
		this.doctorOrganization = doctorOrganization;
	}

	public String getDoctorOrganizationId() {
		return this.doctorOrganizationId;
	}
	public void setDoctorOrganizationId(String doctorOrganizationId) {
		this.doctorOrganizationId = doctorOrganizationId;
	}

	public String getDoctorRealName() {
		return this.doctorRealName;
	}
	public void setDoctorRealName(String doctorRealName) {
		this.doctorRealName = doctorRealName;
	}

	public String getDoctorRealNameEncrypt() {
		return this.doctorRealNameEncrypt;
	}
	public void setDoctorRealNameEncrypt(String doctorRealNameEncrypt) {
		this.doctorRealNameEncrypt = doctorRealNameEncrypt;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getSignBizId() {
		return this.signBizId;
	}
	public void setSignBizId(String signBizId) {
		this.signBizId = signBizId;
	}

	public String getSignBizType() {
		return this.signBizType;
	}
	public void setSignBizType(String signBizType) {
		this.signBizType = signBizType;
	}

	public Date getSignEndDate() {
		return this.signEndDate;
	}
	public void setSignEndDate(Date signEndDate) {
		this.signEndDate = signEndDate;
	}

	public Date getSignStartDate() {
		return this.signStartDate;
	}
	public void setSignStartDate(Date signStartDate) {
		this.signStartDate = signStartDate;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserCertNoEncrypt() {
		return this.userCertNoEncrypt;
	}
	public void setUserCertNoEncrypt(String userCertNoEncrypt) {
		this.userCertNoEncrypt = userCertNoEncrypt;
	}

	public String getUserRealName() {
		return this.userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public String getUserRealNameEncrypt() {
		return this.userRealNameEncrypt;
	}
	public void setUserRealNameEncrypt(String userRealNameEncrypt) {
		this.userRealNameEncrypt = userRealNameEncrypt;
	}

}
