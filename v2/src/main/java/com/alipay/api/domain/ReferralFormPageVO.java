package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转诊分页实体类
 *
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:20
 */
public class ReferralFormPageVO extends AlipayObject {

	private static final long serialVersionUID = 7296677792746488244L;

	/**
	 * 转诊人的年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 转诊申请人所在的区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 转诊签约医生的身份证号
	 */
	@ApiField("doctor_cert_no")
	private String doctorCertNo;

	/**
	 * 转诊申请的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 转诊申请人的姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 转诊单单号，为转诊单表的主键，自动生成
	 */
	@ApiField("referral_form_id")
	private String referralFormId;

	/**
	 * 转诊申请人的性别
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 转诊单的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 转诊申请人的病情描述
	 */
	@ApiField("user_description")
	private String userDescription;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getDoctorCertNo() {
		return this.doctorCertNo;
	}
	public void setDoctorCertNo(String doctorCertNo) {
		this.doctorCertNo = doctorCertNo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getReferralFormId() {
		return this.referralFormId;
	}
	public void setReferralFormId(String referralFormId) {
		this.referralFormId = referralFormId;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserDescription() {
		return this.userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

}
