package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hzreferralform.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:22
 */
public class AlipayCommerceMedicalHzreferralformDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7579746397396326844L;

	/** 
	 * 患者的年龄，单位“岁”
	 */
	@ApiField("age")
	private Long age;

	/** 
	 * 患者所在地区信息
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 患者身份信息
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 签约医生的手机号
	 */
	@ApiField("doctor_phone_no")
	private String doctorPhoneNo;

	/** 
	 * 医生对于转诊处理的备注
	 */
	@ApiField("doctor_remark")
	private String doctorRemark;

	/** 
	 * 患者期望的就诊时间
	 */
	@ApiField("expected_date")
	private String expectedDate;

	/** 
	 * 患者期望的就诊医院
	 */
	@ApiField("expected_hospital")
	private String expectedHospital;

	/** 
	 * 转诊单的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 转诊单的更新时间
	 */
	@ApiField("gmt_modify")
	private Date gmtModify;

	/** 
	 * 患者拍摄的图片，帮助分析病情
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/** 
	 * 患者过去患病的历史，帮助分析病情
	 */
	@ApiField("pass_history")
	private String passHistory;

	/** 
	 * 患者的手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 转诊单单号，为转诊单表的主键，自动生成，提供给外部使用
	 */
	@ApiField("referral_form_id")
	private String referralFormId;

	/** 
	 * 患者对于就诊的备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 患者的自测量表，用于分析病情
	 */
	@ApiField("scales")
	private String scales;

	/** 
	 * 患者性别信息
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 转诊单的状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 患者对于病情的描述
	 */
	@ApiField("user_description")
	private String userDescription;

	/** 
	 * 患者的姓名信息
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 医生选择的就诊科室
	 */
	@ApiField("visit_department")
	private String visitDepartment;

	/** 
	 * 医生选择的就诊医生
	 */
	@ApiField("visit_doctor")
	private String visitDoctor;

	/** 
	 * 医生选择的就诊医院
	 */
	@ApiField("visit_hospital")
	private String visitHospital;

	/** 
	 * 医生选择的就诊时间
	 */
	@ApiField("visit_time")
	private String visitTime;

	public void setAge(Long age) {
		this.age = age;
	}
	public Long getAge( ) {
		return this.age;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setDoctorPhoneNo(String doctorPhoneNo) {
		this.doctorPhoneNo = doctorPhoneNo;
	}
	public String getDoctorPhoneNo( ) {
		return this.doctorPhoneNo;
	}

	public void setDoctorRemark(String doctorRemark) {
		this.doctorRemark = doctorRemark;
	}
	public String getDoctorRemark( ) {
		return this.doctorRemark;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}
	public String getExpectedDate( ) {
		return this.expectedDate;
	}

	public void setExpectedHospital(String expectedHospital) {
		this.expectedHospital = expectedHospital;
	}
	public String getExpectedHospital( ) {
		return this.expectedHospital;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
	public Date getGmtModify( ) {
		return this.gmtModify;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public List<String> getImageList( ) {
		return this.imageList;
	}

	public void setPassHistory(String passHistory) {
		this.passHistory = passHistory;
	}
	public String getPassHistory( ) {
		return this.passHistory;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

	public void setReferralFormId(String referralFormId) {
		this.referralFormId = referralFormId;
	}
	public String getReferralFormId( ) {
		return this.referralFormId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setScales(String scales) {
		this.scales = scales;
	}
	public String getScales( ) {
		return this.scales;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public String getUserDescription( ) {
		return this.userDescription;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

	public void setVisitDepartment(String visitDepartment) {
		this.visitDepartment = visitDepartment;
	}
	public String getVisitDepartment( ) {
		return this.visitDepartment;
	}

	public void setVisitDoctor(String visitDoctor) {
		this.visitDoctor = visitDoctor;
	}
	public String getVisitDoctor( ) {
		return this.visitDoctor;
	}

	public void setVisitHospital(String visitHospital) {
		this.visitHospital = visitHospital;
	}
	public String getVisitHospital( ) {
		return this.visitHospital;
	}

	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}
	public String getVisitTime( ) {
		return this.visitTime;
	}

}
