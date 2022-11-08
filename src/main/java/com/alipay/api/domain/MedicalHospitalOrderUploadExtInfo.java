package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构医院订单上传接口入参ext_info
 *
 * @author auto create
 * @since 1.0, 2022-03-23 15:31:16
 */
public class MedicalHospitalOrderUploadExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7561592687563727574L;

	/**
	 * 叫号进度页面跳转链接，支付宝小程序链接
	 */
	@ApiField("call_num_url")
	private String callNumUrl;

	/**
	 * 检查项目名称
	 */
	@ApiField("check_item")
	private String checkItem;

	/**
	 * 检查室位置
	 */
	@ApiField("check_loc")
	private String checkLoc;

	/**
	 * 检查室编号
	 */
	@ApiField("check_num")
	private String checkNum;

	/**
	 * 检查注意事项
	 */
	@ApiField("check_precautions")
	private String checkPrecautions;

	/**
	 * 实际检查时间
	 */
	@ApiField("check_time")
	private String checkTime;

	/**
	 * 当前叫号
	 */
	@ApiField("current_num")
	private String currentNum;

	/**
	 * 就诊科室/检查科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 科室位置
	 */
	@ApiField("dept_loc")
	private String deptLoc;

	/**
	 * 诊室编号
	 */
	@ApiField("dept_num")
	private String deptNum;

	/**
	 * 医生名称
	 */
	@ApiField("doctor")
	private String doctor;

	/**
	 * 医生头像url
	 */
	@ApiField("doctor_avatar")
	private String doctorAvatar;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生职级
	 */
	@ApiField("doctor_rank")
	private String doctorRank;

	/**
	 * 预计等待时间（分）
	 */
	@ApiField("expected_waiting_time")
	private Long expectedWaitingTime;

	/**
	 * 医院名称
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 医院ID类型
医保局- 1
卫健委- 2
	 */
	@ApiField("hospital_id_type")
	private String hospitalIdType;

	/**
	 * 医院登记号(
卫健登记号或国标编码)
	 */
	@ApiField("hospital_register_id")
	private String hospitalRegisterId;

	/**
	 * 就诊/检查序号
	 */
	@ApiField("medical_num")
	private String medicalNum;

	/**
	 * 就诊单id
	 */
	@ApiField("medical_order_id")
	private String medicalOrderId;

	/**
	 * 订单链接，支付宝小程序链接
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 导航地址页面跳转链接，支付宝小程序链接
	 */
	@ApiField("navigation")
	private String navigation;

	/**
	 * 就诊人
	 */
	@ApiField("patient")
	private String patient;

	/**
	 * 查看报告链接，支付宝小程序链接
	 */
	@ApiField("report_url")
	private String reportUrl;

	/**
	 * 预约时间
	 */
	@ApiField("scheduled_time")
	private String scheduledTime;

	/**
	 * 取药地址
	 */
	@ApiField("take_medicine_loc")
	private String takeMedicineLoc;

	/**
	 * 取药导航链接，支付宝小程序链接
	 */
	@ApiField("take_medicine_url")
	private String takeMedicineUrl;

	/**
	 * 取号密码页面跳转链接，支付宝小程序链接
	 */
	@ApiField("take_num_password")
	private String takeNumPassword;

	/**
	 * 取号入口页面跳转链接，支付宝小程序链接
	 */
	@ApiField("take_num_url")
	private String takeNumUrl;

	/**
	 * 证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 证件类型，01代表身份证，当前只支持身份证
	 */
	@ApiField("user_card_type")
	private String userCardType;

	/**
	 * 前方等待人数
	 */
	@ApiField("waiting_num")
	private Long waitingNum;

	public String getCallNumUrl() {
		return this.callNumUrl;
	}
	public void setCallNumUrl(String callNumUrl) {
		this.callNumUrl = callNumUrl;
	}

	public String getCheckItem() {
		return this.checkItem;
	}
	public void setCheckItem(String checkItem) {
		this.checkItem = checkItem;
	}

	public String getCheckLoc() {
		return this.checkLoc;
	}
	public void setCheckLoc(String checkLoc) {
		this.checkLoc = checkLoc;
	}

	public String getCheckNum() {
		return this.checkNum;
	}
	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}

	public String getCheckPrecautions() {
		return this.checkPrecautions;
	}
	public void setCheckPrecautions(String checkPrecautions) {
		this.checkPrecautions = checkPrecautions;
	}

	public String getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(String currentNum) {
		this.currentNum = currentNum;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDeptLoc() {
		return this.deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getDeptNum() {
		return this.deptNum;
	}
	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public String getDoctor() {
		return this.doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDoctorAvatar() {
		return this.doctorAvatar;
	}
	public void setDoctorAvatar(String doctorAvatar) {
		this.doctorAvatar = doctorAvatar;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorRank() {
		return this.doctorRank;
	}
	public void setDoctorRank(String doctorRank) {
		this.doctorRank = doctorRank;
	}

	public Long getExpectedWaitingTime() {
		return this.expectedWaitingTime;
	}
	public void setExpectedWaitingTime(Long expectedWaitingTime) {
		this.expectedWaitingTime = expectedWaitingTime;
	}

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHospitalIdType() {
		return this.hospitalIdType;
	}
	public void setHospitalIdType(String hospitalIdType) {
		this.hospitalIdType = hospitalIdType;
	}

	public String getHospitalRegisterId() {
		return this.hospitalRegisterId;
	}
	public void setHospitalRegisterId(String hospitalRegisterId) {
		this.hospitalRegisterId = hospitalRegisterId;
	}

	public String getMedicalNum() {
		return this.medicalNum;
	}
	public void setMedicalNum(String medicalNum) {
		this.medicalNum = medicalNum;
	}

	public String getMedicalOrderId() {
		return this.medicalOrderId;
	}
	public void setMedicalOrderId(String medicalOrderId) {
		this.medicalOrderId = medicalOrderId;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getNavigation() {
		return this.navigation;
	}
	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public String getPatient() {
		return this.patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getReportUrl() {
		return this.reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}

	public String getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getTakeMedicineLoc() {
		return this.takeMedicineLoc;
	}
	public void setTakeMedicineLoc(String takeMedicineLoc) {
		this.takeMedicineLoc = takeMedicineLoc;
	}

	public String getTakeMedicineUrl() {
		return this.takeMedicineUrl;
	}
	public void setTakeMedicineUrl(String takeMedicineUrl) {
		this.takeMedicineUrl = takeMedicineUrl;
	}

	public String getTakeNumPassword() {
		return this.takeNumPassword;
	}
	public void setTakeNumPassword(String takeNumPassword) {
		this.takeNumPassword = takeNumPassword;
	}

	public String getTakeNumUrl() {
		return this.takeNumUrl;
	}
	public void setTakeNumUrl(String takeNumUrl) {
		this.takeNumUrl = takeNumUrl;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

	public Long getWaitingNum() {
		return this.waitingNum;
	}
	public void setWaitingNum(Long waitingNum) {
		this.waitingNum = waitingNum;
	}

}
